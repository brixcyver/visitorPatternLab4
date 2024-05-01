class ShippingCostCalculator implements FurnitureVisitor {
    private double totalShippingCost = 0;

    public double getTotalShippingCost() {
        return totalShippingCost;
    }

    @Override
    public void visit(Chair chair) {
        totalShippingCost += 10; // Flat rate for chairs
    }

    @Override
    public void visit(Sofa sofa) {
        totalShippingCost += sofa.getSize() * 0.1 * sofa.getDistance(); // Distance-based rate for sofas
    }

    @Override
    public void visit(Table table) {
        totalShippingCost += 15; // Flat rate for tables
    }

    @Override
    public void visit(Bed bed) {
        totalShippingCost += 25; // Flat rate for beds
    }

    @Override
    public void visit(Desk desk) {
        totalShippingCost += 20; // Flat rate for desks
    }
}