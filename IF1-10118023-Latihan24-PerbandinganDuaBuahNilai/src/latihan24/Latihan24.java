/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan24;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Perbandingan Dua Buah Nilai
 */

public class Latihan24 {

    public static void main(String[] args) {
        String status;
        int nilai1;
        int nilai2;
        String cek;
        
        //proses
        do{
            System.out.println("==========Program Perbandingan Nilai==========");
            System.out.print("Masukkan Nilai Pertama\t: ");
            Scanner input = new Scanner(System.in);
            nilai1 = input.nextInt();
            
            System.out.print("Masukkan Nilai Kedua\t: ");
            nilai2 = input.nextInt();
           
            cek = (nilai1 > nilai2)?" Lebih Besar ":" Lebih Kecil ";
            System.out.println("Hasil\t\t\t: " + nilai1 + cek + nilai2);
 
            System.out.print("Ulangi Aktivitas? [Ya/Tidak] : ");    
            Scanner ulangi = new Scanner(System.in);
            status = ulangi.nextLine();
            System.out.println("");
            
            System.out.println("Developed by : Zaenal Anzarry");
            System.out.println("");
        }while(status.equals("Ya") || status.equals("ya"));
    }
}
    

