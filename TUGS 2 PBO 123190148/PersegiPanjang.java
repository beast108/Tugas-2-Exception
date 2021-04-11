public class PersegiPanjang extends BangunDatar {
    BangunDatar bd = new BangunDatar();
    float p = 0;
    float l = 0;
    
    try {
        p=Float.parseInt(args[0]);
        l=Float.parseInt(args[0]);
        System.out.println("Masukkan Panjang : "+p);
        System.out.println("Masukan Lebar : "+l);
        bd.luas = p*l;
        bd.keliling = (2*p)+(2*l);
    } catch (NumberFormatingException nfe) {
        System.out.println ("Harus Angka");
    } finally {
        bd.tampilkandata();
    }
}
