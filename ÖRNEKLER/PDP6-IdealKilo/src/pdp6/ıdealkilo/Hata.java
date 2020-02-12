package pdp6.ıdealkilo;

public class Hata extends Exception
{
    Hata(int hataKodu)
    {
        this.hataKodu = hataKodu;
    }
    private int hataKodu;
    public void setHataKodu(int hataKodu)
    {
        this.hataKodu=hataKodu;
    }
    public int getHataKodu()
    {
        return this.hataKodu;
    }
    public void getMesaj()
    {
        switch (hataKodu)
        {
            case 0: System.out.println("Genel Hata"); break;
            case 1: System.out.println("Veri Giriş Hatası"); break;
            case 2: System.out.println("Veri Gönderim Hatası"); break;
            default: System.out.println("Diğer Hatalardan Biri"); break;
        }
    }
}
