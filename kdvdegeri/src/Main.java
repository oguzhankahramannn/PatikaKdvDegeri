import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvli,kdv,para,kdvorani;
        Scanner scan = new Scanner(System.in);
        System.out.println("Paranızın değerini giriniz : ");
        para = scan.nextInt();
        if (para<1000) {
            kdvli = para + para*0.18;
            kdv = para*0.18;
        }
        else {
            kdvli = para + para*0.08;
            kdv = para*0.08;
        }

        System.out.println("Kdv tutarı:"+" "+ +kdv+" " + "Kdvli fiyat:" +  kdvli);


    }
}