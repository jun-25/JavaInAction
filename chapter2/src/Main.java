import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(Arrays.asList(new Car(Brand.BMW, 100),
                                                           new Car(Brand.Audi, 200),
                                                           new Car(Brand.KIA, 200),
                                                           new Car(Brand.BMW, 200),
                                                           new Car(Brand.BMW, 180)));
        List<Car> result = filterCars(carList, (Car car) -> Brand.Audi.equals(car.getBrand()));

        for(Car car : result){
            System.out.println(car.getBrand());
        }
            }

    public static <T> List<T> filterCars(List<T> inventory,CarPredicate<T> carp){
        List<T> result = new ArrayList<>();
        for(T e : inventory){
            if(carp.test(e))
                result.add(e);
        }
        return result;
        }
    }


