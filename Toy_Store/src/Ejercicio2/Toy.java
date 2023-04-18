package Ejercicio2;

public class Toy {
    public Integer Id;
    private String toyName;
    private String toyCategory;
    private int price;
    private double Quantity;

    public Toy(Integer Id, String toyName, int price, double Quantity){
        Id = Id;
        this.toyName = toyName;
        this.toyCategory = toyCategory;
        this.price = price;
        this.Quantity = Quantity;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyCategory() {
        return toyCategory;
    }

    public void setToyCategory(String toyCategory) {
        this.toyCategory = toyCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ejercicio2.Toy ->"+
                "Id = " + Id +
                ", Ejercicio2.Toy Name = " + toyName + '\''+
                ", Category = " + toyCategory + '\'' +
                ", Price = " + price + '\'' +
                ", Quantity = " + Quantity;
    }
}
