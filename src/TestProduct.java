public class TestProduct extends Product {

    public TestProduct(String name) {
        super(name);
    }

    public static void main(String[] args) {

        TestProduct p1 = new TestProduct("Speaker JBL");
        TestProduct p2 = new TestProduct("Samsung TV");

        System.out.println("===== PRODUCT 1 =====");
        System.out.println(p1);

        System.out.println("\n===== PRODUCT 2 =====");
        System.out.println(p2);
    }
}