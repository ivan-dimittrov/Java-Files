package objectStream;

import java.io.*;

public class Demo {

	public static void main(String[] args) {

		File person = new File("Files/Person.txt");
		Person ivan = new Person("Ivan", 21, true);
		
		try {
			person.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Saving the object
		try (FileOutputStream os = new FileOutputStream(person);
				ObjectOutputStream objectStream = new ObjectOutputStream(os)) {
			objectStream.writeObject(ivan);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Loading the object
		File f = new File("Files/Person.txt");
		try (FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p = (Person) ois.readObject();
			System.out.println(p.getName());

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
