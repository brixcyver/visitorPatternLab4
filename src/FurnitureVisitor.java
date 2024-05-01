interface FurnitureVisitor {
    void visit(Chair chair);
    void visit(Sofa sofa);
    void visit(Table table);
    void visit(Bed bed);
    void visit(Desk desk);
}
