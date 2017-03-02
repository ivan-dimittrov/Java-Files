import java.io.*;

public class _06_ComparingPictures {

	public static void main(String[] args) {

		File pic1 = new File("Files/JAVA.png");
		File pic2 = new File("Files/JAVA2.png");
		System.out.println(arePicsEqual(pic1, pic2));
	
	}
	
	private static boolean arePicsEqual(File a, File b){
		boolean equal = false;
		try (FileInputStream is = new FileInputStream(a);
				 FileInputStream is2 = new FileInputStream(b)) {
				
				int temp1 = 0;
				int temp2 = 0;
				
				while (temp1 != -1 || temp2 != -1) {
					if (temp1 != temp2){
						return equal;
					}
					temp1 = is.read();
					temp2 = is2.read();
				}
				equal = true;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		return equal;
	}
}
