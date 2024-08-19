//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa grace = new Siswa();
        Siswa aya = new Siswa();
        Siswa cila = new Siswa();
        Siswa bella = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 81;
        rasyid.id = 30;
        rasyid.nama = "rasyid";
        rasyid.ipk = 81;
        grace.id = 12;
        grace.nama = "grace";
        grace.ipk = 81;
        aya.id = 36;
        aya.nama = "aya";
        aya.ipk = 98;
        cila.id = 7;
        cila.nama = "cila";
        cila.ipk = 80;
        bella.id = 5;
        bella.nama = "bella";
        bella.ipk = 81;

        sabrina.print();
        rasyid.print();
        grace.print();
        aya.print();
        cila.print();
        bella.print();
    
    }
}
