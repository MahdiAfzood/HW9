import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class T01 {

    public static void main(String[] args) {

        HashMap<Integer, Character> word = new HashMap<>();

        System.out.println("Please enter desired word : ");

        Scanner input = new Scanner(System.in);

        char[] values = input.next().toCharArray();

        for (int index = 0; index < values.length; index++) {
            word.put(index, values[index]);
        }

        System.out.println(word);

        ArrayList<String> sentences = new ArrayList<>();

        for (int i = 0; i < word.size(); i++) {
            for (int j = 0 ; j < word.size(); j++) {

                char temp = word.get(i);

                word.replace(i, word.get(i), word.get(j));
                word.replace(j, word.get(j), temp);

                String words = "";

                for (char words1: word.values()) {
                    char words2 = words1;
                    words += words2 + " ";
                }
                if (!sentences.contains(words)) sentences.add(words) ;
            }
        }
        System.out.println(sentences);
    }
}
