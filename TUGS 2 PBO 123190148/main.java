public class Main {
    public static void main(String[] args){
        int select=0;

        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("1. Persegi Panjang \n2. Lingkaran \n3. Segitiga");
        System.out.println("Masukan Pilihan : ");
        select=input.nextInt();
        switch(select)
        {   
            case 1 : 
            System.out.println("Luas dan Keliling Persegi Panjang");
            PersegiPanjang a = new PersegiPanjang();
            a.tampilkan();
            
            break;

            case 2 : 
            System.out.println("Luas dan Keliling Lingkaran");
            Lingkaran b = new Lingkaran();
            b.tampilkan();
            
            break;

            case 3 : 
            System.out.println("Luas dan Keliling Segitiga");
            PersegiPanjang c = new Segitiga();
            c.tampilkan();
            
            break;
        }
    }
}