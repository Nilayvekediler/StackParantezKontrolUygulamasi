import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ParantezKontrol pk = new ParantezKontrol();
        String ifade = "";
        Scanner oku = new Scanner(System.in);
        System.out.println("Parantezli ifadeyi giriniz:");
        ifade =oku.nextLine();
        System.out.println(pk.parantezKontrol(ifade));


    }
}
