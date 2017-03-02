import java.io.*;
public class FileSearcher {

	public void search(String path, String nameOfFile){
		
		File root = new File(path);
		File[] listOfFiles = root.listFiles();
		
		if (listOfFiles == null){
			return;
		}
		
		for (File file : listOfFiles) {
			if (file.isDirectory()) {
				search(file.getAbsolutePath(), nameOfFile);
			} else {
				if (file.getName().equals(nameOfFile)) {
					System.out.println(file.getAbsolutePath());
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		FileSearcher searcher = new FileSearcher();
		searcher.search("C:\\Users\\Ivan\\workspace", "Demo.java");
	}
}
