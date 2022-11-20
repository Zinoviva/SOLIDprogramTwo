import java.util.HashMap;
import java.util.Map;

public class Purchase {
   // protected String title;  //нужно использовать приват
    private String title;
    //protected int count;///нужно использовать приват
    private int count;
 //   private Purchase[] purchases = new Purchase[4]; //лучше перевести в приват
    private Map<String, Integer> purchases;

    private final HashMap<String, Integer> products = new HashMap<>();

    public Purchase(String title, int count,Map <String, Integer> purchases) {
        this.title = title;
        this.count = count;
        products.put("Хлеб", 56);
        products.put("Масло", 153);
        products.put("Колбаса", 211);
        products.put("Пирожок", 45);
        this.purchases = purchases;
    }

    public Purchase(Map<String, Integer> purchases) {
        this.purchases = purchases;
    }

    public Purchase() {

    }

    public void addPurchase(String title, int count) {
//        for (int i = 0; i < purchases.length; i++) {
//            if (purchases[i] == null) {
//                purchases[i] = new Purchase(title, count);
//                return;
//            }
//            if (purchases[i].title.equals(title)) {
//                purchases[i].count += count;
//                return;
//            }
//        }
        purchases.put(title, purchases.getOrDefault(title, 0) + count);
    }

//    public long sum(Map<String, Integer> prices) {
//        long sum = 0;
//        System.out.println("КОРЗИНА:");
////        for (int i = 0; i < purchases.length; i++) {
////            Purchase purchase = purchases[i];
////            if (purchase == null) continue;
////            System.out.println("\t" + purchase.title + " " + purchase.count + " шт. в сумме " + (purchase.count * prices.get(purchase.title)) + " руб.");
////            sum += purchase.count * prices.get(purchase.title);
////        }
////        return sum;
//    }

    //перенесли из мейна
    public void startShop() {
        System.out.println("В МАГАЗИНЕ В НАЛИЧИИ");
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " за " + productAndPrice.getValue() + " руб./шт.");
        }
        System.out.println("Введите два слова: название товара и количество. Или end");
    }
//меняем корзину на вывод через мапу
    public void totalShop() {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (Map.Entry<String, Integer> entryMap : purchases.entrySet()) {
            System.out.println("\t" + entryMap.getKey() + " " + entryMap.getValue()
                    + " шт. в сумме " + (entryMap.getValue() * products.get(entryMap.getKey()) + " руб."));
            sum += (long) entryMap.getValue() * products.get(entryMap.getKey());
        }
        System.out.println("ИТОГО: " + sum);
    }
}