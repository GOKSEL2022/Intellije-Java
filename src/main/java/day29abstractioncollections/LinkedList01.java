package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {


    /*

    1) LinkedList teki her eleman iki bölümden oluşur  i) data  ii) Pointer
    2)LinkedList teki her bir eleman "Node" olarak adlandırılır.
    3)LinkedList ler eleman ekleme ve silme işlemlerinde çok başarılıdırlasr.
    4) LinkedList ler eleman arama işlemlerinde başarısıdırlar.
    5.3 ve 4. maddeden dolayı eleman ekleme ve silem işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
    6.ArrayList ler index kullanır ,LinkedListler index kullanmaz.
    7.İndex kullanmak eleman bulma işlemlerinde çok başarılıdır.Bu yüzden eleman bulma işlemlerini çokça yapacaksabız Arraylist kullanmalısınız.
     */

    public static void main(String[] args) {

        LinkedList<String> visitors =new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");

        visitors.add(2,"Angelina Julie");  // [Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        System.out.println(visitors);

        //LinkedList ler ekleme ve silme işlemlerinde çok başarılı olduklarından ekleme ve silme ile ilgili çok fazla method içerir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cüneyt Arkın");
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeLast();
        System.out.println(visitors); //[Cüneyt Arkın, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt]

        visitors.removeFirst();
        System.out.println(visitors); //[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt]

        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Brad, Pitt]

        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Brad, Pitt]

        //Bu listede belirtilen öğenin ilk oluşumunu kaldırır (listeyi baştan sona geçerken). Liste elemanı içermiyorsa, değişmez.
        //Ilk elemani siler. Sildigi elemani size verir.eger list bos ise NoSuchElementException exception'u verir.
        String firstEl= visitors.pop();
        System.out.println(firstEl);  // Tom

        System.out.println(visitors);  // [Hanks, Angelina Julie, Brad, Pitt]
    }

}



