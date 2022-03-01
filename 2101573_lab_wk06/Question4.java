package Lab6;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        HashMap<Integer, Integer> hashMap = new HashMap();
        hashMap.put(0, 1);
        hashMap.put(1, 3);
        hashMap.put(2, 5);
        hashMap.put(3, 7);
        hashMap.put(4, 9);
        hashMap.put(5, 11);

        System.out.println("Input value to add to list: ");
        int newNum = userInput.nextInt();

        System.out.println("Original list: " + hashMap.values());
        addAndSort(hashMap, newNum);
    }
    public static void  addAndSort(HashMap hashMap, int value) {
        hashMap.put(hashMap.size(), value);
        System.out.println("New list: ");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
//    public static void addAndSort(HashMap hashMap, int value) {
//        hashMap.put(hashMap.size(), value);
//        ArrayList<Integer> arr = new ArrayList<>(hashMap.values());
//        arr.sort((a,b)-> a.compareTo(b));
//        for (int i = 0; i < hashMap.size(); i++) {
//            hashMap.put(i, arr.get(i));
//        }
//    }
}
