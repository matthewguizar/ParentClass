import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Pants;
import models.Product;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
    }



    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scanFile = new Scanner(fis);

        Product[] products = new Product[18];

        for (int i=0; scanFile.hasNextLine(); i++){
            switch(scanFile.next()){
                case "PANTS": products[i] = new Pants(scanFile.nextInt(), scanFile.nextDouble(), scanFile.next(), scanFile.next()); break;
                case "SHIRT":  products[i] = new Shirt(Shirt.Size.valueOf(scanFile.next()), scanFile.nextDouble(), scanFile.next(), scanFile.next()); break;
            }
        }

        scanFile.close();
        return products;
    }
}