import java.util.Scanner;


public class Num2{
    public static void main(String[]args){
         System.out.println("Ingrese el n�mero");
        Scanner s=new Scanner(System.in);
           int n= s.nextInt();
        if(n%2==0)
         System.out.println("es par");
        else
        	System.out.println("es impar");
    }
}