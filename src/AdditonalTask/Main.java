package AdditonalTask;

public class Main {

    public static void main(String[] arg) {
        Address adressIvanenko = new Address();
        adressIvanenko.setIndex(566);
        adressIvanenko.country = "Ukraine";
        adressIvanenko.city = "Kyiv";
        adressIvanenko.setStreet("Zylianska");
        adressIvanenko.setApartment(5);
        adressIvanenko.setHouse(3);

        System.out.println(adressIvanenko.show());

    }
}
