package b161200304class;
import java.util.Scanner;
public class Fark 
{
    private static int xyeni, yyeni;
    public int getXyeni()
    {
        return xyeni;
    }
    public int getYyeni()
    {
        return yyeni;
    }

    public int XYGir(int taban, int tavan)
    {
        Scanner veri = new Scanner(System.in);
        int sayi = veri.nextInt();
        if (sayi >= taban && sayi <= tavan)
            return sayi;
        System.out.print("Aralık Dışında Giriş! Yeni Giriş Yapınız. (" + taban + "-" + tavan + "): ");
        return XYGir(taban, tavan);
    }

    public void Birlestir()
    {
        Yaz yaz = new Yaz();
        yaz.RandomYaz();
        System.out.print("Xyeni Değeri (500-999 Arası): ");
        xyeni = XYGir(500, 999);
        System.out.print("Yyeni Değeri (1000-1499 Arası): ");
        yyeni = XYGir(1000, 1499);
        Oku oku = new Oku();
        oku.OkuHesapla();
        Sirala sirala = new Sirala();
        sirala.KBSirala();
    }
}
