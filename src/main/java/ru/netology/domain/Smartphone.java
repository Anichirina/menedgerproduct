package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String manufacturer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone)) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return manufacturer.equals(that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), manufacturer);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public Smartphone() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Smartphone(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }
}
