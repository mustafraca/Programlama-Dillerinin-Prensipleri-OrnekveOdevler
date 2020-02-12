package pdp6.ıdealkilo;
import java.util.Scanner;

public class İslemler 
{
        private Scanner s = new Scanner(System.in);
        private int secim;
        private Kisi kisi;
        
        İslemler()
        {
            s = new Scanner(System.in);
            secim = 0;
            kisi = new Kisi();
        }   
        do
        {
            System.out.println("1-İsim Değeri Gir");
            System.out.println("2-İsim Değeri Listele");
            System.out.println("3-ÇIKIŞ");
            System.out.println("Seçiminiz: ");
            secim = s.nextInt();
            try
            {
                switch(secim)
                {
                    case 1: 
                        System.out.print("İsminiz: ");
                        String cinsiyet = s.next();
                        kisi.getCinsiyet(cinsiyet);
                        break;
                    case 2:
                        System.out.println("Cinsiyetiniz: " + kisi.getCinsiyet());
                        break;
                    default:
                        System.out.println("Farklı İşlem");
                        break;
                }
            }
            catch(Hata h)
            {
                h.getMesaj();
            }           
        }while(secim<3);
}
