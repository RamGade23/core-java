package collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Create LinkedList
        LinkedList<Integer> l1 = new LinkedList<>();

        //Add elements
        l1.add(2);
        l1.add(1);
        l1.add(6);
        l1.add(5);
        l1.add(8);
        l1.add(8);

        //print the list
        System.out.println("l1 : " + l1);

        //Replace an element at position 2
        l1.set(2, 10);
        System.out.println("l1 after set : " + l1); //[2, 1, 10, 5, 8]

        LinkedList l2 = new LinkedList(); //[13, 14, 12]
        l2.add(13);
        l2.add(14);
        l2.add(12);
        System.out.println("l2 : " + l2);

        //merge two lists
        l2.addAll(l1);
        System.out.println("l2 after adding l1 : " + l2);

        l1.addFirst(11);
        System.out.println("l1 after addFirst(11): " + l1);

        l1.addLast(20);
        System.out.println("l1 after addLast(20): " + l1);

        l2.clear();
        System.out.println("l2 after clear() : " + l2);

        l2.addAll(l1);
        System.out.println("l2 after addAll(l1) : " + l2);

        System.out.println("l1.contains(21) : " + l1.contains(21));
        System.out.println("l2.contains(21) : " + l1.contains(21));

        System.out.println(l1.remove(2));
        System.out.println("l1 after remove(2) : " + l1);

        System.out.println(l1.remove(new Integer(11)));
        System.out.println("l1 after remove(new Interger(11)) : " + l1);

        //Print even numbers
        for (int num : l1) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
        //Remove odd numbers from the list
        LinkedList<Integer> evenNum = new LinkedList<>();
        for (int num : l1) {
            if (num % 2 == 0) {
                evenNum.add(num);
            }
        }
        System.out.println("new List evenNum : " + evenNum);

        System.out.println("--------------------------------------");
        LinkedList<Integer> l4 = new LinkedList<>();
        l4.add(50);
        l4.add(10);
        l4.add(60);
        l4.add(30);
        System.out.println("l4 : " + l4);
        l4.removeFirst();
        System.out.println("l4 removeFirst() : " + l4);

        l4.removeLast();
        System.out.println("l4 removeLast() : " + l4);

    }
}
