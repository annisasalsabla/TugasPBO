/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasspbo;

/**
 *
 * @author hasan
 */
public class Tugas2 {
    public static void main(String[] args) {
        char abjad = 'A';
        char n;
        char i;
        for ( n = 5; n >= 1; n--) {
            for ( i = 1; i <= n; i++) {
                System.out.print((char)(64+i)+ "");
                abjad++;
            }
            System.out.println();
        }
          
    }
    }
