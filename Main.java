import models.Pants;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "blue", "nike");
        Pants pant = new Pants(32, 24.99, "blue", "klein");
        Pants pants2 = new Pants(34, 104.99, "red", "jangler");

        System.out.println(pant.compareTo(pants2));
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
