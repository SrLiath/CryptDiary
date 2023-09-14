/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zeus;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Zeus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digita 10 para Imprimir e Digita 2 para Imprimir \n");
        Scanner scanner = new Scanner(System.in);
        int Escolha=scanner.nextInt();
        if (Escolha==10){System.out.println("Escolheu numero 10");
            
        }else {System.out.println("Nao escolheu o numero 10");
            
        }
    }
    
}
