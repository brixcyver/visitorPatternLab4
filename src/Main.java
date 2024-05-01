public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Sofa sofa = new Sofa(10, 150);
        Table table = new Table();
        Bed bed = new Bed();
        Desk desk = new Desk();

        ShippingCostCalculator shippingCalculator = new ShippingCostCalculator();

        chair.accept(shippingCalculator);
        sofa.accept(shippingCalculator);
        table.accept(shippingCalculator);
        bed.accept(shippingCalculator);
        desk.accept(shippingCalculator);

        // total shipping cost
        double totalShippingCost = shippingCalculator.getTotalShippingCost();
        System.out.println();
        System.out.println("Total Shipping Cost for Furniture:");
        System.out.println("Chair: $" + 10); // flat rate for chairs is $10
        System.out.println("Sofa: $" + (sofa.getSize() * 0.1 * sofa.getDistance())); // Calculation for sofa shipping cost
        System.out.println("Table: $" + 15); // flat rate for tables is $15
        System.out.println("Bed: $" + 25); // flat rate for beds is $25
        System.out.println("Desk: $" + 20); // flat rate for desks is $20
        System.out.println("Total: $" + totalShippingCost);
    }
}