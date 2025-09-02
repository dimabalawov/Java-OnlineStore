import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int userId;
    private List<Cart> carts;

    public User() {
        this("Unknown", 0);
    }

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.carts = new ArrayList<>();
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public String getName() { return name; }
    public int getUserId() { return userId; }
}
