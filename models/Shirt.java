package models;

public class Shirt extends Product{
    private String size;
    


    public Shirt(String size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
        
    }

    public Shirt(Shirt source){
        super(source);
        this.size = source.size;
    }

    
}