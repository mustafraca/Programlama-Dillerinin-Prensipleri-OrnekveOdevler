package b161200304;

import java.util.Scanner;

public class Fark 
{
    private static int[][] farkhesabi;
    public int[][] getFarkhesabi()
    {
        return farkhesabi;
    }
    private int xi, yi, xyeni, yyeni;
    
    public int XYGir(int taban, int tavan)
    {
        Scanner veri = new Scanner(System.in);
        int sayi = veri.nextInt();
        if (sayi >= taban && sayi <= tavan)
            return sayi;
        System.out.print("Aralık Dışında Giriş! Yeni Giriş Yapınız. (" + taban + "-" + tavan + "): ");
        return XYGir(taban, tavan);
    }
    
    public void OkuHesapla()
    {
        System.out.print("Xyeni Değeri (500-999 Arası): ");
        xyeni = XYGir(500, 999);
        System.out.print("Yyeni Değeri (1000-1499 Arası): ");
        yyeni = XYGir(1000, 1499);
        Regex regex = new Regex();
        farkhesabi = new int[regex.X().size()][2];
        for (int i = 0; i < regex.X().size(); i++)
        {
            xi = (int)Math.pow(Integer.parseInt(regex.X().get(i).toString()) - xyeni, 2);
            yi = (int)Math.pow(Integer.parseInt(regex.Y().get(i).toString()) - yyeni, 2);
            farkhesabi[i][0] = (int)Math.sqrt(xi + yi);
            farkhesabi[i][1] = Integer.parseInt(regex.Z().get(i).toString());
        }
    }
}
