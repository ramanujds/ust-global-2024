
class Product {

    // Fileds/Properties/State
    protected int id;
    protected String name;
    protected float price;

    public Product() {
        System.out.println("Product class constructor");
    }


    public Product(int id, String name, float price) {
        System.out.println("Product class constructor with args");
        this.id=id;
        this.name=name;
        this.price=price;
    }

    // Getter
    public int getId() {
        return id;
    }

    // Setters
    public void setId(int id) {
        if(id<=0){
            System.out.println("Invalid id");
            return;
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // method/behaviour
    public void displayProduct(){
        System.out.println("Product id: "+id);
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price);
    }
   
}

// class ElectronicProduct extends Product{

// }


public class MainProgram {

    public static void main(String[] args) {
        
    Product p1= new Product(101,"Mobile",15000);
    p1.setPrice(60000);

    Product p2= new Product();
       p2.setId(102);
       p2.setName("Camera");
       p2.setPrice(80000);

         p1.displayProduct();
         p2.displayProduct();

    }
    
}
