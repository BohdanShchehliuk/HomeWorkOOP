package AdditonalTask;

public class Address {
    private int index;
    public String country;
    public String city;
    private String street;
    private int house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String show() {
        String adress = "adress  Ivanenko is " + country + " " + getIndex() + " " + city + " " +
                getStreet() + " " + getApartment() + "," + getHouse();
        return adress;
    }

}
