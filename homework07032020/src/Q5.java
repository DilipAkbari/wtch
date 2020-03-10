//5. Write a Java program to test an array list is empty or not.

import java.util.ArrayList;

public class Q5 {
        public static void main (String[] args){
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("A");
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
