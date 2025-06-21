import java.util.*;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Name: " + name + ", Category: " + category + ", Price: ₹" + price;
    }
}

public class DN {
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        populateProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to E-commerce Search Platform!");

        while (true) {
            System.out.print("\nEnter search keyword (or type 'exit' to quit): ");
            String keyword = scanner.nextLine().toLowerCase();

            if (keyword.equals("exit")) {
                System.out.println("Thank you for using the platform!");
                break;
            }

            List<Product> results = searchProducts(keyword);
            if (results.isEmpty()) {
                System.out.println("No matching products found.");
            } else {
                System.out.println("Search Results:");
                for (Product p : results) {
                    System.out.println(p);
                }
            }
        }

        scanner.close();
    }
    private static void populateProducts() {
        productList.add(new Product("iPhone", "Electronics", 69999));
        productList.add(new Product("Honor", "Electronics", 64999));
        productList.add(new Product("Skechers Sneakers", "Footwear", 8999));
        productList.add(new Product("Wooden Table", "Furniture", 12999));
        productList.add(new Product("Headphones", "Electronics", 1999));
        productList.add(new Product("Adidas Shoes", "Footwear", 5999));
        productList.add(new Product("Chair", "Furniture", 4999));
    }
    private static List<Product> searchProducts(String keyword) {
        List<Product> result = new ArrayList<>();

        for (Product product : productList) {
            if (product.getName().contains(keyword) || product.getCategory().contains(keyword)) {
                result.add(product);
            }
        }
        return result;
    }
}

