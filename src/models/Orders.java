package models;

import java.util.Arrays;

public class Orders {
    String name;
    String ph_number;
    String[] items;
    int[] price;

    public Orders(String name, String ph_number, String[] items, int[] price) {
        this.name = name;
        this.ph_number = ph_number;
        this.items = items;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPh_number() {
        return ph_number;
    }

    public void setPh_number(int ph_number) {
        this.ph_number = String.valueOf(ph_number);
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }
    //CUSTOM METHOD TO MAKE A BILL AND GIVE BILL OUTPUT
    public void vat_bill(){
        int total=0;
        for (int prices : this.price){
             total = total + prices;
        }
        double vat = 0.13*total;
        double final_amount = vat+total;
        System.out.println("----------BILL----------\n Item name :\t"+this.name+"\nPhone Number :\t"+this.ph_number+"\nItems Codes\t"+Arrays.toString(this.items)+"\nItem Prices\t"+Arrays.toString(this.price)+"\nTotal :\t"+total+"\nTotal Payable Amount: "+final_amount);

    }


}
