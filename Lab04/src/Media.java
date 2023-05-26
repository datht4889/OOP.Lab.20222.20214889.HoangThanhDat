
abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public Media(int id, String title, String category, float cost){
        this.id =id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String title) {
        this.title = title;
        this.id = id;
    }

    public Media(String title, float cost) {
        this.title = title;
        this.cost = cost;
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

    public float getCost(){
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

    public void setCost(float cost){
        this.cost = cost;
    }

    
}
