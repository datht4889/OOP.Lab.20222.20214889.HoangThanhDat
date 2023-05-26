
public class Store {
    public int capacity;
    private DigitalVideoDisc itemsInStore[];
    private int qtyOrdered = 0;

    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        this.capacity = capacity;
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < capacity) {
            itemsInStore[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added " + disc.getTitle() + " to store.");
        } else  {
            System.out.println("Capacity is already full.");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyOrdered - 1] = null; 
                qtyOrdered--;
                System.out.println("Removed " + disc.getTitle() + " from cart.");
                return;
            }
        }
    }
}
