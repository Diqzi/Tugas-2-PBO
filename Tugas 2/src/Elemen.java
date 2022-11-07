public class Elemen {
    public String nama;

    public Elemen (String nama){ //constructor
        this.nama = nama;
    }

}
class Mahasiswa extends Elemen{
    private int sks;
    public int jamSibuk;

    public Mahasiswa(String nama, int sks) {
        super(nama);
        jamSibuk = sks * 3;   
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
    public void tampilkan(){
        System.out.println(nama + " adalah seorang mahasiswa dengan jam sibuk " + " " + jamSibuk);
    }

}
class Dosen extends Elemen{
    private int jumlahHariKerja;
    public int jamSibuk;

    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja * 8;
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
    public void tampilkan(){
        System.out.println(nama + " adalah seorang dosen dengan jam sibuk" + " " + jamSibuk);
    }


} 
class Asdos extends Mahasiswa{
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos) {
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;        
    }
    public int getJamSibuk(){
        return jamSibuk;
    }
    public void tampilkan(){
        System.out.println(nama + " adalah seorang Asdos dengan jam sibuk" + " " + jamSibuk);
    }

}