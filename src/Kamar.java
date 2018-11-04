/**
 *
 * @author Yulica
 */

public class Kamar {
    private String namaKamar;
    private Pasien[] arrayPasien;
    
    public Kamar(String namaKamar, int jumlah){
        this.namaKamar = namaKamar;
        this.arrayPasien = new Pasien[jumlah];   
        this.inPasien();
    }

    private void inPasien() {   
        for (int i = 0; i < arrayPasien.length; i++) {     
            this.arrayPasien[i] = new Pasien(String.valueOf(i + 1));   
        } 
    }

    public String getNamaKamar() {
        return namaKamar;
    }

    public void setNamaKamar(String noKamar) {
        this.namaKamar = namaKamar;
    }

    public Pasien[] getArrayPasien() {
        return arrayPasien;
    }    

    private boolean isEmpty(int kode){
        if (this.arrayPasien[kode - 1].getDokter()== null) {
            if(this.arrayPasien[kode - 1].getPerawat()== null){
                return true;
            }
            return true;
        } else {
            return false;
        }
    }
      
    public void setDokterPerawatPasien(Dokter dokter, Perawat perawat, BioPasien bio, int kode) {
        if(isEmpty(kode) == true){
           this.arrayPasien[kode - 1].setDokter(dokter);
           this.arrayPasien[kode - 1].setPerawat(perawat);
           this.arrayPasien[kode - 1].setBio(bio);
        }else{
            System.out.println("Dokter dan Perawat sudah tersedia");
        }
    }
    
    public String info() {   
        String info = "";   
        info += "Nama Kamar: " + namaKamar + "\n";
            for (Pasien pasien : arrayPasien) {
                info += pasien.info();
            }
        return info; 
    }
}
