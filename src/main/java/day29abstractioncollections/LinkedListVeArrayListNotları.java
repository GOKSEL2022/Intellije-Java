package day29abstractioncollections;

public class LinkedListVeArrayListNotları {

    /*

    Collection: birden fazla datanın depolanması.
    Array ilkel bu yüzden collectionlara dahil değil.
            List'ler collection'lara dahil.

    Collection diyince bunlar aklınıza gelmeli:
            1)List  i)ArrayList ii)LinkedList
    2)Set
    3)Queue

    >List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
            >>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
    --Set ve List'i amacına göre kullanın.
            >>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır,
    Ör: bankadaki günlük müşteriler.

    ArrayList ler index kullanır ama index kullanmak eleman ekleme ve silme işlemlerinde tün sırayı bozar.
    Bize zaman kaybettririr.Tüm elemanların indexi değişir.

     /*
- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

LinkedList eleman ekleme ve eleman silmede cok basarilidir. Bu yuzden eleman ekleme ve eleman silme
islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.
/Arraylist'ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
//Cunku bircok elemanin re-index edilmesi gerekir.
//Linked list eleman ekleme ve eleman silmede cok basarilidir.
// bu yuzden eleman ekleme ve eleman silme islerini cokca yapacaginiz durularda LinkedList kullanmalisiniz.
     */


    // ArrayList eleman bulma işlemlerinde çok başarılıdır (searc işlemleri) ,LinkedList ise eleman bulma
    // (search işlemleri) işlemlerinde başarısızdır.Çoğunlukla arama yapılan bir çalışmaysa ArrayList kullnılmalıdır.
    // LinkedList ise ekleme-çıkarma işlemlerinin fazlaca yapıldığı çalışmalarda kullanılmalıdır..
}
