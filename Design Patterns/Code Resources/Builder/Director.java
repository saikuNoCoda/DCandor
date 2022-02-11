package Builder;
/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {
    public void constructAndoidPhone(Builder builder) {
        builder.setSimType("Dual");
        builder.setNetworkConnection("Available");
        builder.setCountry("India");
        builder.setRoaming("Allowed");
    }

    public void consructIPhone(Builder builder) {
        builder.setSimType("Single");
        builder.setNetworkConnection("Available");
        builder.setCountry("USA");
        builder.setRoaming("Not Allowed");    }
}
