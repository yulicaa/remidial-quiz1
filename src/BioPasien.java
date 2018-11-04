/**
 *
 * @author Yulica
 */

public class BioPasien {
    private String noKtp;
    private String nama;
    
     public BioPasien(String noKtp, String nama) {
        this.noKtp = noKtp;
        this.nama = nama;
    }
     
    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info() {   
        String info = "";     
        info += "Nama: " + nama + "\n"; 
        info += "No KTP: " + noKtp + "\n"; 
        return info; 
    } 
}
