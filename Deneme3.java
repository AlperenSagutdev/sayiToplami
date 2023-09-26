import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {
        int total = 0;
        int n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if ( n % 4 == 0) {
                total +=n;

            } 
        } while (n % 2 == 0);
        System.out.println("Çift ve 4 e bölünebilen tam sayıların Toplamı: "+total);


    }
}
