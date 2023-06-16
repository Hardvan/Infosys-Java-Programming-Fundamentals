package CollectionsFramework.ListPractice;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        doArrayList();
        doLinkedList();
    }

    public static void doArrayList() {
        System.out.println("ARRAY LIST");
        System.out.println("--------------------");

        List<String> arrList = new ArrayList<>();
        arrList.add("Bob");
        arrList.add("Charlie");
        arrList.add("Dorothy");
        arrList.add("Erik");

        System.out.println("Using ListIterator, traverse through the ArrayList first in forward\n" +
                "and then in the reverse direction, and print the names to the console.");

        // Traverse Forward
        ListIterator<String> listIter = arrList.listIterator();
        while (listIter.hasNext()) {
            String name = listIter.next();
            System.out.println(name);
        }
        System.out.println();

        // Traverse Backward
        while (listIter.hasPrevious()) {
            String name = listIter.previous();
            System.out.println(name);
        }
        System.out.println();
    }

    public static void doLinkedList() {
        System.out.println("LINKED LIST");
        System.out.println("--------------------");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Bob");
        linkedList.add("Charlie");
        linkedList.add("Dorothy");
        linkedList.add("Erik");

        System.out.println("Using 'for loop', traverse through the array and print the names to the console.");
        for (int i = 0; i < linkedList.size(); i++) {
            String name = linkedList.get(i);
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Remove the first & last element and print the names using advanced for loop");
        linkedList.remove(0);
        linkedList.remove(linkedList.size() - 1);
        for (String name : linkedList) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("Add new names at first & last position and print the list using an iterator");
        linkedList.add(0, "Alice");
        linkedList.add(linkedList.size(), "Frank");
        Iterator<String> iter = linkedList.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
    }
}
