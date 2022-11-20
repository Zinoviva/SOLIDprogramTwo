import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //переносив в класс Purchase
//        HashMap<String, Integer> products = new HashMap<>();
//        products.put("Хлеб", 56);
//        products.put("Масло", 153);
//        products.put("Колбаса", 211);
//        products.put("Пирожок", 45);

//        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
//        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
//            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
//        }
//
//        System.out.println("Введите два слова: название товара и количество. Или end");
        Purchase purchase = new Purchase();
        purchase.startShop();  //вызываем корзину продуктов

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if ("end".equals(line)) break;
            String[] parts = line.split(" ");
            String product = parts[0];
            int count = Integer.parseInt(parts[1]);
            purchase.addPurchase(product, count);
        }
//        long sum = purchase.sum(products);
//        System.out.println("ИТОГО: " + sum);
        purchase.totalShop();  //выводим результат через вызов
    }
}