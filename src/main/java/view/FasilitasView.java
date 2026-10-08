
package view;

import helper.InputHelper;
import models.Fasilitas;

/**
 *
 * @author LENOVO
 */
public class FasilitasView {
    
    public void tampilkanJudul(){
        System.out.println("\n======================================");
        System.out.println("SISTEM MANAJEMEN FASILITAS TAMAN KOTA");
        System.out.println("======================================");
    }
    
    public void tampilkanMenu(){
        System.out.println("1. Tampilkan Fasilitas");
        System.out.println("2. Tambah Fasilitas");
        System.out.println("3. Hapus Fasilitas");
        System.out.println("4. Update Fasilitas");
        System.out.println("5. Keluar dari Program");
        System.out.println("======================================");
    }
    
    public int pilihMenu(){
        return InputHelper.inputInteger("Pilih Menu (1-5): ");
    }
    
    public void tampilkanJudulProses(String judul){
        System.out.println("\n" + judul);
        System.out.println("--------------------------------------");
    }
    
    public void tampilkanDataFasilitas(Fasilitas fasilitas){
        System.out.println("\n--------------------------------------");
        fasilitas.tampilkanInfo();
    }
    
    public void tampilkanPesan(String pesan){
        System.out.println(pesan);
    }
    
    public void tampilkanPesan(String judul, String pesan){
        System.out.println("\n" + judul);
        System.out.println(pesan);
    }
    
    public int inputId(){
        while (true){
            int id = InputHelper.inputInteger("ID Fasilitas: ");
            
            if (id > 0){
                return id;
            }
            System.out.println("ID harus lebih dari 0!");
        }
    }
    
    public String inputNama(){
        return InputHelper.inputString("Nama Fasilitas: ");
    }
    
    public String inputKondisi(){
        System.out.println("\nKondisi Fasilitas: ");
        return InputHelper.inputKondisi();
    }
    
    public int inputJumlah(){
        return InputHelper.inputInteger("Jumlah Fasilitas: ");
    }
    
    public void tampilkanPilihanJenis(){
        System.out.println("\nPilih Jenis Fasilitas");
        System.out.println("1. Fasilitas Umum");
        System.out.println("2. Fasilitas Olahraga");
    }
    
    public int inputPilihanJenis(){
        return InputHelper.inputInteger("Pilih jenis (1-2): ");
    }
    
    public String inputJenis(){
        return InputHelper.inputString("Jenis Fasilitas Umum: ");
    }
    
    public String inputJenisOlahraga(){
        return InputHelper.inputString("Jenis Olahraga: ");
    }
    
    public void tampilkanPilihanJenisTidakValid(){
        System.out.println("Pilihan jenis tidak valid!");
    }
}
