package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
  import java.io.*; yazdığımızda tüm her şey import edilmiş olur ama tavsiye edilmez,ihtiyaçtan fazlasıyla uğraşmış oluruz."
 */

/*
         ***İntervive Sorusu***
     "throw" ile "throws" arasındaki farklar nelerdir?

  1) "throw" method un body si içinde kullanılırken "throws" method un isminden sonra kullanılır.
  2)"throw" dan sonra obje oluşturulur(throw new...).,
   "throws" tan sonra ise sadece exception class ın ismi yazılır(throws IllegalGradeException...)
  3) "throw" method un içinde istediğimiz yerde Exception üretmek için kullanilir,"throws" ise
  var olan checked Exception i atmak için kullanılır.
  Yani "throw" Exception üretir. "throws" var olan Exception'i atar.
  4)"throw" dan sonra sadece bir tane Exception olabilir
  ama "throws" tan sonra birden fazla Exception olabilir.


 */

public class ReadFileLineByLine {

    public static void main(String[] args) {
        readFileLineByLine();
    }

    public static void readFileLineByLine(){

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));

            String line = br.readLine();

            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - " + e.getMessage());
        }

        // Bir dosyayı satır satır okumak için "readLine() " kullanılır. readLine() methodu nu kullanabilmek için BufferedReader
        //objesine ihtiyaç duyarız.Çünkü readLine() methodu BufferedReader in içinde,ona ulaşabilmek için objeye ihtiyaç duyarız.

    }
}