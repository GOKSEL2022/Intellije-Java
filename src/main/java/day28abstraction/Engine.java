package day28abstraction;

public interface Engine {

    /*
  1) Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu
bu ise Java'da mumkun degildir.
Cunku Java "multiple Inheritance" i desteklemez.
"multiple inheritance" class'larda mumkun degildir
fakat Java "interface" isimli yeni bir yapi olusturdu bu yapida "multiple inheritance" a musaade etti.

  2) İnterface lerdeki tüm methodlar abstract oldugu için İnterface lere "fully abstraction" denir.
  "Abstract Class larda abstract(görünmeyen,soyut) method ve concrete(görünen,somut)
   method bir arada kullanıldığı için Abstract Class lara
  fully abstraction denmez.

 */

    //interface lerdeki tüm method lar abstract olmak zorundadır.
    //interface lerde abstract method oluştururken abstract keyword kullanmaya gerek yoktur.
    //Çünkü java o methodun abstract oldugunu bilir.  ==>public abstract void eco();

    //interface lerdeki tüm methodlar java tarafından otomatik olarak public kabul edilir.Bu sebeple
    // o methodlar için public yazmaya gerek yoktur.

    //"public abstract void eco()"; ile "void eco();" ayni anlama gelir.
    // hepsi public tir ve yazmaya gerek yoktur.
    void eco();

    void gas();

    void tsi();


    //default keyword kullanarak interface'lerin içinde body'si olan methodlar üretebilirsiniz.
    public default int add(int a, int b){

        return a + b;
    }

    public static String update (String str){

        return str + "!";
    }
}
