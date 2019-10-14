package Tugas3;
public class SepedaMotor extends Kendaraan{
    private String namaKendaraan, tipeKendaraan;
    private float bahanBakar;

    public SepedaMotor(){
        
    }
    
    public SepedaMotor(String namaKendaraan, String tipeKendaraan, 
            float bahanBakar, int idKendaraan, float jarakTempuhAwal, 
            float jarakTempuh, float BB) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh, bahanBakar);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.bahanBakar = bahanBakar;
    }

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

    @Override
    public float getBahanBakar(){
        return bahanBakar;
    }
    
    @Override
    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void infoKendaraan(){
        System.out.println("=================================================");
        System.out.println("================== SepedaMotor ==================");
        System.out.println("=================================================\n");
        System.out.println("| Nama\t\t\t: " + getNama());
        System.out.println("| Tipe\t\t\t: " + getTipe());
        super.infoKendaraan();
        System.out.println("\n=================================================");
    }
}