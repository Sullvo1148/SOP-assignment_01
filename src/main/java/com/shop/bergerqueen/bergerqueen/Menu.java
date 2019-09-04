package com.shop.bergerqueen.bergerqueen;

public class Menu {
    private String name;
    private String detail;
    private Berger[] berger;
    private double price;

    public  Menu(String name, String detail, Berger[] berger, double price) {
        this.name = name;
        this.detail = detail;
        this.berger = berger;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Berger[] getBerger() {
        return berger;
    }

    public void setBerger(Berger[] berger) {
        this.berger = berger;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
