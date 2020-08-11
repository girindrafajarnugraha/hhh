/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesSearching;

/**
 *
 * @author ACER
 */
import MergeSortTest.MergeSort;
import java.util.Scanner;
public class SearchingMain {
    public static void main(String[] args) {
        Scanner indra = new Scanner(System.in);
        int cari;
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        int dataB[] = {100, 90, 80, 70, 60, 50, 40, 30};
        int dataC[] = {100, 90, 80, 70, 60, 50, 40, 30};
        Searching pencarian = new Searching(data, 8);
        Searching pencarianB = new Searching(dataB, 8);
        
        System.out.println("Isi Array Sequential: ");
        pencarian.TampilData();
        System.out.println("Isi Array Binary: ");
        pencarianB.TampilData();
        System.out.println("================================");
        System.out.println("Sorting dengan Merge Sort");
        MergeSort mSort = new MergeSort();
        System.out.println("Data Awal");
        mSort.printArray(dataC);
        mSort.mergeSort(dataC);
        System.out.println("Setelah diurutkan");
        mSort.printArray(dataC);
        System.out.println("");
        System.out.print("Masukkan nilai yang ingin dicari : ");
        cari = indra.nextInt();
        
        
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1){
            System.out.println("Data: " + cari + " ditemukan pada indeks " + posisi);
        }else {
            System.out.println("Data: " + cari + " tidak ditemukan ");
        }
        
        int posisiB = pencarianB.FindSeqSearch(cari);
        System.out.println("==============================");
        System.out.println("Menggunakan binary search");
        pencarianB.TampilPosisi(cari, posisi);
    }
}
