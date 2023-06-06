import java.util.Comparator;

abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected double cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media(int id, String title, String category, double cost){
        this.id =id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String title) {
        this.title = title;
        this.id = id;
    }

    public Media(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    @Override
    public boolean equals (Object o) {
        if (o instanceof Media){
            Media that = (Media) o;
            return this.title.equals(that.title);
        }
        return false;
    }

    public String toString(){

        return ("Media - [" + this.getTitle() + "] - [" + this.getCategory() + "] - [" +this.getCost() + "] $");
    }

    

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getCategory(){
        return this.category;
    }

    public double getCost(){
        return this.cost;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    
}
