import java.util.Scanner;
public class Factorial
{
    public int factorial(int n)
    {
        if(n == 0){
           return 1;
        }else if (n == 1){
           return 1;
        }else{
           return factorial(n - 1) * n;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
        System.out.println(f.factorial(sc.nextInt()));
    }
}
