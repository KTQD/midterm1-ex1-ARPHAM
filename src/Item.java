public class Item {
    public String name;
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    protected String iD;
    float price;
    public void showInfo() {
    }
    Item (String name, String description,String iD, float price) {
        this.name = name;
        this.description = description;
        this.iD = iD;
        this.price = price;
    }
}



