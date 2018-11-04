/**
 *
 * @author Yulica
 */

public class MainTugas {
    public static void main(String[] args) {
        Dokter d = new Dokter("DOC001", "Dr. Prasetya");
        Perawat p = new Perawat("N001", "Mrs. Rani");
        BioPasien bps = new BioPasien("174172", "Cantika");
        Kamar k = new Kamar("Paviliun", 5);
        k.setDokterPerawatPasien(d, p, bps, 1);
        
        
        System.out.println(k.info());    
    }
    
}
