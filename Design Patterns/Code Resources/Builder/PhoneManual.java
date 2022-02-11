package Builder;

public class PhoneManual {
    private String simType;
    private String networkConnection;
    private String country;
    private String roaming;

    public PhoneManual(String simType, String networkConnection, String country, String roaming) {
        this.simType = simType;
        this.networkConnection = networkConnection;
        this.country = country;
        this.roaming = roaming;
    }

    public String printAboutPhone() {
        String info = "";
        info += "Mobile is " + simType + "\n";
        info += "With network connection " + networkConnection + "\n";
        info += "With roaming " + roaming + "\n";
        info += "Manufactured in " + country + "\n";

        return info;
    }
}
