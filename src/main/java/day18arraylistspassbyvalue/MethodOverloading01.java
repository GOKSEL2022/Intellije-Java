package day18arraylistspassbyvalue;
public class MethodOverloading01 {
    /*
       Method Overloading nasil yapilir?
       1)Method isimleri ayni olmalidir.
       2) Method parametreleri farkli olmalidir
         i) Parametre sayilari degistirilebilir
         ii)Parametrelerin data tiplerini degistirebilirsiniz
         iii)Parametrelerin yerlerini degistirebilirsiniz ancak data tipleri farkli ise.
       3) Method Ismi + Parametreler  = method Signature
      Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez
     */
    public static void main(String[] args) {
        add(3,5);
        add(3,5.0);
        // add(3.0, 4.0);
    }
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(double a, int b) {
        System.out.println(a + b);
    }
}