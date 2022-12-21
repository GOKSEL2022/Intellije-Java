package day29abstractioncollections;


/*
    "abstract method" lar sadece ne yapılacağını söyler ( what to do?)  ==> method body olmadığı için detay vermez.
    "concrete method" lar ne yapılacağı ile birlikte nasıl yapılacağını da söyler. ==> method body de nasıl yapılacağını söyler.

    "interface" ler bir yapılacak işler listesidir.(To do list)

    "multiple parent(birden çok parentli) interface kullandığınızda aynı mtehod ismi ile
    birden fazla method oluşturursanız bu methodların return type lari aynı olmalidir.Aksi takdirde hata verir.
    Çünkü java hangisini seçeceğini bilemez.  ==> void price();  ile   int price();  gibi

    "interface" lerde constructor olmadığı için interface lerden obje oluşturulamaz.Varible ler hem statik,hem final hem public tir.
    "abstract class larda class oldukları için constructor vardir.Ama constructor lar abstract class larda object oluşturamaz.
    Javada interfacelerden(constructor yok çünkü) ve abstract class lardan object oluşturulamaz.

    *****İntervive Sorusu : Abstract Class ile İnterface in farklari nelerdir?*****
                      1)Method
                         "Abstract Class hem abstract hem de concrete method lar içerebilir.
                         "İnterface ler ise sadece abstract methodlar içerir.
                          Ama interface ler içinde de default ve statik keyword lar oluşturarak concrete methodlar oluşturabiliriz.

                      2)Variable
                         "Abstract Classlarda normal methodlar gibi her türlü variable lar oluşturulabilir.
                         "İnterfaceler de ise variable lar public,static ve final olmak zorundadır.

                      3) İnheritance
                         "Abstract Class lar class oldukları için multiple inheritance lara müsade etmezler.
                         "İnterface ler ise multiple inheritance i desteklerler zaten var oluş sebebi budur.

                       4) Object Creation
                          "Abstract Classlarda constructor vardır ama object oluşturmada kullanılamazlar.
                          "İnterfacelerde ise constructor olmadığından object oluşturulamaz.

      Soru : Object Oriented Programing(OOP) Language prensipleri nelerdir?
            1) İnheritance
            2) Polymorphism
            3) Ensapsulation
            4) Abstraction

     */

public class Civic implements Engine,Ac{
    @Override
    public void run() {
        System.out.println("Civic runs well");

    }

    }

