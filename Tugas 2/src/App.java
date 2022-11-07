public class App {
    public static void main(String[] args) {
        Asdos asdos1 = new Asdos("Fairuzikun", 23, 4);
        asdos1.tampilkan();
    
        Dosen dosen1 = new Dosen("Raja OP Damanik", 5);
        dosen1.tampilkan();

        Asdos asdos2 = new Asdos("Angel-chan", 20, 4);
        asdos2.tampilkan();
        
        Mahasiswa mahasiswa1 = new Mahasiswa("Firman", 20);
        mahasiswa1.tampilkan();

        Mahasiswa mahasiswa2 = new Mahasiswa("Nid to Pass this sem", 23);
        mahasiswa2.tampilkan();

        Dosen dosen2 = new Dosen("Nivotko", 3);
        dosen2.tampilkan();

        int totalJamSibuk = asdos1.jamSibuk + dosen1.jamSibuk + asdos2.jamSibuk + mahasiswa1.jamSibuk + mahasiswa2.jamSibuk + dosen2.jamSibuk;
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);
    }
}