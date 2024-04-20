import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        ItemManagementService service = new ItemManagementService();
        // Create few Items

        Item item1 = new Item(1,"iPhone15", 75000, "Apple iPhone 15 with 5G");
        Item item2 = new Item(2,"Samsung Galaxy S20", 65000, "Samsung Galaxy S20 with 5G");
        Item item3 = new Item(3,"Google Pixel 5", 55000, "Google Pixel 5 with 5G");
        Item item4 = new Item(4,"OnePlus 8T", 45000, "OnePlus 8T with 5G");
        Item item5 = new Item(5,"Xiaomi Mi 10", 35000, "Xiaomi Mi 10 with 5G");
        Item item6 = new Item(6,"Realme X7", 25000, "Realme X7 with 5G");
        Item item7 = new Item(6,"Realme X7", 25000, "Realme X7 with 5G");
        Item item8 = new Item(6,"Realme X7", 25000, "Realme X7 with 5G");


        // add items
        service.addItem(item1);
        service.addItem(item2);
        service.addItem(item3);
        service.addItem(item4);
        service.addItem(item5);
        service.addItem(item6);
        service.addItem(item7);
        service.addItem(item8);



        // search by name

//        Item item = service.findItem("Google Pixel 5");
//        System.out.println(item);

        // search by price

//        service.findItemsByPrice(25000,50000)
//                .forEach(i-> System.out.println(i));

        int id = 5;
        System.out.println("Finding item with id : "+id);
        System.out.println(service.findItemById(5));

        // sort
        System.out.println("Sorted by Price");
        service.sortItemsByPrice().forEach(i-> System.out.println(i));

        System.out.println("Sorted by Name");
        service.sortItemsByName().forEach(i-> System.out.println(i));

    }
}