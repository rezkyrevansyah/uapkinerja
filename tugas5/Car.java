package tugas5;

public class Car {
    private String tipeCar;
    private String plat;
    private String merek;
    private boolean status;

    public Car(String tipeCar, String polNum,
            String merek, boolean status) {
        this.tipeCar = tipeCar;
        this.plat = plat;
        this.merek = merek;
        this.status = status;
    }

    public Car(String a, String b, String c) {
        this.tipeCar = a;
        this.plat = b;
        this.merek = c;
    }

    public String gettipeCar() {
        return tipeCar;
    }

    public String getplat() {
        return plat;
    }

    public String getmerek() {
        return merek;
    }

    public boolean isStatus() {
        return status;
    }

    public static void setStatus(String status) {
        if (status == "true") {
            System.out.println("MOBIL BERHASIL DISEWA");
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public static void status() {
        Car.setStatus("true");
        Car.setStatus("true");
        Car.setStatus("false");
        Car.setStatus("true");
    }
}