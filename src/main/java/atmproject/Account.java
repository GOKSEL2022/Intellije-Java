package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber; // hesap numarası
    private int pinNumber; // kullanıcı şifresi

    private double checkingBalance;  // vadesiz hesap,günlük işlme bakiyesi
    private double savingBalance;  // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");  // dolar olarak parayı daha güzel bir formatta yansıtmak için yazdık.

    Scanner input = new Scanner(System.in);  //kullanıcıdan alacağımız işlem için Scanner oluşturduk.
                                             // variable ları gizli tutmak için private yapmıştık,
                                            // başka yerden/class tan ulaşmak için getter
                                            // ve setter method larını kullandık.

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para çekme   ==> paraCekmeİslemindenSonraKalanMiktar

    private double calculateCheckingBalanceAfterwithdraw(double amount) {   //vadesiz hesabımdaki parayı,
                                                                           // para çekildikten sonra hesapla
        checkingBalance = checkingBalance - amount;  // çekilen para hesaptan düşülür ve vadesiz hesaba tekrar atanır.

        return checkingBalance;      // hesapta ne kadar para kaldığı return edilir,hesaplanır,gösterilir.
                                     //hesaptan eksi bakiye veya limitten fazla para çekilmemesi için filtreleme yapacağız.
    }

    //para yatırma ==>paraYatırmaİslemindenSonraKalanBakiyeyiHesapla

    private double calculateChechingBalanceAfterDeposit(double amount) { // para yatırdıktan sonra geri kalan parayı hesaplıyoruz
                                                                      // yatırdığı para miktarını double olarak kişiden alıyoruz.
        checkingBalance = checkingBalance + amount;             // yatırdığı miktarı hesaba ekleyip tekrar hesaba atıyoruz.

        return checkingBalance;                      // hesabı tekrar görmek için return ediyoruz.

        //para cekme: saving hesabından para cekildikten sonra kalan bakiye
    }
    private double calculateSavingBalanceAfterWihthdraw(double amount){   //yatırdığı para miktarını double olarak kişiden alıyoruz.

        savingBalance = savingBalance - amount;   // çekilen miktarı hesaptan çıkarıp tekrar atamazsak
                                                 // işlem sonrasında para değişmemiş olur.

        return savingBalance;                   // işlem bittikten sonra hesapta kalan parayı tekrar görmek istiyoruz.


    }

    // para yatırma: saving hesabına(vadeli hesap bakiyesi) para yatırdıktan sonra geri kalan bakiyeyi hesaplıyoruz.  amount = tutar
    private double calculateSavingBalanceAfterDeposit(double amount){  // kişi kendi hesabına para yatırmak istediği için double olarak parayı alıyoruz.

        savingBalance = savingBalance + amount;  // yatırdığı miktarı hesaba ekleyip tekrar hesaba atıyoruz.
        return savingBalance;                    // hesapta ne kadar para kaldığı return edilir,hesaplanır,gösterilir.


    }

    // Müşteri ile para çekmek için etkileşime geçelim.(checking hesap) Kişinin parasını ortaya koyalım ama önce method koymalıyız

    public void getCheckingWithdraw(){   // ceking hesabından para çekme işlemi,bu methodu başka class lardan çağırmak için public yaptık.
        displayCurrentAmount(checkingBalance);
        System.out.println("Çekmek istediğiniz miktari giriniz.");
        double amount=input.nextDouble();  // kullanıcıdan,müşteriden çekeceği para miktarını alıyoruz.

        //Artık filtrelemeye başlıyoruz,geçerli veya geçersiz miktarlar.  amount=tutar,miktar

        if (amount<=0) {
            System.out.println("Sifir veya eksi rakamlar geçersizdir.");
            getCheckingWithdraw();  // recursive method ==>methodu,kendisini tekrardan çağırıyoruz.İşlem en başa gelmeyip tekrar aynı yere gelsin diye.
        } else if (amount<=checkingBalance) {  // kişinin vermiş olduğu miktar hesabındakinden düşük veya hesabındaki miktara eşitse

            calculateCheckingBalanceAfterwithdraw(amount);

            System.out.println("Checking hesabınızda bulunan bakiye: " + moneyFormat.format(checkingBalance)); // parayı daha düzenli formatta yazdık.
            // hesapta kalan miktarı kullanıcıya bilgi olarak verdik.
        }else {
            System.out.println("Yetersiz bakiye");


            
        }
    }

    // para yatırma(checking hesap) : Müşteri ile para yatırmak için etkileşime geçelim.
    public void getCheckingDeposit(){   // (deposit=para yatırma) para yatırmaya gelen mişteriye mevcut bakiyesini gösteririr.
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediğiniz miktari giriniz."); // Müşteriden miktari alıyoruz o sebeple Scanner kullanıyoruz.
        double amount= input.nextDouble();  // Kişinin istediği miktarı kişiden alıyoruz.

        if (amount<=0) {//Kişi eğer yanlışlıkla eksi bir değer veya sifir bir değer verirse
            System.out.println("Sifir veya eksi rakamlar geçersizdir.");
            getCheckingWithdraw();  // recursive method ==>methodu,kendisini tekrardan çağırıyoruz.İşlem en başa gelmeyip tekrar aynı yere gelsin diye.
            // yanlış bir rakam girdiniz ama size ikinci bir imkan sunuyoruz,tekrar işlem girme hakkı alıyor müşteri
        }else {
           calculateChechingBalanceAfterDeposit(amount);  // son bakiyeyi gösteriyoruz müşteriye
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }

    }

    // Müşteri ile para çekmek için etkileşime geçelim. Saving hesap
    public void getSavingWithdraw(){
        displayCurrentAmount(savingBalance);
        System.out.println("Çekmek istediğiniz miktarı giriniz");
        double amoont =input.nextDouble(); // kişi kendi hesabından para çekiyor.

        if (amoont<=0) {
            System.out.println("Sifir veya eksi rakamlar geçersizdir.");
            getSavingWithdraw();  // kişiye tekrar giriş imkanı veriyoruz.
        } else if (amoont<savingBalance) {  // kişinin istediği para hesabındaki miktadan azsa
            calculateSavingBalanceAfterWihthdraw(amoont);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz bakiye");

        }
    }

    //para yatirma(saving) : müşteri ile para yatirmak için etkileşime geçelim.
    public void getSavingDeposit(){  // hesaba para yatirma işlemi
        displayCurrentAmount(savingBalance);  // işlemden önce müşteriye mevcut bakiyesini gösteriyoruz.
        System.out.println("Yatirmak istediğiniz tutarı giriniz.");
        double amount =input.nextDouble();  // kişinin verdiği miktari alıyoruz.

        if (amount<=0) {
            System.out.println("Sifir veya eksi rakamlar geçersizdir.");
            getSavingWithdraw();  // kişiye tekrar giriş imkanı veriyoruz.
        }else {
            calculateSavingBalanceAfterDeposit(amount); // işlem sonrasında bakiyeyi hesapladık.
            displayCurrentAmount(savingBalance); // kişi parasını hesaba yatırdıktan sonra mevcut bakiyeyi ona gösteririz.
        }
        }
    // son bakiyeyi göster
    public void displayCurrentAmount(double balance){  // her seferinde (checkingBalance) ı çağırmamak için method oluşturduk.
        System.out.println("Hesabınızda bulunan bakiye: " + moneyFormat.format(balance));

    }

    }

