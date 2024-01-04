package models;

import java.util.Arrays;
import java.util.Scanner;

public class Tshirts {
    String name;
    int code;
    int price;
    String brand;
    String description;
    String[] sizes;


    //CONSTRUCTOR
    public Tshirts(String name, int code, int price, String brand, String description, String[] sizes) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
// CUSTOM METHOD TO VIEW PRODUCT DETAILS
    public void describe(){
        System.out.println("\n\nItem_name\t\t"+this.name+"\nDescription\t"+this.description+ """
                Product code\t"""+this.code+"\nBrand\t\t"+this.brand+"\nPrice\t\t"+this.price+"\nSizes\t\t"+ Arrays.toString(this.sizes));
    }

}
