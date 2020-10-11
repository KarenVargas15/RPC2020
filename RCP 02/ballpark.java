import java.util.Scanner;

public class ballpark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = 1;
        double nf = (double) n;
        while (n>=10){
            nf /= 10;
            n /= 10;
            p*=10;
        }
        n = Math.round(nf);
        System.out.println(n*p);
    }
}
