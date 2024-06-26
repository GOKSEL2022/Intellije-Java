package day28abstraction;

public abstract class Animal {

    // Child Class ın kullanımı sırasında method body uygun değilse sadece method adı yazılır.==> Abstract
    // Tam tersi ise Contcrit...Hiçbir Child parent taki method body i kullanmadığı için method body silinir.
    //body si olmayan method lar "abstract method" olarak adlandırılır.
    //Bir method u "abstract(soyut)" yapmak için method body silinir ve "abstact(görünmez)" keyword kullanılır.
    //Abstract method lar abstract class içinde olmalıdır.

    public abstract void eat();
        //  {System.out.println("Animals eat..."); }

  // "astract class" larda hem abstract(soyut) hem de concrete(somut,non-abstract) method kullanilabilir.
    public void drink(){

        System.out.println("Animals drink...");
    }

    //abstract "move" method oluşturalım.
    public abstract void move();


/*

            ABSTRACT vs INTERFACE
            1) Abstract :
            1.1 - Class`dir.
            1.2 - Abstract ve concrete method`lar konabilir.
            1.3 - Kismi olarak abstraction saglar.
            1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
            1.5 - Hiz acisindan avantajlidir
            1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
            1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
            1.8 - Abstract class constructor`a sahiptir

            2) Interface :
            2.1 - Class degildir.
            2.2 - Sadece abstract method`lar konabilir.
            2.3 - Tam abstraction (soyutluk) saglar
            2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
            2.5 - Hiz acisindan abstract class`a gore yavastir.
             2.6 -Icindeki tum nesnelerin public olmasi gerekir.
            2.7 - Method'lar static olamaz
            2.8 - Abstract class constructor`a sahiptir    */

}
