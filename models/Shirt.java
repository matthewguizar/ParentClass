package models;

import java.util.Objects;

public class Shirt extends Product {

    //enums contain a limited number of constants. Collection of static final constants
    public enum Size { //making sure shirt sizes can only be small/medium/large
        SMALL, MEDIUM, LARGE //constants are always capitalized
    }
    private Size size; //size must be type Size(enum)
    


    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
        
    }

    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
   
    @Override
    public void fold() {
        System.out.println("lay shirt on flat surface");
        System.out.println("fold the shirt sideways");
        System.out.println("bring the sleeves in");
        System.out.println("fold from the bottom up");
    }

    //check if object fields are equal
    @Override
    public boolean equals(Object o) {
        //checks hashcodes
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return size.equals(shirt.size)
        && super.getPrice() == shirt.getPrice()
        && super.getColor() == shirt.getColor()
        && super.getBrand() == shirt.getBrand();
    }

    //making sure objects that are equal because of fields have the same hash code
    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + super.getBrand() + "'" +
            "}";
    }
    
}