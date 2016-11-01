package hu.nutty.interview.ulyssys.parkingregistry.vo;

import hu.nutty.interview.ulyssys.parkingregistry.vo.enums.Brand;

import java.io.Serializable;

public class CarVo implements Serializable {

    private static final long serialVersionUID = 7946389195462430050L;
    private String licensePlateNumber;
    private int year;
    private Brand brand;
    private String type;
    private String color;

    public CarVo() {
    }

    public CarVo(String licensePlateNumber, Brand brand, String type, int year, String color) {
        this.licensePlateNumber = licensePlateNumber;
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.color = color;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
