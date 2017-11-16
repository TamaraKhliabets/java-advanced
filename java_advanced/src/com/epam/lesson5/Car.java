package com.epam.lesson5;

public class Car {

    /*com.epam.lesson5.Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.*/

    private static int objectCount;
    private int id;
    private String marka;
    private String model;
    private int productionYear;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(String marka, String model, int productionYear, String color, double price, String registrationNumber) {
        this.id = objectCount++;
        this.marka = marka;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    Car(){
        this.id = objectCount++;
        this.marka = "Audi";
        this.model = "100";
        this.productionYear = 1990;
        this.color = "red";
        this. price = 3000D;
        this.registrationNumber = "AB-1 1234";
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public static void setObjectCount(int objectCount) {
        Car.objectCount = objectCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
