package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String > myList =new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //for-each loop kullanarak her elemanin sonuna ! ekleyiniz.
        //Note: loop lar kendi başlarına Collection ları update edemezler. Bu sebeple Java İterator'lari oluşturdu.
        //İterator'lar Collection lari  update etmek için kullanilir.
        for (String w:myList){
            w=w+ "!";

        }
        System.out.println();  // [Z,K,A,J,M]

        ListIterator<String > itr =myList.listIterator();  //% 90 Iterator larda while kullanilir.

        while (itr.hasNext()){
            String el=itr.next();
            itr.set(el+"!");
        }
        System.out.println(myList);  // [Z!, K!, A!, J!, M!]


    }
}
