package com.epam.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRunner {

    public static void main(String[] args) {
        //car
        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Car("Volvo", "V-40", 2001, "blue", 5500, "AB-7 1234"));
        carList.add(new Car("Mitsubishi", "Carisma", 1999, "green", 3500, "BH-3 9876"));
        carList.add(new Car("VW", "Golf", 2009, "white", 9500, "HH-2 6321"));
        carList.add(new Car("Nissan", "Quashqai", 2005, "grey", 8000, "KW-5234-1"));
        System.out.println("");
        carList.forEach(car -> System.out.print(car.getMarka() + ", "));

        System.out.println("");
        getCarWithMarka(carList, "Nissan").forEach(car -> System.out.print(car.getMarka() + ", "));

        System.out.println("");
        getCarByModelAndYearMoreThan(carList, "Golf", 1990).forEach(car -> System.out.print(car.getMarka() + ", "));

        System.out.println("");
        getCarByYearAndPriceMoreThan(carList, 1990, 1000).forEach(car -> System.out.print(car.getMarka() + ", "));

        System.out.println("");
        carList.forEach(car -> System.out.print(car.getMarka() + ", "));

    }

    static public List<Car> getCarWithMarka(List<Car> cars, String marka) {
        return cars.stream().filter(c -> c.getMarka().equals(marka)).collect(Collectors.toList());
    }

    static public List<Car> getCarByModelAndYearMoreThan(List<Car> cars, String model, int year) {
        List<Car> filteredList = new ArrayList<>();
        for (Car c : cars) {
            if (c.getModel().equals(model) && c.getProductionYear() > year) {
                filteredList.add(c);
            }
        }
        return filteredList;
    }

    static public List<Car> getCarByYearAndPriceMoreThan(List<Car> cars, int year, double price) {
        List<Car> filteredList = new ArrayList<>();
        for (Car c : cars) {
            if (c.getProductionYear() == year && c.getPrice() > price) {
                filteredList.add(c);
            }
        }
        return filteredList;
    }


}
