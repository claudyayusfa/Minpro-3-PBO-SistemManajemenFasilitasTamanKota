
package models;

public abstract class Fasilitas {
    private int id;
    private String nama;
    private String kondisi;
    private int jumlah;
    
    //Constructor
    public Fasilitas(int id, String nama, String kondisi, int jumlah) {
        setId(id);
        setNama(nama);
        setKondisi(kondisi);
        setJumlah(jumlah);
    }
    
    //Getter and Setter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        if (id <= 0){
            throw new IllegalArgumentException("ID harus lebih dari 0!");
        }
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()){
            throw new IllegalArgumentException("Nama tidak boleh kosong!");
        }
        this.nama = nama;
    }
    
    public String getKondisi() {
        return kondisi;
    }
    
    public void setKondisi(String kondisi) {
        if (kondisi == null || kondisi.trim().isEmpty()){
            throw new IllegalArgumentException("Kondisi tidak boleh kosong!");
        }
        
        if (!kondisi.equalsIgnoreCase("Baik")
                && !kondisi.equalsIgnoreCase("Cukup")
                && !kondisi.equalsIgnoreCase("Rusak")){
            throw new IllegalArgumentException(
                    "Kondisi harus Baik, Cukup, atau Rusak!"
            );
        }
        this.kondisi = kondisi;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    public void setJumlah(int jumlah) {
        if (jumlah < 0) {
            throw new IllegalArgumentException("Jumlah tidak boleh negatif!");
        }
        this.jumlah = jumlah;
    }
    
    public abstract String getKategori();
    
    public void tampilkanInfo(){
        System.out.println("ID Fasilitas: " + id);
        System.out.println("Nama    : " + nama);
        System.out.println("Kondisi : " + kondisi);
        System.out.println("Jumlah  : " + jumlah);
    }
}