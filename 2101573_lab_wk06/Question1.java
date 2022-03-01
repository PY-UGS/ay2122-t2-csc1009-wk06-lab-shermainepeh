package Lab6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        LinkedList<Integer> intList = new LinkedList();
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(7);
        intList.add(9);
        intList.add(11);

        System.out.println("Input value to add to list: ");
        int newNum = userInput.nextInt();

        System.out.println("Original list: " + intList);
        addAndSort(intList, newNum);
        System.out.println("New list: " + intList);
    }

    public static void  addAndSort(LinkedList<Integer> list, int value) {
        list.add(value);
        Collections.sort(list);
    }

    /* Can't add to list */
//    public static void  addAndSort(LinkedList<Integer> list, int value) {
//        for (int i = 0; i < list.size(); i++) {
//            if (value < list.get(i)) {
//                list.add(i, value);
//                break;
//            }
//        }
//    }
}
