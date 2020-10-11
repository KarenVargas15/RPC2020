
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class inflation{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int tam = Integer.parseInt(br.readLine());
        int n; 
        StringTokenizer st= new StringTokenizer(br.readLine());
        double resul=1;
        while(st.hasMoreTokens()){
            lista.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(lista);
        for(int j=1; j<=lista.size(); j++){
            if(lista.get(j-1)>j){
                System.out.println("impossible");
                return;
            }else{
                resul=Math.min(resul, (double)lista.get(j-1)/j);
            }
        }
        System.out.println(resul);
    }
}