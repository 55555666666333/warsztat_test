package zad1;

public class AddressData {

    private String Address;
    private String City;
    private String Zip;

    public String getAddress() {
        return Address;
    }

    public AddressData setAddress(String Address) {
        this.Address = Address;
        return this;
    }

    public String getCity() {
        return City;
    }

    public AddressData setCity(String City) {
        this.City = City;
        return this;
    }

    public String getZip() {
        return Zip;
    }

    public AddressData setZip(String Zip) {
        this.Zip = Zip;
        return this;
    }
}
