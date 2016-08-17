/*
 Leer un número de dos dígitos y determinar si pertenece a la serie de Fibonacci.
 */
package punto10laboratorio1;


import java.util.Scanner;

public class Punto10laboratorio1 {

    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int x,i,anterior,actual;
        anterior=0;
        actual = 0;
        i = 0;
        System.out.println("digite un numero");
        x = lector.nextInt();
        int a=0;
        //if(x>1)
            while (actual<x){
                actual+=anterior;
                anterior=i;
                i=actual;
                if(a==1)
                    actual=1;
                a++;
            }
        
        if(x-actual==0)
            System.out.println("pertenece a la serie de fibonacci");  
        else
            System.out.println("no pertenece a la serie de fivonacci");
    }
    
}
