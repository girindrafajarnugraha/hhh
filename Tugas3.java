/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Tugas3 {
    int terbesar = 0;
    int jmlterbesar = 0;
    int index[] = new int[10];
    int i = 0;
    
    public void pencarian(int data[]){
        for(int a = 0; a < data.length; a++){
            if(data[a] >= terbesar){
                terbesar = data[a];
            }            
        }
        for(int a = 0; a < data.length; a++){
            if(data[a] == terbesar){                    
                jmlterbesar++;
                index[i] = a;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        
        System.out.println("Data awal : ");
        for (int x = 0; x < data.length; x++){
            System.out.print(data[x]+" ");
        }
        
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data.length; j++){
                if (data[i] < data[j]){
                    int hasil = data[i];
                    data[i] = data[j];
                    data[j] = hasil;
                }
            }
        }
        System.out.println();
        System.out.println("Data setelah diurutkan : ");
        for (int x = 0; x < data.length; x++){
            System.out.print(data[x]+" ");
        }
        
        Tugas3 tug3 = new Tugas3();
        tug3.pencarian(data);
        
        System.out.println();
        System.out.println("=======================================");
        System.out.print("Data terbesar                 : "+ tug3.terbesar + "\n");
        System.out.print("Banyak data terbesar          : "+ tug3.jmlterbesar + "\n");
        System.out.print("Data terbesar berada pada index ke-");
        for(int i = 0; i < tug3.i; i++){
            System.out.print(tug3.index[i] + ", ");
        }
        System.out.println();
        System.out.println("=======================================");
    }
}
