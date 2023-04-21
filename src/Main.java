public class Main {
    public static void main(String[] args) {
        System.out.println("Курс 2. Домашняя работа часть 2. ООП");
        System.out.println();
        Machinery car = new Car("Car1", 4, "model1");
        Machinery car2 = new Car("Car2", 4, "model2");
        Machinery truck = new Truck("truck1", 6, "model1", "trailer1");
        Machinery truck2 = new Truck("truck2", 8, "model2", "trailer2");
        Machinery bicycle = new Bicycle("bicycle1", 2);
        Machinery bicycle2 = new Bicycle("bicycle2", 2);

        Machinery[] machinerys = {car, car2, truck, truck2, bicycle, bicycle2};
        ServiceStation station = new ServiceStation();
        station.checkAllMachinery(machinerys);

    }
}
