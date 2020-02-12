package b161200304;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Oku 
{
    private String okunansatir;
    private final File yol = new File("veriler.txt");
    private static ArrayList <String> veriler = new ArrayList <>();
    public ArrayList getVeriler()
    {
        return veriler;
    }
    public void setVeriler(ArrayList <String> veriler)
    {
        Oku.veriler = veriler;
    }
    
    public void oku()
    {
        try (BufferedReader oku = new BufferedReader(new InputStreamReader(new FileInputStream(yol))))
        {
            okunansatir = oku.readLine();
            while (okunansatir != null)
            {             
                veriler.add(okunansatir);
                okunansatir = oku.readLine();
            }
        } catch (Exception e) { System.out.println(e); }  
    }
}
