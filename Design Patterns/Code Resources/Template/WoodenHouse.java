package TemplateMethod;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Build Wooden walls.");
    }    

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}
