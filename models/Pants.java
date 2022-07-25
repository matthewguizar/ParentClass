package models;

public class Pants extends Product{
    private String waist;
    


    public Pants(String waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
      
    }

}