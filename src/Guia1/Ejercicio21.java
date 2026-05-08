package Guia1;

import java.util.Scanner;

public class Ejercicio21 {
    
    public void FactorialDeUnNumero(){
        Scanner FactorialIngreso = new Scanner(System.in);

        System.out.println("Ingrese el numero para sacar su factorial");
        int NumeroFactorial= FactorialIngreso.nextInt();
        
        int Resultado=0;
        for(int j =1 ;j<NumeroFactorial;j++){
            System.out.println("Factorial "+ j+"NumeroFactorial "+NumeroFactorial+ "Resultado "+(Resultado=Resultado+(NumeroFactorial*j)));
        }

    }


}
