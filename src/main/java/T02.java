import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class T02 {

    public static void main(String[] args) {

        Set<Character> characters = new TreeSet<>();

        Set<Character> characters1 = new TreeSet<>();

        Random random = new Random();

        while(characters.size()!=10)
            characters.add((char) ( random.nextInt(26) + 'a' ) );

        while(characters1.size()!=10)
            characters1.add((char) (random.nextInt(26) + 'a' ) );

        System.out.println(characters);

        System.out.println(characters1);

        System.out.println(union(characters, characters1));

        System.out.println(common(characters , characters1));

    }

    public static Set<Character> union ( Set<Character> characters , Set<Character> characters1 ){

        Set<Character> union = new TreeSet<>();

        union.addAll(characters);

        union.addAll(characters1);

        return union;

    }

    public static Set<Character> common ( Set<Character> characters , Set<Character> characters1 ){

        Set<Character> common = new TreeSet<>();

        common.addAll(characters);

        common.retainAll(characters1);

        return  common ;

    }


}
