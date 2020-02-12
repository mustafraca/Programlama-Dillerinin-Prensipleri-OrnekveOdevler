package pdp3.dizi;
import java.util.Scanner;
public class PDP3Dizi {

    public static void main(String[] args) 
    {
        Scanner veri = new Scanner(System.in);
        System.out.print("Öğrenci Sayısı: ");
        int os = veri.nextInt();
        int toplam = 0;
        int[] yaslar = new int[os];
        for (int i = 0; i < os; i++)
        {
            System.out.print((i+1)+". Öğrencinin Yaşı: ");
            yaslar[i] = veri.nextInt();
            toplam += yaslar[i];
        }
        System.out.println("Sınıf Ortalaması: " + (double)toplam/os);
    }  
}
