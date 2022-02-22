/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rico
 */
public class Array {
    public static void main(String[] args){
        
    
        //Cara Membuat Array
        String[] name;
        name = new String[10];
        name[0] = "Deny";
        name[1] = "Adi";
        name[2] = "Putra";
        name[3] = "Putra";
        
        //cara 2
        int[] umur = new int[] {
            2, 4, 9, 10, 30
        };
        
        //cara 3
        String[] mahasiswa = {
            "Deny", "Dina", "Duna"
        };
        
        System.out.println(mahasiswa[1]); //mengambil
        var result  = mahasiswa[0] = "Adi"; //mengubah
        System.out.println(result);
        System.out.println(mahasiswa.length); //mengambil panjang array
        
        
        String[][] data = {
          
            {
                "Dina", "Ayu", "Shinta"
            },
            
            {
                "Deny", "Dina", "Duna"
            }
        };
            
        //cara mengambil data
//       cara pertama 
        String[] hasil = data[0];
        System.out.println(hasil[1]);
        
        //cara ke2
        System.out.println(data[1][1]); 
                
    }
    
    
}
