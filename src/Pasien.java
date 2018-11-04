/**
 *
 * @author Yulica
 */

public class Pasien {
    private String kode;
    private BioPasien bio;
    private Dokter dokter;
    private Perawat perawat;

    public Pasien(String kode) {
        this.kode = kode;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public BioPasien getBio() {
        return bio;
    }

    public void setBio(BioPasien bio) {
        this.bio = bio;
    }
    
    
    public String info() {   
        String info = "";   
        info += "Kode: " + kode + "\n";
        if (this.bio != null) {     
            info += "Pasien: " + "\n" + bio.info() + "\n";   
        }
        if (this.dokter != null) {     
            info += "Dokter: " + "\n" + dokter.info() + "\n";   
        }
        if (this.perawat != null) {     
            info += "Perawat: " + "\n" + perawat.info() + "\n";   
        }
        return info; 
    }
    
}
