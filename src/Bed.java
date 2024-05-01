class Bed implements Furniture {
    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
