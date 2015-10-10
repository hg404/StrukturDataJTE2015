public class Pasien
{
    String nama;
    Pemeriksaan [] pemeriksaan;
    public Pasien( Pemeriksaan [] pemeriksaan ){
    this.pemeriksaan = pemeriksaan;
    }
    public Pemeriksaan [] daftarPemeriksaan(){
        return pemeriksaan;
    }
}
