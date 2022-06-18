package tugas6;

public class Manajer extends Pekerja {
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String NIP, String nama,
            String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() * 3 / 10 + super.getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLama Kerja     : " + getLamaKerja() + " hari";
    }
}
