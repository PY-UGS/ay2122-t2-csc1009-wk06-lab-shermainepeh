package Lab6;

import java.util.LinkedList;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 500; i++){
            list.add(rand.nextInt(1000, 9999));
        }

        int anotherInt = rand.nextInt(1000, 9999);

        System.out.println("Find: " + anotherInt);
        System.out.println(list);
        System.out.println("Result: " + findValue(list, anotherInt));
    }
    public static int findValue (LinkedList<Integer> list, int searchVal){
        for (int i = 0; i < list.size(); i++) {
            if(searchVal == list.get(i)) {
                return i;
            }
        }
        return -1;
    }
}
