import java.util.HashMap;
import java.util.Map;

public class T04 {

    public static void main(String[] args) {

        Map<Integer , String> hashmap = new HashMap<>();


    }

}

class HashMap1 {
    int i = 0;
    Map<Integer , Object> hashmap = new HashMap<>();


    public void put(Object object){
        hashmap.put( i , object ) ;
        i++ ;
    }

    public boolean ifKey(int key){
        return hashmap.containsKey(key);
    }

    public boolean isEmpty(){
        return hashmap.isEmpty();
    }


}
