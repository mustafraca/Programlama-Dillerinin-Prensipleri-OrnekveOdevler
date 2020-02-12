package pdp7;
public class Hata extends Exception
{
    private int hataKodu;
    public Hata(int hataKodu) throws Hata
    {
        if(hataKodu<0) throw new Hata(1);
        else this.hataKodu = hataKodu;
    }
    public void Mesaj()
    {
        switch(hataKodu)
        {
            case 0: System.out.print("Genel Hata"); break; 
            case 1: System.out.print("Veri Okuma Hatası"); break; 
            case 2: System.out.print("Veri Gönderme Hatası"); break; 
            default: System.out.print("Diğer Türden Bir Hata"); break; 
        }
    }
}
