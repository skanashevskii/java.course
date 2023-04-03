package oop2;

public class ServiceStation implements Service {
    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("-----------------");
            System.out.println("Обслуживаем " + car.getModelName());
            System.out.println("-----------------");
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("---------------------");
            System.out.println("Обслуживаем " + truck.getModelName());
            System.out.println("---------------------");
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("-----------------------");
            System.out.println("Обслуживаем " + bicycle.getModelName());
            System.out.println("-----------------------");
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
