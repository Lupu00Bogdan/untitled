package Homework11;

import java.util.LinkedList;
    public class LinkedListDemo {

        public static void main(String args[]) {

            LinkedList<String> list = new LinkedList<String>();

            list.add("30");
            list.add("40");
            list.add("50");
            list.add("10");
            list.add("20");

            System.out.println("First LinkedList:" + list);

            LinkedList sec_list = new LinkedList();
            sec_list = (LinkedList) list.clone();
            System.out.println("Second LinkedList is:" + sec_list);
        }
    }
