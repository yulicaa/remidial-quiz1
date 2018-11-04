/**
 *
 * @author Yulica
 */

public class Perawat {
    private String nip;
    private String nama;

    public Perawat(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info() {   
        String info = "";   
        info += "NIP: " + nip + "\n";   
        info += "Nama: " + nama + "\n";   
        return info; 
    } 
}
