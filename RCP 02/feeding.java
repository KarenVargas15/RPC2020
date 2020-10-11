import java.util.Scanner;

public class feeding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cubos, voluntarios, peso;
        double suma = 0;
        double resul = 0;
        while(sc.hasNext()){
            cubos = sc.nextLong();
            voluntarios = sc.nextLong();
            for(int i=0; i<cubos; i++){
                peso = sc.nextLong();
                suma +=peso;
            }
            resul = (suma / voluntarios);
            resul = Math.ceil(resul);
            System.out.println(resul);
        }
    }
}
