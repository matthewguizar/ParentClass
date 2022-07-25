package models;

public class Product {
    private double price;
    private String color;
    private String brand;

   public Product (double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
   }

   public Product(Product source) {
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
   }
}
