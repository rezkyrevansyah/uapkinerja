package tugas5;

import java.util.ArrayList;

public class RentArchive {
    private static ArrayList<CarRent> rentData = new ArrayList<CarRent>();

    public void Rent(CarRider rider, Car car, int rentDur) {
        CarRent rent = new CarRent(rider, car,
                rentDur);
        rentData.add(rent);

    }

    public void info() {

        System.out.println("------------------------------");
        System.out.println("     INFORMASI PELANGGAN   ");

        System.out.println("------------------------------");
        for (CarRent data : RentArchive.rentData) {
            System.out.println("NAMA PEMINJAM : " + data.getRider().getNama());
            System.out.println("TIPE MOBIL : " + data.getCar().gettipeCar());
            System.out.println("NO. POLISI : " + data.getCar().getplat());
            System.out.println("LAMA RENTAL : " + data.getDurasi());
            System.out.println("------------------------------");

        }

    }

}
