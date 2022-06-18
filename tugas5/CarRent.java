package tugas5;

public class CarRent {
    private CarRider rider;
    private Car car;
    private int durasi;

    public CarRent(CarRider rider, Car car, int durasi) {
        this.rider = rider;
        this.car = car;
        this.durasi = durasi;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getDurasi() {
        return durasi;
    }
}