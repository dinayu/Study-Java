/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rico
 */
public class OperasiBoolean {
    public static void main(String[] args){
        
        int angka1 = 14;
        int angka2 = 16;
        
        
        //and
        boolean lulusUts = angka1 > 75;
        boolean lulusUas = angka2 > 75;
        boolean lulus = lulusUts && lulusUas;
         System.out.println(lulus);
        
         
        //or
        boolean lulusUts1 = angka1 > 75;
        boolean lulusUas1 = angka1 > 75;
        boolean lulus1 = lulusUts1 || lulusUas1;
         System.out.println(lulus1);
    }
    
}
