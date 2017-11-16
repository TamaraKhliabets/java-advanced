package com.epam.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarList {

    /*Создать массив объектов. Вывести:
    a) список автомобилей заданной марки;
    b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
    c) список автомобилей заданного года выпуска, цена которых больше указанной.*/

    private List<Car> cars;

    public CarList() {
        this.cars = new ArrayList<>();
    }

    public CarList(List<Car> cars) {
        this.cars = cars;
    }

    public void add(Car car){
        this.cars.add(car);
    }

    public List<Car> getCarWithMarka(String marka){
        return this.cars.stream().filter(c -> c.getMarka().equals(marka)).collect(Collectors.toList());
    }

    public List<Car> getCarByModelAndYearMoreThan(String model, int year){
        List<Car> filteredList = new ArrayList<>();
        for (Car c: this.cars){
            if(c.getModel().equals(model) && c.getProductionYear() > year) {
                filteredList.add(c);
            }
        }
        return filteredList;
    }

    public List<Car> getCarByYearAndPriceMoreThan(int year, double price){
        List<Car> filteredList = new ArrayList<>();
        for (Car c: this.cars){
            if(c.getProductionYear() == year && c.getPrice() > price) {
                filteredList.add(c);
            }
        }
        return filteredList;
    }


}
