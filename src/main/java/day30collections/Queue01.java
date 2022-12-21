package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO) gerektiğinde Queue en iyi seçimdir.
    Queue'da elemanlar "insertion order" a göre dizilirler.
    Queue'da peek(), peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.
    offer() methodu kapasite kontrolü yapıldıktan sonra eleman ekleme durumlarında kullanılır.
 */
    public static void main(String[] args) {

        Queue<String>wareHouse =new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Honey, Tomatoes]


        /*
         Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse,
         belirtilen öğeyi bu kuyruğa ekler. Kapasite kısıtlamalı bir kuyruk kullanırken,
         bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca
         bir istisna atarak bir öğe eklemede başarısız olabilir.


         */

        wareHouse.offer("Potatoes");
        System.out.println(wareHouse); //[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]

        wareHouse.remove();
        System.out.println(wareHouse); //[Meat, Bread, Honey, Tomatoes] ilk elemanı siler




    }
}
