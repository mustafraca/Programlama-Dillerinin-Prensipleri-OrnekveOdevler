package pdp6.ıdealkilo;
import java.lang.String;
public class Kisi 
{
    private String isim;
    private int boy;
    private int yas;
    private int kilo;
    private int cinsiyet;
    public void setCinsiyet(String cinsiyet) throws Hata
    {
        if (cinsiyet.toLowerCase() == "kadın" || cinsiyet.toLowerCase() == "kadin")
            this.cinsiyet=1;
        else if (cinsiyet.toLowerCase() == "erkek")
            this.cinsiyet=2;
        else throw new Hata(1);
    }
    public String getCinsiyet()
    {
        if (cinsiyet == 1) return "Kadın";
        return "Erkek";
    }
}
