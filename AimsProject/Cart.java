package AimsProject;



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

    public String toString(DigitalVideoDisc disc){
        return ("DVD - [" + disc.getTitle() + "] - [" + disc.getCategory() + "] - [" + disc.getDirector() + "] - [" + disc.getLength() + "]: [" +disc.getCost() + "] $");
    }

    public void printOrdered(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(toString(itemOrdered[i]));
        }
        System.out.println("***************************************************");
    }
    
    public void Search(int id){
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id){
                System.out.println("Found DVD: " + toString(itemOrdered[i]));
                break;
            } else if (i == qtyOrdered-1){
                System.out.println("No match is found!"); 
            }
        } 
    }
    

    

    public void Search(String title){
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].isMatch(title)){
                System.out.println("Found DVD: " + toString(itemOrdered[i]));
                break;
            }else if (i == qtyOrdered-1){
                System.out.println("No match is found!"); 
            }
        } 
    }
}

