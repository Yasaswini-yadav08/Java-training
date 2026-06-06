/*package Projects.HungerBox;

import java.util.ArrayList;
import java.util.Arrays;

interface Orderable{
    double getPrice();
    String getDescription();
    void prepare();
}
interface Discounts{
    double applyDiscounts(double discount);
}
abstract class MenuItems implements Orderable,Discounts{
    private final String name;
    private double price;
    int totalNumberOfOrders=0;
    private String categories;
    public MenuItems(String name,double price,String categories){
        this.name=name;
        this.price=price;
        this.categories=categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
    }
    public int getTotalNumberOfOrders() {
        return totalNumberOfOrders;
    }

    public void setTotalNumberOfOrders(int totalNumberOfOrders) {
        this.totalNumberOfOrders = totalNumberOfOrders;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
    @Override
    public String getDescription() {
        return "Item Name : "+getName()+"Price:$"+getPrice();
    }
    @Override
    abstract public void prepare();

    @Override
    public double applyDiscounts(double discount) {
        return price-(price*discount/100);
    }
}
class VegItems extends MenuItems {
    private boolean isJain;

    public VegItems(String name, double price) {
        super(name, price, "Veg");
        isJain = false;
    }

    public VegItems(String name, double price, boolean isJain) {
        super(name, price, "Veg");
        isJain = isJain;

    }

    @Override
    public void prepare() {
        System.out.println("your Order of " +getName()+ "Of Price" +getPrice()+"Is Been Prepared");
        setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
    }
}
class NonVegItems extends MenuItems{
    private String meatType;

    public NonVegItems(String name, double price, String categories, String meatType) {
        super(name, price, categories);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println("your Order of " +getName()+ "Of Price" +getPrice()+"Is Been Prepared");
        totalNumberOfOrders++;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+this.meatType;
    }
}
class Orders{
    private final int orderId;
    private static int orderCount=0;
    private final String customerName;
    ArrayList<MenuItems>list;
    private String status;

    Orders(String customerName){
        this.customerName=customerName;
        this.list=new ArrayList<>();
        this.status="Order Placed";
        this.orderId=++orderCount;
    }
    public void addItems(MenuItems items)
    {
        list.add(items);
//        System.out.println(items.getDescription());
        System.out.println("the Items Ordered is "+ items.getName()+ "The Price is "+items.getPrice());
    }
    public void prepareOrder(){
        this.status="preparing Order";
        for(MenuItems items:list)
        {
            items.prepare();
        }
        this.status="Ready";
    }
    double calculatePrice()
    {
        double price=0;
        for(MenuItems items:list){
            price +=items.getPrice();
        }
        return price;
    }
    void generateBill(double discountPercent){
        double subtotal = calculatePrice();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax  = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int)discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
class Res {
    private String name;
    ArrayList<MenuItems> menu;
    ArrayList<Orders> orders;

    Res(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    void addMenu(MenuItems item) {
        menu.add(item);
    }
    void showMenu()
    {
        for(int i=0;i<menu.size();i++)
        {
            System.out.println( (i+1) + " : " + menu.get(i).getDescription());
        }
    }
    Orders placeOrder(String name)
    {
        Orders order1 = new Orders(name);
        Orders.add(order1);
        return order1;
    }
    MenuItems getItem(int index)
    {
        return menu.get(index);
    }
    void showOrder()
    {
        for (Orders order : O)
        {
            System.out.println("The Order of + " + order.getCustomerName() + " " + order.getStatus() + menu.get(order.getOrderId()).getDescription());
        }
    }
}
public class HungerBox {
    public static void main(String[] args) {
        Res res = new Res("Spicy Garden");

        res.addMenu(new VegItems("Panner Butter Masala", 300));
        res.addMenu(new VegItems("soya Butter Masala", 300));
        res.addMenu(new VegItems("tofu Butter Masala", 300));
        res.addMenu(new VegItems("Peanuts Butter Masala", 300));
        res.addMenu(new VegItems("Panner Butter Masala", 300, true));
        res.addMenu(new VegItems("Panner Butter Masala", 300));
        res.addMenu(new NonVegItems("Chicken Butter Masala", 300,"Non Veg","Chicken"));
        res.showMenu();*/
package Projects.HungerBox;

import java.util.ArrayList;

interface Orderable {
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discounts {
    double applyDiscounts(double discount);
}

abstract class MenuItems implements Orderable, Discounts {

    private final String name;
    private double price;
    private int totalNumberOfOrders = 0;
    private String categories;

    public MenuItems(String name, double price, String categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getTotalNumberOfOrders() {
        return totalNumberOfOrders;
    }

    public void setTotalNumberOfOrders(int totalNumberOfOrders) {
        this.totalNumberOfOrders = totalNumberOfOrders;
    }

    @Override
    public String getDescription() {
        return "Item Name: " + name +
                " | Category: " + categories +
                " | Price: ₹" + price;
    }

    @Override
    public double applyDiscounts(double discount) {
        return price - (price * discount / 100);
    }

    @Override
    public abstract void prepare();
}

class VegItems extends MenuItems {

    private boolean isJain;

    public VegItems(String name, double price) {
        super(name, price, "Veg");
        this.isJain = false;
    }

    public VegItems(String name, double price, boolean isJain) {
        super(name, price, "Veg");
        this.isJain = isJain;
    }

    @Override
    public void prepare() {
        System.out.println(getName() + " is being prepared.");
        setTotalNumberOfOrders(getTotalNumberOfOrders() + 1);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                (isJain ? " (Jain)" : "");
    }
}

class NonVegItems extends MenuItems {

    private String meatType;

    public NonVegItems(String name,
                       double price,
                       String category,
                       String meatType) {
        super(name, price, category);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {
        System.out.println(getName() + " is being prepared.");
        setTotalNumberOfOrders(getTotalNumberOfOrders() + 1);
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                " | Meat Type: " + meatType;
    }
}

class Orders {

    private final int orderId;
    private static int orderCount = 0;

    private final String customerName;
    private ArrayList<MenuItems> list;
    private String status;

    Orders(String customerName) {
        this.customerName = customerName;
        this.list = new ArrayList<>();
        this.status = "Order Placed";
        this.orderId = ++orderCount;
    }

    public void addItems(MenuItems item) {
        list.add(item);

        System.out.println(
                item.getName() +
                        " added to order. Price ₹" +
                        item.getPrice()
        );
    }

    public void prepareOrder() {

        status = "Preparing";

        for (MenuItems item : list) {
            item.prepare();
        }

        status = "Ready";
    }

    double calculatePrice() {

        double total = 0;

        for (MenuItems item : list) {
            total += item.getPrice();
        }

        return total;
    }

    void generateBill(double discountPercent) {

        double subtotal = calculatePrice();
        double discountAmount =
                subtotal * discountPercent / 100;

        double discountedPrice =
                subtotal - discountAmount;

        double gst = discountedPrice * 0.05;

        double total =
                discountedPrice + gst;

        System.out.println("\n=================================");
        System.out.println("          HUNGER BOX");
        System.out.println("=================================");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer : " + customerName);
        System.out.println("Status   : " + status);
        System.out.println("---------------------------------");

        for (MenuItems item : list) {
            System.out.printf(
                    "%-25s ₹%.2f%n",
                    item.getName(),
                    item.getPrice()
            );
        }

        System.out.println("---------------------------------");
        System.out.printf("Subtotal           ₹%.2f%n", subtotal);
        System.out.printf("Discount (%.0f%%)   -₹%.2f%n",
                discountPercent,
                discountAmount);
        System.out.printf("GST (5%%)           ₹%.2f%n", gst);
        System.out.println("---------------------------------");
        System.out.printf("Total Amount       ₹%.2f%n", total);
        System.out.println("=================================\n");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }
}

class Res {

    private String name;

    ArrayList<MenuItems> menu;
    ArrayList<Orders> orders;

    Res(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    void addMenu(MenuItems item) {
        menu.add(item);
    }

    void showMenu() {

        System.out.println("\n===== " + name + " MENU =====");

        for (int i = 0; i < menu.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                            menu.get(i).getDescription()
            );
        }
    }

    Orders placeOrder(String customerName) {

        Orders order = new Orders(customerName);

        orders.add(order);

        return order;
    }

    MenuItems getItem(int index) {
        return menu.get(index);
    }

    void showOrders() {

        System.out.println("\n===== ORDERS =====");

        for (Orders order : orders) {

            System.out.println(
                    "Order ID: " + order.getOrderId()
                            + " | Customer: "
                            + order.getCustomerName()
                            + " | Status: "
                            + order.getStatus()
            );
        }
    }
}

public class HungerBox {

    public static void main(String[] args) {
        System.out.println("\n ╔═══════════════════════════════════╗");
        System.out.println(" ║       Welcome to HungerBox 🍕     ║");
        System.out.println(" ╚═══════════════════════════════════╝");

        Res res = new Res("Spicy Garden");

        res.addMenu(new VegItems("Paneer Butter Masala", 300));
        res.addMenu(new VegItems("Soya Butter Masala", 250));
        res.addMenu(new VegItems("Tofu Butter Masala", 280));
        res.addMenu(new VegItems("Peanuts Butter Masala", 200));
        res.addMenu(new VegItems("Jain Paneer Butter Masala", 320, true));

        res.addMenu(
                new NonVegItems(
                        "Chicken Butter Masala",
                        400,
                        "Non Veg",
                        "Chicken"
                )
        );

        res.showMenu();

        Orders order1 = res.placeOrder("Yasaswini");

        order1.addItems(res.getItem(0));
        order1.addItems(res.getItem(5));
        order1.addItems(res.getItem(3));
        order1.addItems(res.getItem(2));
        order1.addItems(res.getItem(1));

        order1.prepareOrder();

        order1.generateBill(10);

        res.showOrders();
    }
}