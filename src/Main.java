import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double pi= 3.14 ,Alan ,r ,a;
        Scanner daire = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz :");
        r = daire.nextDouble();

        System.out.print(" Merkez Acısının Olcüsü : ");
        a = daire.nextDouble();

        Alan =  (pi*(r*r)*a)/360 ;

        System.out.print("Dairenin Diliminin Alanı : " + Alan);


    }
}
