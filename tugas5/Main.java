package tugas5;

public class Main {
        public static void main(String[] args) {
        CarRider rider1 = new CarRider("M. Rezky", 19, "081283950404");
        CarRider rider2 = new CarRider("Alvi Alia", 18, "081388764556");
        CarRider rider3 = new CarRider("Ridho Daffa", 21, "085177698758");
        CarRider rider4 = new CarRider("Vivian Carla", 17, "087756308643");

        CarData data = new CarData();
        data.addCar("ELEKTRIK", "B 10 TI", "Tesla");
        data.addCar("OFFROAD", "B 20 PTI", "Suzuki");
        data.addCar("CONVERTIBLE", "B 30 SI", "BMW");
        data.addCar("SEDAN", "B 40 TIF", "Hyundai");

        data.listOfCar();

        RentArchive arsip = new RentArchive();
        arsip.Rent(rider1,
                data.getListCar().get(0), 8);
        arsip.Rent(rider2,
                data.getListCar().get(1), 4);
        arsip.Rent(rider3,
                data.getListCar().get(2), 11);
        arsip.Rent(rider4,
                data.getListCar().get(3), 5);
        System.out.println();
        Car.status();

        System.out.println();
        arsip.info();

    }
}
