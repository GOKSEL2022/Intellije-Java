package day32maps;

public class Students {

    public  String name;
    public  String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
        //javanin classlari gibi kendi klaslarinizi da kullanabilirsiniz.
        //toString methodu ne ise yarar onu ogrenmenizi istiyorum.toString varsa ojenin detaylarini
        // istediginiz gibi konsolda gorursunuz.
        //toString olmazsa objenin adresini gorursunuz.
    }
}
