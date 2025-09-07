import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    private static List<User> users = new ArrayList<>();

    static {
        System.out.println("Ініціалізація OnlineStore...");
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static int getTotalProducts() {
        int total = 0;
        for (User user : users) {
            for (Cart cart : user.getCarts()) {
                total += cart.getProductCount();
            }
        }
        return total;
    }

    public static void showUsers() {
        for (User user : users) {
            System.out.println("Користувач: " + user.getName() + " (ID: " + user.getUserId() + ")");
            for (Cart cart : user.getCarts()) {
                System.out.println("  Кошик: " + cart.getProducts());
            }
        }
    }

    public static Product findProductById(int id) throws ProductNotFoundException {
        for (User user : users) {
            for (Cart cart : user.getCarts()) {
                for (Product p : cart.getProducts()) {
                    if (p.getId() == id) {
                        return p;
                    }
                }
            }
        }
        throw new ProductNotFoundException("Продукт з ID " + id + " не знайдено!");
    }
}
