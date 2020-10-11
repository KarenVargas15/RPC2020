import java.util.Scanner;

public class dividing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int cont =0;
        while(a>b){
            if(a>b){
                if(a%2==0){
                    a=a/2;
                    cont++;
                }else{
                    a=a+1;
                    cont++;
                }
            }
        }
        while(a<b){
            a=a+1;
            cont++;
        }
        System.out.println(cont);
    }
}