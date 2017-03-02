import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class _02_WritingDataInFiles {

	public static void main(String[] args) {
		
		File f1 = new File("Files/FileOne.txt");
		//Writing with byte stream
		try(FileOutputStream os = new FileOutputStream(f1)) {// try with resources
			os.write('H');
			os.write('E');
			os.write('L');
			os.write('L');
			os.write('O');
			
		} catch (FileNotFoundException e) {
			System.out.println("No such file...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f2 = new File("Files/Filetwo.txt");
		//Writing with Character stream
		try(FileWriter writer = new FileWriter(f2)) {
			for (int i = 0; i < 3; i++) {
				writer.write("Hello World");
				writer.write("\r\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f3 = new File("Files/Filethree.txt");
		//Writing with PrintStream
		try(PrintStream stream = new PrintStream(f3)){
			for (int i = 0; i < 5; i++) {
				stream.print("Hello PrintStream ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
