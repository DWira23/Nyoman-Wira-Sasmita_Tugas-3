package Tugas3;
public class Kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal, jarakTempuh, bahanBakar;

    public Kendaraan(){
        
    }

    public Kendaraan(int idKendaraan, float jarakTempuhAwal, float jarakTempuh
    , float bahanBakar) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
        this.bahanBakar = bahanBakar;
    }
    
    public int getId() {
        return idKendaraan;
    }

    public void setId(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    
    public float getBahanBakar(){
        return bahanBakar;
    }

    public void setBahanBakar(float bahanBakar){
        this.bahanBakar = bahanBakar;
    }
    
    public float totalJarak(){
        return (getJarakTempuhAwal() + getJarakTempuh());
    }
    
    public float efektifitas(){
        float E;
        E = totalJarak() / getBahanBakar();
        return (float)(Math.exp(E) * (float)Math.log10(2));
    }
    
    public String getEfektifitas(){
        String Test;
        if(efektifitas() > 0 && efektifitas() <= 0.5){
            Test = "Efektif";
        }
        else{
            Test = "Tidak Efektif";
        }
        return Test;
    }
    
    public void infoKendaraan(){
        System.out.println("| ID Kendakaran\t\t: " + getId());
        System.out.println("| Jarak Tempuh Awal\t: " + getJarakTempuhAwal());
        System.out.println("| Jarak Tempuh\t\t: " + getJarakTempuh());
        System.out.println("| Total Jarak\t\t: " + totalJarak());
        System.out.println("| Keefektifitasan Mesin\t: " + getEfektifitas());

    }
}
