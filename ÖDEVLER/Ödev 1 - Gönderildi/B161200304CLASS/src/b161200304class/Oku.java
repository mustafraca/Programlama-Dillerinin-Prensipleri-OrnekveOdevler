package b161200304class;
import java.io.*;
public class Oku 
{
    private static int[][] farkhesabi;
    public int[][] getFarkhesabi()
    {
        return farkhesabi;
    }
    private int xi, yi, sayac = 0;
    private String okunan;
    private String[] parcalar;
    private final File yol = new File("rasgele.txt");
    public void OkuHesapla()
    {
        Yaz yaz = new Yaz();
        Fark fark = new Fark();
        farkhesabi = new int[yaz.getUretilensayi()][2];
        try (BufferedReader Oku = new BufferedReader(new InputStreamReader(new FileInputStream(yol))))
        {
            okunan = Oku.readLine();
            while (okunan != null)
            {
                parcalar = okunan.split(" ");
                    
                xi = (int)Math.pow(Integer.parseInt(parcalar[0]) - fark.getXyeni(), 2);
                yi = (int)Math.pow(Integer.parseInt(parcalar[1]) - fark.getYyeni(), 2);
                farkhesabi[sayac][0] = (int)Math.sqrt(xi + yi);
                farkhesabi[sayac][1] = Integer.parseInt(parcalar[2]);
                okunan = Oku.readLine();
                sayac++;
            }
        }
        catch (Exception e) { System.out.println(e); }
    }
}
