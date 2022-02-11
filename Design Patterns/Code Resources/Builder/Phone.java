package Builder;

public class Phone {
    private String simType;
    private String networkConnection;
    private String country;
    private String roaming;

    public Phone(String simType, String networkConnection, String country, String roaming) {
        this.simType = simType;
        this.networkConnection = networkConnection;
        this.country = country;
        this.roaming = roaming;
    }

    public String getSimType() {
        return simType;
    }
    
    public String getNetworkConnection() {
        return networkConnection;
    }

    public String getCountry() {
        return country;
    }

    public String getRoaming() {
        return roaming;
    }
}
