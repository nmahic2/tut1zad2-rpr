package ba.unsa.etf.rpr.tutorijal01;
import java.util.Scanner;

public class Main {
    private static int SumaCifara(int broj){
        int suma=0;
        while(broj > 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        n=ulaz.nextInt();
        System.out.print("Brojevi koji su djeljivi sa sumom svojih cifara u opseu od 1 do "+n+" su:");
        for(int i=1;i<=n;i++){
            if(i%SumaCifara(i)==0) System.out.print(i+" ");
        }
    }
}