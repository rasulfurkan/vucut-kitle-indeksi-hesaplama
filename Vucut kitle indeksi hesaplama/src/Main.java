import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kg,m ;
        Scanner inp = new Scanner(System.in);

        System.out.println("lütfen boyunuzu metre cinsinden girinzi = ") ;
        m = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz = ");
        kg = inp.nextDouble();

        double indeks = kg/ (m*m);

        System.out.println("İndeksiniz = " + indeks);








    }
}