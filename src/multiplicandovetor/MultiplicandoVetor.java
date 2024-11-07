/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicandovetor;

/**
 *
 * @author Noa
 */
public class MultiplicandoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int numeros [] = new int [10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = Entrada.leiaInt("Informe um numnero: " + i);
        }
        
        System.out.println("Vetor lido: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        System.out.println("");
        
        int numero = Entrada.leiaInt("Informe um numero para multiplicar: ");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = numeros[i] * numero;
        }
        
        System.out.println("Valores multiplicados por: " + numero);
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        
        System.exit(0);
    }
    
}
