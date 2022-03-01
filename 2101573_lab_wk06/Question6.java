package Lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Question6 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        Random rand = new Random();

        for (int i = 0; i < 500; i++){
            hashMap.put(i, rand.nextInt(1000, 9999));
        }

        int anotherInt = rand.nextInt(1000, 9999);

        System.out.println("Find: " + anotherInt);
        System.out.println(hashMap.values());
        System.out.println("Result: " + findValue(hashMap, anotherInt));
    }
    public static int findValue (HashMap hashMap, int searchVal){
        ArrayList<Integer> arr = new ArrayList<>(hashMap.values());
        for (int i = 0; i < hashMap.size(); i++) {
            if(searchVal == arr.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
