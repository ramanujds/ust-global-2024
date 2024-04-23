import java.util.*;

public class ItemManagementService {

   Map<Integer,Item> items;


    public ItemManagementService(){
        items = new HashMap<>();
    }


    public void addItem(Item item){
        items.put(item.getId(),item);
    }

    public Item findItemById(int id){
        return items.get(id);
    }


    public Item findItemByName(String name){
        return items.values().stream()
                .filter(i->i.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }

    public List<Item> findItemsByPrice(float minPrice, float maxPrice){
        List<Item> itemsByPrice = new ArrayList<>();
        for (var item:items.values()){
            if(item.getPrice()>=minPrice && item.getPrice()<=maxPrice){
                itemsByPrice.add(item);
            }
        }
        return itemsByPrice;
    }

    public List<Item> sortItemsByPrice(){
        Comparator<Item> sortByPrice = (i1,i2)-> (int)(i1.getPrice()-i2.getPrice());

        List<Item> sortedItems = new ArrayList<>(items.values());
        sortedItems.sort((i1, i2) -> (int) (i1.getPrice() - i2.getPrice()));
        return sortedItems;
 //       return items.stream().sorted().toList();
    }

    public List<Item> sortItemsByName(){
        List<Item> sortedItems = new ArrayList<>(items.values());
        Collections.sort(sortedItems);
        return sortedItems;
    }


    public void removeItem(int id){
       items.remove(id);
    }

    public Item updatePrice(int id, float price){
        Item item = findItemById(id);
        if (item !=null){
            item.setPrice(price);
        }
        return item;
    }


}
