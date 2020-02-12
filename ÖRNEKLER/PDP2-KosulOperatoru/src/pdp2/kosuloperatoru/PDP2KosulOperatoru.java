package pdp2.kosuloperatoru;
import java.util.Scanner;
import java.lang.String;
public class PDP2KosulOperatoru 
{
    public static void main(String[] args) 
    {
        Scanner veri = new Scanner(System.in);
        System.out.print("Not Ortalamanız: ");
        int not = veri.nextInt();
        String sonuc = (not >= 50) ? "Geçti" : "Kaldı";
        System.out.println("Durum: " + sonuc);
    }
    
}
