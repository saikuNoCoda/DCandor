package Decorator;

public class BubbleLights extends TreeDecorator {
    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }
    public String decorate() {
        return super.decorate() + decorateWithBubbleLight();
    }
    private String decorateWithBubbleLight() {
        return " with Bubble Lights";
    }
}

