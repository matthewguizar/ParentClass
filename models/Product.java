package models;

//abstract because its only for inheritance. cannot create object of abstract class
public abstract class Product implements Comparable<Product>{
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


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /*Parent class implementing abstract method. 
    Child or subclasses are forced to override.
    abstract methods do not have a body*/
    public abstract void fold();//abstract methods can be implemented in many ways
    
    @Override
    public int compareTo(Product specifiedObject) {
        //getting name of class that calls method
        String className = this.getClass().getSimpleName();//getting class and then making it into a String
        //getting name of class passed in
        String sClassName = specifiedObject.getClass().getSimpleName();
        //checking if they are the same class (sorts by class)
        if (!(className.equals(sClassName))) {
            return className.compareTo(sClassName);
        }//once sorted by class names it is then sorted by price
        return (int) Double.compare(this.getPrice(), specifiedObject.getPrice());
        //double.compare is more accurate when comparing decimals

    }

}
