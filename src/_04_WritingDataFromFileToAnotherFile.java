import java.io.*;
public class _04_WritingDataFromFileToAnotherFile {

	public static void main(String[] args) {
		
		File f1 = new File("Files/FileThree.txt");
		File f2 = new File("Files/FileFour.txt");
		
		try (FileReader fr = new FileReader(f1);
			 FileWriter fw = new FileWriter(f2)){
			
			int letter = 0;
			
			while (true) {
				letter = fr.read();
				if (letter == -1) {
					break;
				}
				fw.write(letter);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
