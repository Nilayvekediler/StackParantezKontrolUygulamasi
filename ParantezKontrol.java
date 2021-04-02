import javax.swing.*;
import java.util.Scanner;

public class ParantezKontrol {

    public boolean parantezKontrol(String ifade){
        Cikin cikin = new Cikin();

        for(
                int i = 0;i<ifade.length();i++)
        {
            Eleman<Character> e1;
            if (ifade.charAt(i) == '(') {
                e1 = new Eleman<Character>('(');
                cikin.cikinEkle(e1);
            } else if (ifade.charAt(i) == '{') {
                e1 = new Eleman<Character>('{');
                cikin.cikinEkle(e1);
            } else if (ifade.charAt(i) == '[') {
                e1 = new Eleman<Character>('[');
                cikin.cikinEkle(e1);
            } else if (ifade.charAt(i) == ')') {
                e1 = new Eleman<Character>(')');
                cikin.cikinEkle(e1);
            } else if (ifade.charAt(i) == ']') {
                e1 = new Eleman<Character>(']');
                cikin.cikinEkle(e1);
            } else if (ifade.charAt(i) == '}') {
                e1 = new Eleman<Character>('}');
                cikin.cikinEkle(e1);
            }
        }

        int sayac1 = 0;
        int sayac2 = 0;
        int sayac3 = 0;
        Eleman<Character> e;
        while(!cikin.cikinBos())

        {
            e = cikin.cikinSil();
            if (e.icerik == '(') {
                sayac1++;
            } else if (e.icerik == '{') {
                sayac2++;
            } else if (e.icerik == '[') {
                sayac3++;
            } else if (e.icerik == ')') {
                sayac1--;
            } else if (e.icerik == '}') {
                sayac2--;
            } else if (e.icerik == ']') {
                sayac3--;
            }

        }
        if(sayac1==0&&sayac2==0&&sayac3==0)
        {
            System.out.println("Girilen parantezli ifadede parantezler doğru kullanılmıştır.");
            return true;
        }else{
            System.out.println("Girilen parantezli ifadede parantezler yanlış kullanılmıştır.");
            return false;
        }
    }
}







