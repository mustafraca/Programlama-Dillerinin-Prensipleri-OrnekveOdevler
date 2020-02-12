package b161200304class;
import java.io.*;
public class Yaz 
{
    private static int uretilensayi;
    public int getUretilensayi()
    {
       return uretilensayi;
    }
    private int[][] xys;
    private final File yol = new File("rasgele.txt");
    public void RandomYaz()
    {
        uretilensayi = (10 + (int)(Math.random()* 89));
        xys = new int[uretilensayi][3];
        try (BufferedWriter Yaz = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(yol)));)
        {
            for (int i = 0; i < uretilensayi; i++)
            {
                xys[i][0] = (500 + (int)(Math.random()* 499));
                xys[i][1] = (1000 + (int)(Math.random()* 499));
                xys[i][2] = (1 + (int)(Math.random()* 5));
                Yaz.write(xys[i][0] + " " + xys[i][1] + " " + xys[i][2]);
                Yaz.newLine();
                Yaz.flush();
            }
            Yaz.close();
        }
        catch (Exception e) { System.out.print(e); }
    }
}
