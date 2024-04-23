public class Main {
    public static void main(String[] args) {
       Box box1 = new Box();

       box1.setItem("iPhone 15");

        System.out.println(box1);

        Box<Integer> box2 = new Box<>();

        box2.setItem(10);
        System.out.println(box2);

        Item item1 = new Item("Macbook Pro",170000);

        Box<Item> box3 = new Box<>();

        box3.setItem(item1);

        System.out.println(box3);

    }
}