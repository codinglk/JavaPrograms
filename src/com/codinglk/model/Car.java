package com.codinglk.model;
/**
 * @author codinglk
 * Car Model
 */
public class Car {
    private Double price;

    public Car(Double price){
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
