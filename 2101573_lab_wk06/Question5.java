package Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        hashMap.put(0, 1);
        hashMap.put(1, 3);
        hashMap.put(2, 5);
        hashMap.put(3, 7);
        hashMap.put(4, 9);
        hashMap.put(5, 11);

        System.out.println("Original List: " + hashMap.values());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter index 1 ");
        int indexOne = userInput.nextInt();
        System.out.println("Enter index 2 ");
        int indexTwo = userInput.nextInt();


        if(indexOne == indexTwo) {
            System.out.println("Unable to swap same index");
        } else if(indexOne >= 0 && indexTwo >=0 && indexOne < hashMap.size() && indexTwo < hashMap.size()) {
            swapValues(hashMap, indexOne, indexTwo);
            System.out.println("New list: " + hashMap.values());
        } else {
            System.out.println("Error");
        }
    }
    public static void swapValues(HashMap<Integer, Integer> hashMap, int indexOne, int indexTwo) {
        int value1 = hashMap.get(indexOne);
        int value2 = hashMap.get(indexTwo);

        hashMap.put(indexOne, value2);
        hashMap.put(indexTwo, value1);
    }
}