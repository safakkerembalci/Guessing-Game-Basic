import java.util.Scanner;

public class EvGiderleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Doðalgaz Gideri: ");
        double dogalGaz = input.nextDouble();
        System.out.println("Elektrik Gideri: ");
        double elektrik = input.nextDouble();
        System.out.println("Su Gideri: ");
        double su = input.nextDouble();
        System.out.println("Ýnternet Gideri: ");
        double internet = input.nextDouble();
        System.out.println("Televizyon Gideri: ");
        double televizyon = input.nextDouble();
        System.out.println("Telefon Gideri: ");
        double telefon = input.nextDouble();
        System.out.println("Maaþ Geliri: ");
        double maas = input.nextDouble();

        double toplamGider = dogalGaz + elektrik + su + internet + televizyon + telefon;
        double borc = maas - toplamGider;

        if (maas < toplamGider){
            System.out.println("Toplam borcunuz: " + borc);
        }else {
            System.out.println("Borç bulunmamaktadýr.");
        }
    }
}
