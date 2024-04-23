import java.util.*;

public class ItemManagementService {

    Map<Integer, Item> items;


    public ItemManagementService() {
        items = new HashMap<>();
    }


    public void addItem(Item item) {
        items.put(item.getId(), item);
    }

    public Item findItemById(int id) {
        return items.get(id);
    }


    public Item findItemByName(String name) {
        return items.values().stream()
                .filter(i -> i.getName().equalsIgnoreCase(name))
                .findFirst()
                //.orElse(null);
                .orElseThrow(() -> new RuntimeException("Item not found"));

    }

    public List<Item> findItemsByPrice(float minPrice, float maxPrice) {
        return items.values().stream()
                .filter(i -> i.getPrice() >= minPrice && i.getPrice() <= maxPrice)
                .toList();
    }

    public List<Item> sortItemsByPrice() {
        return items.values().stream().sorted((i1, i2) -> (int) (i1.getPrice() - i2.getPrice())).toList();
    }

    public List<Item> sortItemsByName() {
        return items.values().stream().sorted().toList();
    }


    public void removeItem(int id) {
        items.remove(id);
    }

    public Item updatePrice(int id, float price) {
        Item item = findItemById(id);
        if (item != null) {
            item.setPrice(price);
        }
        return item;
    }


}
