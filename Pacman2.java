package pacman2;
import java.util.Scanner;
public class Pacman2 {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      String pilih;
      int step =10;
      lintasan2 m = new lintasan2();
      for (int b=0;b<=9;b++){
      m.Lintasanpacman();
      System.out.println("Langkah anda : "+step--);
      System.out.print("Pilih langkah anda (w,a,s,d) >> ");
      pilih = in.next();
      //masuk switch case
switch (pilih) {
    case "a" :
        m.kiri();break;
    case "w" :
        m.atas();break;
    case "s" :
        m.bawah();break;
    case "d" :
        m.kanan();break;
    default:
    System.out.println(" ");
    }
    if(step==0){
    System.out.println("Langkah dari pacman anda habis. YOU LOSE");
      }
          }
    }
}