public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Телефон", "Samsung", 10000);
        Product p2 = new Product("Ноутбук", "Asus", 25000);

        Cart cart1 = new Cart();
        cart1.addProduct(p1);
        cart1.addProduct(p2);

        User user1 = new User("Дмитро", 1);
        user1.addCart(cart1);

        OnlineStore.addUser(user1);

        OnlineStore.showUsers();
        System.out.println("Загальна кількість продуктів: " + OnlineStore.getTotalProducts());
        try {
            Product found = OnlineStore.findProductById(1);
            System.out.println("Знайдено: " + found);
            Product notFound = OnlineStore.findProductById(99);
            System.out.println("Знайдено: " + notFound);
        } catch (ProductNotFoundException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
