
package models;

/**
 *
 * @author LENOVO
 */
public class FasilitasOlahraga extends Fasilitas implements Evalutable{
    private String jenisOlahraga;
    
    public FasilitasOlahraga(int id, String nama, String kondisi, int jumlah, String jenisOlahraga){
        super(id, nama, kondisi, jumlah);
        setJenisOlahraga(jenisOlahraga);
    }
    
    public String getJenisOlahraga(){
        return jenisOlahraga;
    }
    
    public void setJenisOlahraga(String jenisOlahraga){
        if (jenisOlahraga == null || jenisOlahraga.trim().isEmpty()){
            throw new IllegalArgumentException("Jenis olahraga tidak boleh kosong!");
        }
        this.jenisOlahraga = jenisOlahraga;
    }
    
    @Override
    public String getKategori(){
        return "Fasilitas Olahraga";
    }
    
    @Override
    public String evaluasiKelayakan(){
        if (getKondisi().equalsIgnoreCase("Baik")){
            return "Fasilitas layak digunakan";
        } else if (getKondisi().equalsIgnoreCase("Cukup")){
            return "Fasilitas perlu dipantau";
        } else {
            return "Fasilitas perlu perbaikan";
        }
    }    
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Kategori: " + getKategori());
        System.out.println("Olahraga: " + jenisOlahraga);
        System.out.println("Evaluasi: " + evaluasiKelayakan());
    }
    
}
