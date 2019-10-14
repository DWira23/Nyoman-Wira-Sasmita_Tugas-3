package Tugas3;
public class Mobil extends Kendaraan {
    private String namaKendaraan, tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public String getNama() {
        return namaKendaraan;
    }

    public void setNama(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getTipe() {
        return tipeKendaraan;
    }

    public void setTipe(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public float getBahanBakar(){
        return bahanBakar;
    }
    
    @Override
    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public Mobil(){
        
    }
    
    public Mobil(String namaKendaraan, String tipeKendaraan, int kapasitasMesin, 
            float bahanBakar, int idKendaraan, float jarakTempuhAwal, 
            float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh, bahanBakar);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.kapasitasMesin = kapasitasMesin;
        this.bahanBakar = bahanBakar;
    }
    
    @Override
    public void infoKendaraan(){
        System.out.println("=================================================");
        System.out.println("===================== Mobil =====================");
        System.out.println("=================================================\n");
        System.out.println("| Nama\t\t\t: " + getNama());
        System.out.println("| Tipe\t\t\t: " + getTipe());
        System.out.println("| Kapasitas Mesin\t: " + getKapasitasMesin());
        System.out.println("| Bahan Bakar\t\t: " + getBahanBakar());
        super.infoKendaraan();
        System.out.println("\n=================================================");
    }
}
