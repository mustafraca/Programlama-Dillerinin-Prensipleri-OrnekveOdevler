package b161200304;
public class Birlestir 
{
    Oku oku = new Oku();
    Regex regex = new Regex();
    Fark fark = new Fark();
    Sirala sirala = new Sirala();
    
    public void birlestir()
    {
        oku.oku();
        regex.regex();
        if (!regex.X().isEmpty())
        {
            fark.OkuHesapla();
            sirala.KBSirala();
        }
    }
}
