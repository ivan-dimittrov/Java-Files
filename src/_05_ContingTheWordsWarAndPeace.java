import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_ContingTheWordsWarAndPeace {

	public static void main(String[] args) {
		File file = new File("Files/war-peace.txt");
		String war = "War";
		String peace = "Peace";

		try (Scanner sc = new Scanner(file)) {
			HashMap<String, Integer> map = new HashMap<>();
			String word = "";
			
			while (sc.hasNext()) {
				word = sc.next().toLowerCase();

				if (word.equals("war") || word.equals("war.")
						|| word.equals("war,")) {
					if (!map.containsKey(war)) {
						map.put(war, 1);
					} else {
						map.put(war, map.get(war) + 1);
					}
				}

				if (word.equals("peace") || word.equals("peace.")
						|| word.equals("peace,")) {
					if (!map.containsKey(peace)) {
						map.put(peace, 1);
					} else {
						map.put(peace, map.get(peace) + 1);
					}
				}
			}

			for (Map.Entry<String, Integer> result : map.entrySet()) {
				System.out.println(result.getKey() + " -> " + result.getValue());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
