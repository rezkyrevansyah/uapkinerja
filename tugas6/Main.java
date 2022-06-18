package tugas6;

public class Main {
    public static void main(String[] args) {

        Manusia man1 = new Manusia("Ridwan Pikola", "3251102003329",
                true, true);
        Manusia woman1 = new Manusia("Aura Salsabila", "3251102106654",
                false, false);
        Manusia man2 = new Manusia("M. Rezky Revansyah", "3251102095674",
                true, true);
        Manusia woman2 = new Manusia("Salwa Usaila", "3251102095674",
                true, true);

        System.out.println(man1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(woman1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(man2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(woman2.toString());

        System.out.println();
        System.out.println("============================================");

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Latifa Nurul Huda", "3575032511020083",
                false, false, "325777123245", 3.8);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Bhayu Ananda Siswoyo", "3675032512356654",
                true, false, "625745789245", 3.4);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Rabi'ah Al Adawiyah", "3575032512776352",
                false, false, "60332211245", 3.7);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Sherina", "3775032512878862",
                false, false, "41223345774", 3.3);

        System.out.println(mhs1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(mhs2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(mhs3.toString());
        System.out.println("-------------------------------------------");
        System.out.println(mhs4.toString());

        System.out.println();
        System.out.println("============================================");

        Pekerja pekerja1 = new Pekerja(4, 21, "205150335611018", "Ronaldo", "3475022736645", true, true);
        Pekerja pekerja2 = new Pekerja(7, 24, "315122637748334", "David De Gea", "37250325567749", false, false);
        Pekerja pekerja3 = new Pekerja(8, 24, "185166732899556", "Jadon Sancho", "36750325544161", false, false);
        Pekerja pekerja4 = new Pekerja(7, 22, "485133849956234", "Edinson Cavani", "35750324556631", true, true);

        System.out.println(pekerja1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pekerja2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pekerja3.toString());
        System.out.println("-------------------------------------------");
        System.out.println(pekerja4.toString());

        System.out.println();
        System.out.println("============================================");

        Manajer manajer1 = new Manajer(9, 20, "305071222653", "Sir Alex Ferguson", "3675032511022273", true, false,
                1450);
        Manajer manajer2 = new Manajer(8, 22, "201566735541", "Jurgen Klopp", "3575032511722834", false, false, 1450);
        Manajer manajer3 = new Manajer(8, 24, "401566542256", "Pep Guardiola", "3475032512994855", true, true, 1500);
        Manajer manajer4 = new Manajer(8, 24, "305050712263", "Steven Gerrard", "3375032511622734", true, true, 1400);

        System.out.println(manajer1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(manajer2.toString());
        System.out.println("-------------------------------------------");
        System.out.println(manajer3.toString());
        System.out.println("-------------------------------------------");
        System.out.println(manajer4.toString());

        System.out.println("============================================");
    }
}
