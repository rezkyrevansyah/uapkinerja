package tugas7;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------PEGAWAI TETAP--------------------");
        Pegawai pegawai1 = new PegawaiTetap("Rajak", "3275032511020014", 2500000);
        System.out.println(pegawai1.toString());
        System.out.println();
        Pegawai pegawai2 = new PegawaiTetap("Danny", "3275032511020015", 2000000);
        System.out.println(pegawai2.toString());
        System.out.println();
        Pegawai pegawai3 = new PegawaiTetap("Diaz", "3275032511020016", 1500000);
        System.out.println(pegawai3.toString());
        System.out.println();
        Pegawai pegawai4 = new PegawaiTetap("Made", "3275032511020023", 3000000);
        System.out.println(pegawai4.toString());

        System.out.println();

        System.out.println("-------------------PEGAWAI HARIAN-------------------");
        Pegawai pegawai5 = new PegawaiHarian("Udin", "3275032511020017", 6500, 35);
        System.out.println(pegawai5.toString());
        System.out.println();
        Pegawai pegawai6 = new PegawaiHarian("Ridho", "3275032511020018", 7000, 40);
        System.out.println(pegawai6.toString());
        System.out.println();
        Pegawai pegawai7 = new PegawaiHarian("Rian", "3275032511020019", 9500, 45);
        System.out.println(pegawai7.toString());
        System.out.println();
        Pegawai pegawai8 = new PegawaiHarian("Salma", "3275032511020024", 10000, 50);
        System.out.println(pegawai8.toString());

        System.out.println();

        System.out.println("-------------------SALES-------------------");
        Pegawai pegawai9 = new Sales("Udin", "32750325110200120", 45, 55000);
        System.out.println(pegawai9.toString());
        System.out.println();
        Pegawai pegawai10 = new Sales("Ridho", "3275032511020021", 40, 45000);
        System.out.println(pegawai10.toString());
        System.out.println();
        Pegawai pegawai11 = new Sales("Karin", "3275032511020022", 60, 85000);
        System.out.println(pegawai11.toString());
        System.out.println();
        Pegawai pegawai12 = new Sales("Anggi", "3275032511020025", 55, 70000);
        System.out.println(pegawai12.toString());
    }
}