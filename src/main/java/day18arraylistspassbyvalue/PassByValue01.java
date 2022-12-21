package day18arraylistspassbyvalue;
public class PassByValue01 {
    /*
        1)Java, variable'ların orijinal değerlerini korumak ister.
        2)Variable metotlar içinde kullanıldığında, Java metodun içine
        orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
        Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
        orijinal değer korunmuş olur. Bu sisteme "Pass By Valoue" denir.
        Note: Java "Pass By Valoue"  kullanir."Pass by Referance" kullanmaz.
        Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir.Bu isi Developer'lara birakmistir.
        Bu tarz diller "Pass by Referance" kullanir
     */
    public static void main(String[] args) {
        int x =5;                  //Gomlek
        System.out.println(x);  //5
        //static method olan !main method" un icindeki her sey static olmalidir
        change(x);          // ogrenci gomlegi
        System.out.println(x); ////Gomlek
        int ucret = 100;
        int kopya = indirim(ucret);
        System.out.println(kopya);   //90
        System.out.println(ucret); //100
        ucret = indirim(ucret);   // orijinal degeri degistirmek isiyorsak
        System.out.println(ucret);   //90
    }
    public static void change (int a){
        System.out.println(a*3);
    }
    //void disidaki "return" type'larda method body'si icinde "return" keyword kullanilmalidir.
    public  static int indirim(int gomlekUcreti){
        return gomlekUcreti  - 10;
    }
}