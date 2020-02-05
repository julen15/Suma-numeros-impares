/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.impares;

/**
 *
 * @author demen
 */
public class NumerosImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa que cuenta los numeros impares desde 1 hasta 1000.000.000");
        double   inicio=1;
        double  fin=1000000000 ;
        double  suma=0;
        for (double i=inicio;i<=fin;i++)
        {
            if(i%2!=0)
            {
               suma=suma+i;
                
            }
            
        }
        System.out.println("La suma de los numeros impares de 1 hasta 1000000000 es:"+suma);
        
    }
    
}
