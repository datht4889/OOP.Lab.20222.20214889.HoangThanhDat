package method_overloading.Aims;

import method_overloading.Aims.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Added " + disc.getTitle() + " to cart.");
        } else {
            System.out.println("Cart is already full.");
        }
    }
    //  2.1
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
            for (int i=1; i<qtyOrdered; i++){
                itemOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
                System.out.println("Added " + dvdList[i].getTitle() + " to cart.");
            }
        } else {
            System.out.println("Cart is already full.");
        }
    }

    //  2.2
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = dvd1;
            System.out.println("Added " + dvd1.getTitle() + " to cart.");
            qtyOrdered++;

            itemOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("Added " + dvd2.getTitle() + " to cart.");
        } else {
            System.out.println("Cart is already full.");
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null; 
                qtyOrdered--;
                System.out.println("Removed " + disc.getTitle() + " from cart.");
                return;
            }
        }
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemOrdered[i].getCost();
        }
        System.out.println("Total Cost: " + sum);
        return sum;
    }
    

}

