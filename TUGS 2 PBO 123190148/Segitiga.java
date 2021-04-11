public class Segitiga extends BangunDatar {
    BangunDatar bd = new BangunDatar();
    float a = 0;
    float t = 0;
    float m = 0;
    
    try {
        a=Float.parseInt(args[0]);
        t=Float.parseInt(args[0]);
        System.out.println("Masukkan Panjang Alas : "+a);
        System.out.println("Masukkan Tinggi : "+t);
        System.out.println("Masukkan Sisi Miring : "+m);
        bd.luas = a*t/2;
        bd.keliling = a+t+m;
    } catch (NumberFormatingException nfe) {
        System.out.println ("Harus Angka");
    } finally {
        bd.tampilkandata();
    }
}
