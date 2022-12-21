package day30collections;

public class LinkedHashSet {

    /*
    LinkedHashSet'ler elemanları ekleme sırasına (insertion order) göre yerleştirirler.

    LinkedHashSet'ler elemanları sıralamada zaman harcadığı için HashSet'lere göre yavaş çalışır.


     */

    public static void main(String[] args) {

        java.util.LinkedHashSet<String > emails =new java.util.LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");
        System.out.println(emails); //[abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]


    }
}
