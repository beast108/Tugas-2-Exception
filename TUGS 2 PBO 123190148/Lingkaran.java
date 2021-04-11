public class Lingkaran extends BangunDatar {
    BangunDatar bd = new BangunDatar();
    float jari = 0;
    float phi = 3.14;
    
    try {
        jari=Float.parseInt(args[0]);
        System.out.println("Masukkan Jari-Jari : "+jari);
        bd.luas = phi*jari*jari;
        bd.keliling = 2*phi*jari;
    } catch (NumberFormatingException nfe) {
        System.out.println ("Harus Angka");
    } finally {
        bd.tampilkandata();
    }
}
