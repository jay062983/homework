package ArrayList;

import java.util.ArrayList;

public class ArrayList01 {
    /* 1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that  */

    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("kain");
        name.add("main");
        name.add("tain");
        name.add("sain");
        name.add("shain");
        System.out.println(name.isEmpty());
        System.out.println(name.contains("main"));
        System.out.println(name.size());
        System.out.println(name);

    }

}
