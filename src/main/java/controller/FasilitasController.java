
package controller;

import java.util.ArrayList;
import models.Fasilitas;
import models.FasilitasUmum;
import models.FasilitasOlahraga;
import view.FasilitasView;

public class FasilitasController {
    
    private final ArrayList<Fasilitas> daftarFasilitas;
    private final FasilitasView view;
    private int idSelanjutnya = 3;

    public FasilitasController(FasilitasView view){
        
        this.view = view;
        this.daftarFasilitas = new ArrayList<>();
        
        daftarFasilitas.add(
                new FasilitasUmum(1, "Gazebo", "Baik", 4, "Tempat Istirahat")      
        );
        daftarFasilitas.add(
                new FasilitasOlahraga(2, "Lapangan Basket", "Baik", 1, "Basket")
        );
    }
    
    private int membuatId() {
        return idSelanjutnya++;
    }
    
    //READ
    public void tampilkanFasilitas() {
        view.tampilkanJudulProses(" DATA FASILITAS TAMAN KOTA");
        
        if (daftarFasilitas.isEmpty()){
            view.tampilkanPesan("Belum ada data fasilitas.");
            return;
        }
        
        for (Fasilitas fasilitas : daftarFasilitas){
            view.tampilkanDataFasilitas(fasilitas);
        }
    }
    
    //CREATE
    public void tambahFasilitas() {
        view.tampilkanJudulProses(" TAMBAH DATA FASILITAS");
        
        int id = membuatId();
        
        String nama = view.inputNama();
        
        view.tampilkanPilihanJenis();
        int pilihanJenis = view.inputPilihanJenis();
        
        if (pilihanJenis != 1 && pilihanJenis != 2){
            view.tampilkanPilihanJenisTidakValid();
            return;
        }
        
        String kondisi = view.inputKondisi();
        int jumlah = view.inputJumlah();
        
        Fasilitas fasilitas;
        
        if (pilihanJenis == 1){
            String jenis = view.inputJenis();
            
            fasilitas = new FasilitasUmum(id, nama, kondisi, jumlah, jenis);
        } else {
            String jenisOlahraga = view.inputJenisOlahraga();
            
            fasilitas = new FasilitasOlahraga(id, nama, kondisi, jumlah, jenisOlahraga);
        }
        
        daftarFasilitas.add(fasilitas);
        
        view.tampilkanPesan("Berhasil!", "Fasilitas berhasil ditambahkan!");
    }
    
    //DELETE
    public void hapusFasilitas() {
        view.tampilkanJudulProses(" HAPUS DATA FASILITAS");
        
        int id = view.inputId();
        
        Fasilitas fasilitasDitemukan = cariFasilitas(id);
        
        if (fasilitasDitemukan == null){
            view.tampilkanPesan("Fasilitas tidak ditemukan!");
            return;
        }
        
        daftarFasilitas.remove(fasilitasDitemukan);
        view.tampilkanPesan("Fasilitas berhasil dihapus!");
    }
    
    //UPDATE
    public void updateFasilitas() {
        view.tampilkanJudulProses(" UPDATE DATA FASILITAS");
        
        int id = view.inputId();
        
        Fasilitas fasilitasDitemukan = cariFasilitas(id);
        
        if (fasilitasDitemukan == null){
            view.tampilkanPesan("Fasilitas dengan ID tersebut tidak ditemukan!");
            return;
        }
        
        String nama = view.inputNama();
        String kondisi = view.inputKondisi();
        int jumlah = view.inputJumlah();
        
        fasilitasDitemukan.setNama(nama);
        fasilitasDitemukan.setKondisi(kondisi);
        fasilitasDitemukan.setJumlah(jumlah);
        
        view.tampilkanPesan("\nFasilitas berhasil diperbarui!");
    }

    private Fasilitas cariFasilitas(int id){
        for (Fasilitas fasilitas : daftarFasilitas){
            if (fasilitas.getId() == id){
                return fasilitas;
            }
        }
        return null;
    }
    
}