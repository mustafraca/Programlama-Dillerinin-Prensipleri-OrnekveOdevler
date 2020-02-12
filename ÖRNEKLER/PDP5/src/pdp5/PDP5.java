package pdp5;
import java.util.Scanner;
import java.lang.String;
public class PDP5 {
    public static void main(String[] args) 
    {
        /*
        Scanner s = new Scanner(System.in);
        int k = 10;
        int l = 1;
        for (int m = 5; 1!=k; l++)
        {
            k--;
            if (m<3) break;
            m--;
            System.out.println("m: " + m + " k: " + k + " l: " + l);
        }
        */
        
        Scanner s = new Scanner(System.in);
        String[][] odalar = new String[3][2];
        odalar[0][0]="Tek Oda";
        odalar[0][1]="20";
        odalar[1][0]="İki Oda";
        odalar[1][1]="30";
        odalar[2][0]="Suit Oda";
        odalar[2][1]="50";
        for (String[] deger:odalar)
        {
            for (String deger2:deger)
                System.out.print(deger2 + " ");
            System.out.println();
        }
    }
    
}
