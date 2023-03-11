package ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    /* 4)Create an arrayList of drinks.
    If any drink has letter “a” or “e” replace it with water.  */
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("sod");
        name.add("veda");
        name.add("mod");
        name.add("ted");
        for (String drink : name)
            System.out.println(drink.replaceAll("[ae]","water"));

            }

    }



