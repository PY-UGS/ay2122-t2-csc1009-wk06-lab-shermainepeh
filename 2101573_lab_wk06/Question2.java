package Lab6;

import java.util.LinkedList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        LinkedList intList = new LinkedList();
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(7);
        intList.add(9);
        intList.add(11);
        System.out.println("Original list:" + intList);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter index 1: ");
        int indexOne = userInput.nextInt();
        System.out.println("Enter index 2: ");
        int indexTwo = userInput.nextInt();


        if(indexOne == indexTwo) {
            System.out.println("Unable to swap same index");
        } else if(indexOne >= 0 && indexTwo >=0 && indexOne < intList.size() && indexTwo < intList.size()) {
            swapValues(intList, indexOne, indexTwo);
            System.out.println("New List: " + intList);
        } else {
            System.out.println("Error");
        }
    }
    public static void swapValues(LinkedList list, int indexOne, int indexTwo) {
        int value1 = (int) list.get(indexOne);
        int value2 = (int) list.get(indexTwo);

        list.set(indexOne, value2);
        list.set(indexTwo, value1);
    }
}
