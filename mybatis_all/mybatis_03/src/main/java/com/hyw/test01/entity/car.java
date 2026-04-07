package com.hyw.test01.entity;

/**
 * ClassName: car
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 11:05
 * @Version 1.0
 */
public class car {
    private int id;
    private String num;
    private String brand;
    private double price;
    private String time;
    private String type;

    public car() {
    }

    public car(int id, String num, String brand, double price, String time, String type) {
        this.id = id;
        this.num = num;
        this.brand = brand;
        this.price = price;
        this.time = time;
        this.type = type;
    }

    @Override
    public String toString() {
        return "car{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
