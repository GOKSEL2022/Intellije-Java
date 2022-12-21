package day29abstractioncollections;

public interface Engine {

    // "interface" lerdeki tüm variable lar public'tir.
    // "interface" lerdeki tüm variable lar otomatik olarak (default) final'dir yani değer atamazsak hata verir.
    // "interface" lerdeki tüm variable lar otomatik olarak (default) static'tir.

    int price = 2000;

    double weight=23.5;

    void run();


}
