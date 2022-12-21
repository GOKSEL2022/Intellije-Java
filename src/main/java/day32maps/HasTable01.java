package day32maps;

import java.util.Hashtable;

public class HasTable01 {


    /*
       1)HasTable bir map'tir.,
       2)HasTable entrySet'leri herhangi bir sıralamaya tabi tutmaz.
       3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe
       (aynı andan birden fazla iş yapabilme becerisi) ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
       HashTable çoklu iş yapmayı planladığı için HashMap e göre daha yavaştır.
       4)HashTable'larda key null olamaz,NullPointerException atar.
       5)HashTable'larda value null olamaz,NullPointerException atar.

       Note: toString() method'u object'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
             toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.

               HashMap ve Hashtable Farkları
       i)HashTable'larda key ve value null olamaz,NullPointerException atar. HashMap'lerde her ikisi de null olabilir.
       ii)HasTable lar thread-safe(aynı andan birden fazla iş yapabilme becerisi) ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
       Ama HashMap'ler thread-safe ve synhronize değildir.

     */
    public static void main(String[] args) {

        Hashtable<String ,Integer> countryPopulations=new Hashtable<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println(countryPopulations);

        //countryPopulations.put("null",90000000);// HashTable'larda key null olamaz,NullPointerException atar.
        //countryPopulations.put("France",null);   //HashTable'larda value null olamaz,NullPointerException atar.

        Hashtable<String ,Students> myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        System.out.println(myStudents);

        //Students name=myStudents.get("name");
        //System.out.println(name);  //null

        String name=myStudents.get("Math").name;
        System.out.println(name);  //Tom Hanks

        int age=myStudents.get("Math").age;
        System.out.println(age);  //21

        //Note :HashTable'a yerlestirdiginiz datalari isterseniz tek tek alabilirsiniz.



    }
}
