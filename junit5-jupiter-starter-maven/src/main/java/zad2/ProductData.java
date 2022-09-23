package zad2;

import org.openqa.selenium.WebDriver;
import zad1.AddressData;

public class ProductData {
    private String Sweater;
    public String Sweater() {
        return Sweater;
    }

    public ProductData setProduct(String Product) {
        this.Sweater = Sweater;
        return this;
    }

   public String getSweater() {
       return Sweater;
   }
}
