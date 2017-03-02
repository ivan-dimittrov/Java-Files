import java.io.*;
import java.util.Scanner;
public class _03_ReadingDataFromFiles {

	public static void main(String[] args) {
		
		File f1 = new File("Files/FileOne.txt");
		//Reading data from file with Byte Stream
		try(FileInputStream is = new FileInputStream(f1)) {
			int letter = 0;
			while (true) {
				letter = is.read();
				if (letter == -1) {
					break;
				}
				System.out.print((char)letter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		File f2 = new File("Files/FileTwo.txt");
		//Reading data from file with Character Stream
		try(FileReader fr = new FileReader(f2)) {
			int letter = 0;
			while ((letter = fr.read()) != -1) {
				System.out.print((char)letter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------------------");
		
		//Reading data from file with Scanner
		File f3 = new File("Files/FileThree.txt");
		try (Scanner sc = new Scanner(f3)){
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------------------");
		
		//Reading data from file with BufferedReader
		File names = new File("Files/Names.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(names))) {
			String name = "";
			while ((name = br.readLine()) != null) {
				System.out.println(name);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
