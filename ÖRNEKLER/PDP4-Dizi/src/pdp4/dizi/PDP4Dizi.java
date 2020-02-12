package pdp4.dizi;
import java.util.Scanner;
import java.lang.String;
public class PDP4Dizi {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        String[][] odalar = new String[3][2];
        odalar[0][0]="Tek Oda";
        odalar[0][1]="20";
        odalar[1][0]="İki Oda";
        odalar[1][1]="30";
        odalar[2][0]="Suit Oda";
        odalar[2][1]="50";
        
        System.out.print("Oda Tipi 1-Tek Oda, 2-İki Oda, 3-Suit Oda: ");
        int odaID = s.nextInt()-1;
        System.out.println(odalar[odaID][0] + " Odasının Ücreti: " + odalar[odaID][1]);
    }    
}
