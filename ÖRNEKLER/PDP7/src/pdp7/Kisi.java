package pdp7;
import java.lang.String;
public class Kisi 
{
    private String isim;
    private int yas;
    public void setIsım(String isim) throws Hata
    {
        if(isim.length() < 2) throw new Hata(1);
        this.isim=isim;
    }
    public String getIsım()
    {
        return "Sayın " + isim;
    }
    public void setYas(int y)
    {
        yas=y;
    }
    public int getYas()
    {
        return yas;
    }
}
