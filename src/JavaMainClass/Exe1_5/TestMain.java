package JavaMainClass.Exe1_5;

public class TestMain {
    public static void main(String[] args) {
        // Test Constructor và toString()
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1); // toString()

        System.out.println("-------------------------");

        // Test Setters và Getters
        // Đặt lại qty
        inv1.setQty(999);
        // Đặt lại unitPrice
        inv1.setUnitPrice(0.99);

        // In ra sau khi cập nhật
        System.out.println("Sau khi cập nhật: " + inv1);

        // Test Getters
        System.out.println("inv1.getId() is: " + inv1.getId());
        System.out.println("inv1.getDesc() is: " + inv1.getDesc());
        System.out.println("inv1.getQty() is: " + inv1.getQty());
        System.out.println("inv1.getUnitPrice() is: " + inv1.getUnitPrice());

        System.out.println("-------------------------");

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}