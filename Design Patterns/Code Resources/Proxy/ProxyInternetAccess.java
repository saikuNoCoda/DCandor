package Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private User user;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(User user) {
        this.user = user;
    }

    @Override
    public void grantInternetAccess() {
        if (user.getRole() > 4) {
            realInternetAccess = new RealInternetAccess(user);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access to use under level role befow 4");
        }
    }
}
