package Builder;
/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setSimType(String simType);
    void setNetworkConnection(String networkConnection);
    void setCountry(String country);
    void setRoaming(String roaming);
}
