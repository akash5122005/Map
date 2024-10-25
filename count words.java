import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine().toLowerCase();

        if(sentence.isEmpty()){
            System.out.println("Word frequencies: ");
            System.out.println("No words found.");
            scanner.close();
            return;
        }

        String[] words = sentence.replaceAll("[^a-zA-Z\\s]","").split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words){
            if(!word.isEmpty()){
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            
            }
        }
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
        Collections.sort(wordList, (a, b) -> {
            if(!a.getValue().equals(b.getValue())){
                return a.getValue() - b.getValue();
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });

        System.out.println("Word frequencies:");
        for(Map.Entry<String, Integer> entry : wordList){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
