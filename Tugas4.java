/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Tugas4 {
    int index=-1;
    
    public void pencarian(String data[][],String cari){
        for(int a = 0; a < data.length; a++){            
            if(cari.equals(data[a][0])){
                index = a;
            }                        
        }
    } 
    public static void main(String[] args) {      
        Scanner indra = new Scanner (System.in);
        int jumlah;
        System.out.print("Jumlah penduduk : ");
        jumlah = indra.nextInt();
        String data[][] = new String[jumlah][4];
        String ket [] ={"NIK","Nama","Alamat","Jenis Kelamin"};
        
        for(int a = 0; a < jumlah; a++){
            System.out.println("Penduduk ke-" + (a+1));
            for(int i = 0; i < ket.length; i++){
                System.out.print(ket[i]+" : ");
                data[a][i] = indra.next();
            }
            System.out.println();
        }
        System.out.println("Masukkan data yang ingin dicari (Sesuai NIK) : ");
        String cari = indra.next();
        System.out.println();
        
        Tugas4 tug4 = new Tugas4();
        tug4.pencarian(data, cari);
        
        if(tug4.index!=-1){
            for(int i=0;i<ket.length;i++){
                System.out.println(ket[i]+" : "+data[tug4.index][i]);
            }
        }else{
            System.out.println("Data tidak ditemukan!");
        }
    }
}
