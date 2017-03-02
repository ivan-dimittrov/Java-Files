import java.io.File;
import java.io.IOException;


public class _01_CreatingFiles {

	public static void main(String[] args) {
		
		//Creating directory
		File dir = new File("Files");
		if (dir.mkdir()) {
			System.out.println("Directory " + dir.getName() + " is created");
		}else {
			System.out.println("The directory " + dir.getName() + " already exists");
		}
		
		//Creating txt files
		File f1 = new File("Files/FileOne.txt");
		File f2 = new File("Files/FileTwo.txt");
		try {
			f1.createNewFile();
			f2.createNewFile();
		} catch (IOException e) {
			System.out.println("Error with creating the files: " + e.getMessage());
		}
		// List files in folder
		System.out.println("----------------------------------");
		for (File f : dir.listFiles()) {
			System.out.println(f.getName());
		}
	}

}
