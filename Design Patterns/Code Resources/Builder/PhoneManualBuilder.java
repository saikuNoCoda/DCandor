package Builder;

public class PhoneManualBuilder implements Builder {
    private String simType;
    private String networkConnection;
    private String country;
    private String roaming;

    @Override
    public void setSimType(String simType) {
        this.simType = simType;
    }

    @Override
    public void setNetworkConnection(String networkConnection) {
        this.networkConnection = networkConnection;        
    }

    @Override
    public void setCountry(String country) {
        this.country = country;        
    }

    @Override
    public void setRoaming(String roaming) {
        this.roaming = roaming;        
    }
    
    public PhoneManual getResult() {
        return new PhoneManual(simType, networkConnection, country, roaming);
    }
}
