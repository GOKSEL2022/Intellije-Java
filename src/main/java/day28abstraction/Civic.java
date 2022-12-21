package day28abstraction;

public class Civic implements Engine,Ac,Hood { //Bir Class'i bir interface'in child'i
    // yapmak icin "implements" kullaniriz,aynı anda birden fazla child i yan yana
    // yazarak da implement yapı oluşturabiliriz.
    @Override
    public void eco() {
        System.out.println("Uses eco engine");

    }

    @Override
    public void gas() {
        System.out.println("Uses gas");

    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi technology");

    }  // Bir Class ı bi İnterface nin child i yapmak için implements kullanırız.

    @Override
    public void digital() {
        System.out.println("Uses digital AC");

    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");

    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }

    /*
   Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
   bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.

   "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
    bu yapida "multiple inheritance" a musaade etti.

*/
}
