import java.util.Scanner;
import java.util.Random;

public class TahminOyunu {
    public static void main(String[] args) {

        Random r = new Random();

        int sayi = r.nextInt(50);
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Toplam 5 hakk�n�z bulunmaktad�r. L�tfen tahmininizi giriniz: ");

        int i = 1;

        do {
            n = scanner.nextInt();
            if (n>sayi && i <5){
                System.out.println(5-i + " hakk�n�z kald�. L�tfen daha k���k bir say� giriniz.");
            }else if(n < sayi && i <5){
                System.out.println(5-i + " hakk�n�z kald�. L�tfen daha b�y�k bir say� giriniz.");
            }else if (n == sayi){
                System.out.println("Tebrikler, bildiniz.");
                break;
            }else {
                System.out.println("Tahmin hakk�n�z kalmad�. Kaybettiniz.");
            }
            i++;
        } while (i<=5);
    }
}
