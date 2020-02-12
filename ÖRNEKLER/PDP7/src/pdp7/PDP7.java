package pdp7;
import java.util.Scanner;
import java.lang.String;
public class PDP7 
{
   public static void main(String[] args) 
   {
       Ogrenci kisi = new Ogrenci();
       Scanner veri = new Scanner(System.in);
       try
       {
           System.out.print("İsminiz: ");
           kisi.setIsım(veri.next());
           System.out.print("Yaşınız: ");
           kisi.setYas(veri.nextInt());
           System.out.print("Okul Numaranız: ");
           kisi.setNumara(veri.nextInt());
           System.out.println("İsminiz: " + kisi.getIsım());
           System.out.println("Yaşınız: " + kisi.getYas());
           System.out.println("Okul Numaranız: " + kisi.getNumara());
       }
       catch (Exception e)
       {
           System.out.print("Hata Oluştu");
       }
   }    
}
