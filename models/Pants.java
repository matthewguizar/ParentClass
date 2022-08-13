package models;

import java.util.Objects;

public class Pants extends Product implements Discountable{
    private double waist;

    public Pants(double waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
      
    }

    public Pants(Pants source){
        super(source);
        this.waist = source.waist;
    }


    public double getWaist() {
        return this.waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    @Override
    public void discount() {
        super.setPrice(super.getPrice() / 2);
    }

    @Override
    public void fold() {
        System.out.println("hold pants upright");
        System.out.println("fold one leg over the other");
        System.out.println("fold pants from bottom in thirds");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pants)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist
        && super.getPrice() == pants.getPrice()
        && super.getColor() == pants.getColor()
        && super.getBrand() == pants.getBrand();
    }

    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getColor(), super.getBrand());
    }



    @Override
    public String toString() {
        return "{" +
            " waist='" + getWaist() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + super.getBrand() + "'" +
            "}";
    }



}