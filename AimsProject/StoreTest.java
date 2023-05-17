package AimsProject;

public class StoreTest {
    public static void main(String args[]) {
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction","George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", null, 0, 18.99f);
        Store Store = new Store(DigitalVideoDisc.getNumber());
        Store.addDigitalVideoDisc(dvd1);
        Store.addDigitalVideoDisc(dvd2);
        Store.addDigitalVideoDisc(dvd3);
        Store.addDigitalVideoDisc(dvd2);
        Store.removeDigitalVideoDisc(dvd2);

    }
}
