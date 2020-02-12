package b161200304;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex 
{
    private static ArrayList <String> x = new ArrayList <>();
    public ArrayList X()
    { return x;}
    private static ArrayList <String> y = new ArrayList <>();
    public ArrayList Y()
    { return y;}
    private static ArrayList <String> z = new ArrayList <>();
    public ArrayList Z()
    { return z;}
    
    public void regex()
    {
        Oku oku = new Oku();
        Pattern fonksiyon = Pattern.compile("(^Veriler):([5-9][0-9]+)-(1[0-4][0-9]+)-([1-5])");
        for (int i = 0; i < oku.getVeriler().size(); i++)
        {
            Matcher eslesme = fonksiyon.matcher(oku.getVeriler().get(i).toString());
            System.out.println(eslesme.matches());
            if (kontrol(eslesme.matches(), oku.getVeriler().get(i).toString(), eslesme))
                i--;
        }
        
//        File yol = new File("veriler.txt");
//        File geciciyol = new File("gecici.txt");
//        try (BufferedWriter Yaz = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(geciciyol)));)
//        {
//            for (int i = 0; i < x.size(); i++)
//            {
//                Yaz.write("Veriler:" + x.get(i) + "-" + y.get(i) + "-" + z.get(i));
//                Yaz.newLine();
//            }
//        } catch (Exception e) { System.out.print(e); }
//        yol.delete();
//        geciciyol.renameTo(yol);
        YenidenYaz();
    }
    public void YenidenYaz()
    {
        File yol = new File("veriler.txt");
        File geciciyol = new File("gecici.txt");
        try (BufferedWriter Yaz = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(geciciyol)));)
        {
            for (int i = 0; i < x.size(); i++)
            {
                Yaz.write("Veriler:" + x.get(i) + "-" + y.get(i) + "-" + z.get(i));
                Yaz.newLine();
            }
        } catch (Exception e) { System.out.print(e); }
        yol.delete();
        geciciyol.renameTo(yol);
    }
    
    public boolean kontrol(boolean regextf, String indis, Matcher eslesme)
    {
        Oku oku = new Oku();
        if (!regextf)
        {
            System.out.println("Karakter katarı uygun değildir");
            for (int i = 0; i < oku.getVeriler().size(); i++)
            {
                if (oku.getVeriler().get(i) == indis)
                {
                    oku.getVeriler().remove(i);
                }
            }
            return true;
        }
        ayristir(eslesme);
        return false;
    }
    
    public void ayristir(Matcher eslesme)
    {
        x.add(eslesme.group(2));
        y.add(eslesme.group(3));
        z.add(eslesme.group(4));
    }
}
