/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyect8.java;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Proyect8Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        Scanner n = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        num1 = n.nextInt();
        System.out.println("ingrese el segundo numero numero");
        num2 = n.nextInt();
        for (int i = num1; i <=num2; i++) {
        if (i % 2 != 0) {
                System.out.println(i);
        }
        
        }
    }
}
