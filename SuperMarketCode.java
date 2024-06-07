import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SuperMarketCode {

    public static int placementlelo(int n, int m, ArrayList<Item> dealer, ArrayList<Item> x) {
        Collections.sort(dealer, (a, b) -> b.price - a.price);
        Collections.sort(x, (a, b) -> b.price - a.price);

        int s = 0;
        int i = 0;

        for (Item d : dealer) {
            while (i < m && x.get(i).quantity > 0 && x.get(i).price > d.price) {
                i++;
            }

            if (i < m && x.get(i).price >= d.price && d.quantity > 0) {
                s++;
                x.get(i).quantity--;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Item> dealer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dealer.add(new Item(scanner.nextInt(), scanner.nextInt()));
        }

        ArrayList<Item> x = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            x.add(new Item(scanner.nextInt(), scanner.nextInt()));
        }

        int ans = placementlelo(n, m, dealer, x);
        System.out.println(ans);
    }

    static class Item {
        int price;
        int quantity;

        Item(int price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }
    }
}

