import java.util.Scanner;

public class YildizlardanElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;

        System.out.print("Elmas kac satirdan olussun?: ");
        sayi=input.nextInt();

        //Ucgeni olusturalim
        for(int i=0;i<sayi;i++)
        {
           for(int j=i;j<(sayi-1);j++) {
               System.out.print(" ");
           }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //sonra Tersini olusturalim
        for(int i=sayi-2;i>=0;i--){ //Burada ayni sirayi tekrar olusturmasin diye -2 den basladim.
            for(int j=i;j<(sayi-1);j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
