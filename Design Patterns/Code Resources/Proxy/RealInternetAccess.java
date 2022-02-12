package Proxy;

public class RealInternetAccess implements OfficeInternetAccess {
    private User user;

    public RealInternetAccess(User user) {
        this.user = user;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee with username: " + user.getUsername());
    }
}
