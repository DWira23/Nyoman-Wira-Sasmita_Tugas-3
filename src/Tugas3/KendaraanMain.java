package Tugas3;
import java.util.Scanner;
public class KendaraanMain {
    public static void main(String[] args) {
        
        Mobil a = new Mobil();
        SepedaMotor b = new SepedaMotor();
        Scanner input = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Jenis yang akan dipilih");
        System.out.println("1. Mobil");
        System.out.println("2. Sepeda Motor");
        System.out.print("Pilih salah satu : ");
                
        int z = input.nextInt();
        System.out.println("=================================================");
        if(z==1){
            System.out.print("| Nama\t\t\t: ");
            String namaMobil = input.next();
            System.out.print("| Tipe\t\t\t: ");
            String tipeMobil = input.next();

            System.out.print("| ID Kendaraan\t\t: ");
            int IdKendaraan = input.nextInt();
            System.out.print("| Kapasitas Mesin\t: ");
            int kapasitasMesin = input.nextInt();
            System.out.print("| Jarak Awal\t\t: ");
            float jarakAwalMobil = input.nextFloat();
            System.out.print("| Jarak Tempuh\t\t: ");
            float jarakTempuhMobil = input.nextFloat();
            System.out.print("| Bahan Bakar\t\t: ");
            float BBMobil = input.nextFloat();
            
            a.setNama(namaMobil);
            a.setTipe(tipeMobil);
            a.setId(IdKendaraan);
            a.setKapasitasMesin(kapasitasMesin);
            a.setJarakTempuhAwal(jarakAwalMobil);
            a.setJarakTempuh(jarakTempuhMobil);
            a.setBahanBakar(BBMobil);
            a.infoKendaraan();
            
        }
        
        else if(z==2){
            System.out.print("| Nama\t\t\t: ");
            String namaSM = input.next();
            System.out.print("| Tipe\t\t\t: ");
            String tipeSM = input.next();
            System.out.print("| ID Kendaraan\t\t: ");
            int IdKendaraan = input.nextInt();
            System.out.print("| Jarak Awal\t\t: ");
            float jarakAwalSM = input.nextFloat();
            System.out.print("| Jarak Tempuh\t\t: ");
            float jarakTempuhSM = input.nextFloat();
            System.out.print("| Bahan Bakar\t\t: ");
            float BBSM = input.nextFloat();
            b.setNama(namaSM);
            b.setTipe(tipeSM);
            b.setId(IdKendaraan);
            b.setJarakTempuhAwal(jarakAwalSM);
            b.setJarakTempuh(jarakTempuhSM);
            b.setBahanBakar(BBSM);
            b.infoKendaraan();
        }
        
        else{
            System.out.println("Angka yang anda masukkan salah");
        }
    }
}
