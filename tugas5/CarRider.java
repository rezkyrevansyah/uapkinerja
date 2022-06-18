package tugas5;

public class CarRider {
    private String nama;
    private int umur;
    private String noTelp;

    public CarRider(String nama, int umur, String noTelp) {
        this.nama = nama;
        this.umur = umur;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNoTelp() {
        return noTelp;
    }
}