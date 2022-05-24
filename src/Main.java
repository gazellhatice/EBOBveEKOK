//Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = scan.nextInt();
        int a;

        if (n1 < n2) {
            a = n1;
        } else {
            a = n2;
        }

        int i = 1;
        int ebob = 1;
        while (i <= a) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Girmiş olduğunuz sayıların EBOB'u: " + ebob);

        int k = 1;
        while (k <= n1 * n2) {
            k++;
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println("Girmiş olduğunuz sayıların EKOK'u: " + k);
                break;
            }
        }
    }

}
