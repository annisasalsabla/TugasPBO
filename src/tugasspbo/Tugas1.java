/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasspbo;

/**
 *
 * @author hasan
 */
public class Tugas1 {
   public static void main(String[] args) {
        int n, i;

        for (n = 0; n <= 3; n++) {
            for (i = 3; i >= n; i--) {
                System.out.print(" ");
            }

            for (i = 1; i <= n * 2 - 1; i++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }  
}
