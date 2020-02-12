package pdp1.ucgeninkosegenuzunluklari;
import java.util.Scanner;
import java.lang.String;
public class PDP1UcgeninKosegenUzunluklari 
{
    public static void main(String[] args) 
    {
        Scanner veri = new Scanner(System.in);
        int a, b, c;
        System.out.print("Üçgenin Kenar Uzunlukları: ");
        a = veri.nextInt();
        b = veri.nextInt();
        c = veri.nextInt();
        double u = (double) (a + b +c)/2;
        double k = 2*Math.sqrt(u*(u-a)*(u-b)*(u-c));
        double ha = k/a;
        double hb = k/b;
        double hc = k/c;
        System.out.println("hA: " + ha);
        System.out.println("hB: " + hb);
        System.out.println("hC: " + hc);
    }   
}
