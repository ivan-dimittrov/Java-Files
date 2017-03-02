import java.io.*;
import java.util.TreeSet;

public class _07_SortingNamesFromFile {
	
	//Sorting names from file and writing them into another file
	public static void main(String[] args) {
		
		File names = new File("Files/Names.txt");
		TreeSet<String> sortedNames = new TreeSet<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(names))) {
			String name = "";
			while ((name = br.readLine()) != null) {
				sortedNames.add(name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File namesSorted = new File("Files/SortedNames.txt");
		try {
			namesSorted.createNewFile();
		} catch (IOException e) {
			System.out.println("Error with creating the file");
		}
		
		try (FileWriter fw = new FileWriter(namesSorted)){
			for (String name : sortedNames) {
				fw.write(name);
				fw.write("\r\n");// new line
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
