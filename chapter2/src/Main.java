import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(Brand.BMW, 100);
        Car car2 = new Car(Brand.Audi, 200);
        Car car3 = new Car(Brand.KIA, 200);
        Car car4 = new Car(Brand.BMW, 200);
        Car car5 = new Car(Brand.BMW, 180);
        List<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car4, car5));
        for (Car car : filterBlackCars(carList)) {
            System.out.printf("%s  %d", car.getBrand());
        }
    }

    public static List<Car> filterBlackCars(List<Car> inventory) {
        List<Car> result = new ArrayList<>();
        for (Car car : inventory) {
            if (Brand.Audi.equals(car.getBrand())) {
                result.add(car);
            }
        }
        return result;
    }
}
