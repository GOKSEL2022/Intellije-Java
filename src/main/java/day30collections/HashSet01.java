package day30collections;

import java.util.HashSet;

public class HashSet01 {

    //Hash bir tekniktir,birbirine benzemeyen code'lar üretir,bu code'lar datayı unique(benzersiz) yapar.
    //Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
    // Java bu teknikle her bir dataya özel bir HashCode üretir.

    //HashSet'ler eklenen elemanların sıralaması ile uğraşmaz.
    //HashSet'ler index kullanmazlar çünkü sıralama rastgele yapılır,index önemsenmez.
    /*
    HashSetler:1)tekrarsiz elemanlarda,2)sıralama onemli degilse,3)hız cok önemliyse,4)İndeks kullanmazlar
     */


    /*              Set --> HashSet :
            * 1) HashSet, duplicationa(tekrarli eleman) izin vermez.
            * Eger bir elemani tekrar HashSet e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
            * 2) HashSet'ler Set'ler arasinda en hizli olanidir. Bir algoritmaya gore kayit eder.
            * Degerlerin giris sirasina dikkat edilmez.(LinkedHashSet haric)
            * 3) HashSet "null" object'ini eleman olarak kullanabilir.
            * Ancak birden fazla null degerini bir HashSet e eklemek isterseniz sadece bir tane null degeri olur.

     */

    public static void main(String[] args) {

        HashSet<String > emails =new HashSet<>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

        // Var olan elemanı eklerseniz hata vermez,önceki datanın üzerine yazar. (Overwrite==>üzerine yazma)
        emails.add("Mango");
        System.out.println();// [Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        System.out.println(emails); //[null, Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println(emails);//[null, Apple, Fig, Mango, Apricot, Orange]
    }
}
