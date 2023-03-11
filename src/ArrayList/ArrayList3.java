package ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    /* Create an arrayList of words.
    Remove every word that ends with “e”.  */

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("kain");
        name.add("maine");
        name.add("tain");
        name.add("sain");
        name.add("shain");

        name.removeIf(nam -> nam.contains("e"));
        System.out.println(name);


        }





            }



