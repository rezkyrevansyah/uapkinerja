package tugas5;

import java.util.ArrayList;

public class CarData {
    private static ArrayList<Car> listCar = new ArrayList<Car>();

    public ArrayList<Car> getListCar() {
        return listCar;
    }

    public void setListCar(ArrayList<Car> listCar) {
        CarData.listCar = listCar;
    }

    public void addCar(String tipeCar, String plat, String merek) {
        Car car = new Car(tipeCar, plat, merek);
        listCar.add(car);
    }

    public void listOfCar() {

        System.out.println("------------------------------");
        System.out.println("\t DAFTAR MOBIL \t");

        System.out.println("------------------------------");
        for (Car data : listCar) {

            System.out.println("TIPE MOBIL  : " + data.gettipeCar());
            System.out.println("NO.POLISI   : " + data.getplat());
            System.out.println("MERK MOBIL  : " + data.getmerek());
            System.out.println("------------------------------");

        }

    }

}
