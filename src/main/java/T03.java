import java.sql.Array;
import java.util.*;

public class T03 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter numbers :");

        Scanner input = new Scanner(System.in);

        for ( String numbers1 :  input.nextLine().trim().split(" ") ){
            numbers.add(Integer.valueOf(numbers1));
        }

        System.out.println(correctArray(numbers));

    }

    public static List<Integer> correctArray(List<Integer> numbers){

        if (numbers.size()%2 == 1) numbers.remove(numbers.size() - 1);

        for (int i = 0 ; i < numbers.size() ; ) {
            if (numbers.get(i) > numbers.get(i+1)) {
                numbers.remove(i) ;
                numbers.remove(i) ;
            }else{
                i = i + 2 ;
            }
        }

        return numbers ;

    }

}
