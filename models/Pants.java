package models;

import java.util.Objects;

public class Pants extends Product{
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


}