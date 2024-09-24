import java.util.Scanner;
import java.util.ArrayList;
public class Digipares
{
    ArrayList <Integer> pares = new ArrayList <> ();
    ArrayList <Integer> impares = new ArrayList <> ();
    boolean bandera = true;
    public int digipares(int n)
    {
        if (bandera == true){
          int aux = 0;
          int aux2 = 0;
          if (n == 0){
           bandera = false;
           return sumaDePares(pares, aux) * sumaDeImpares(impares,aux2);
          }else{
           if(n%2 == 0){
              pares.add(n%10);
            }else{
              impares.add(n%10);
            }
           return digipares(n/10);
          }
        }else{
           bandera = true;
           pares.clear();
           impares.clear();
        }
        return digipares(n);
    }
    private int sumaDePares (ArrayList <Integer> pares, int aux){
        int resp = 0;
        if(aux == pares.size()){
          return resp;
        }else{ 
          return resp = pares.get(aux) + sumaDePares(pares,aux + 1);
        }
    }
    private int sumaDeImpares (ArrayList <Integer> impares, int aux){
        int resp = 0;
       if(aux == impares.size()){
          return resp;
        }else{ 
          return resp = impares.get(aux) + sumaDeImpares(impares,aux + 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Digipares d = new Digipares();
        System.out.println(d.digipares(sc.nextInt()));
    }
}
