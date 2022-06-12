import java.util.Scanner;
import java.util.Random;

public class TahminOyunu {
    public static void main(String[] args) {

        Random r = new Random();

        int sayi = r.nextInt(50);
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam 5 hakkınız bulunmaktadır. Lütfen tahmininizi giriniz: ");

        int i = 1;

        do {
            n = scanner.nextInt();
            if (n>sayi && i <5){
                System.out.println(5-i + " hakkınız kaldı. Lütfen daha küçük bir sayı giriniz.");
            }else if(n < sayi && i <5){
                System.out.println(5-i + " hakkınız kaldı. Lütfen daha büyük bir sayı giriniz.");
            }else if (n == sayi){
                System.out.println("Tebrikler, bildiniz.");
                break;
            }else {
                System.out.println("Tahmin hakkınız kalmadı. Kaybettiniz.");
            }
            i++;
        } while (i<=5);
    }
}
