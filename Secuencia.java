import java.util.Scanner;
import java.util.ArrayList;
public class Secuencia
{
    ArrayList <Integer> impares = new ArrayList <>();
    int aux = 1;
    boolean bandera = true;
    private ArrayList <Integer> agregador (ArrayList <Integer> impares, int aux){
       if (aux <= 401){
           impares.add(aux); 
           return agregador(impares, aux + 2);
        }else{
          return impares;
        }
    }
    public int secuencia(int n)
    {
        if (n == 0){
          return 2;
        }else if (n == 1){
          return 4;
        }else if (n == 2){
          return 7;
        }else if (n > 200){
            return 0;
        }else{
          return secuencia2(n ,impares);
        }
    }
    private int secuencia2 (int n, ArrayList <Integer> impares){
        agregador(impares, aux);
        if (n >= 3){
           return sumarLosImparesMenosElAnterior(n-1, impares) + secuencia(n-1) ;
        }
        return 0;
    }
    private int sumarLosImparesMenosElAnterior (int n, ArrayList <Integer> impares){
       if(n == 0){
         bandera = true;
         return 1;
        }else{
         if(bandera == true){
         bandera = false;
         return impares.get(n) + sumarLosImparesMenosElAnterior(n - 2, impares);
        }else{
         return impares.get(n) + sumarLosImparesMenosElAnterior(n-1, impares);
        }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Secuencia s = new Secuencia();
        System.out.println(s.secuencia(sc.nextInt()));
    }
}
