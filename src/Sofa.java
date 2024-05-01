class Sofa implements Furniture {
    private double size;
    private double distance;

    public Sofa(double size, double distance) {
        this.size = size;
        this.distance = distance;
    }

    public double getSize() {
        return size;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}