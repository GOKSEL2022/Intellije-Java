package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*
        @Override annotation'ini kullanarak, Java'nin yaptigimiz Override islemini kontrol etmesini saglariz
        1)Override yaparken "method'un body" si degistirilir.
        2)Override yaparken ASLA method signature(isim ve parametre) degistirilemez.
        3)Override yaparken "inheritance" olmak zorundadir.
        4)Override yaparken "access modifier" lar belli kurallara gor farklilastirilabilirler
            i)"private" method'lar override edilemezler
            ii)Child Class'daki "override edilen" method'un access modifier'i Parent class'daki
               method'un access modifier'i ile ayni veya daha genis olmalidir.
               Note: Child Class daki method'un access modifier'i daha dar olamaz.
            iii)"default method"lar ayni package icindeyse override edilebilirler,
                farkli package'den override edilememzler.
         5)Parent Class'daki methodun "return type" i void ise "return type" degistirilemez.
         6)Parent Class'daki methodun "return type" i primitive ise "return type" degistirilemez.
         7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
         8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
           Note: Child Class'daki return type Parent Class'dakinden genis olamaz.
           Note: Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
                 kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat ararlarinda "Parent Child" iliskisi
                 olmadigindan "Integer" yerine "Short" kullanamazsiniz.
           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
         9)Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                          HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
         10)"final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilir fakat
             "final" method body degistirilmesine musaade etmez.
         11) Polymorphism  = Overloading + Overriding
             Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin
         12) Overloading ile Overriding arasindaki farklar nelerdir?
                i)Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir.
                ii)"private" method'lar Overload edilebilir, Override edilemezler.
                iii)"final" method'lar Overload edilebilir, Override edilemezler.
                iv)"Overloading" "static polymorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
                   Cunku "static" method'lar Overload edilebilir, Override edilemezler.
                v) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.
    */
}