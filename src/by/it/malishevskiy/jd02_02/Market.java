package by.it.malishevskiy.jd02_02;

import java.util.ArrayList;
import java.util.List;

public class Market {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        System.out.println("Магазин открыт");

        for (int num = 1; num <= 2; num++) {
            Cashier cashier = new Cashier(num);
            Thread thread = new Thread(cashier);
            thread.start();
            threads.add(thread);
        }
        for (int time = 0; Dispatcher.marketOpen(); time++) {
            int buyerCount = Util.random(2);
            for (int i = 0; i < buyerCount; i++) {
                if (Dispatcher.marketOpen()) {
                    Buyer buyer = new Buyer(Dispatcher.getBuyerCounter());
                    threads.add(buyer);
                    buyer.start();
                }
            }
            Util.sleep(1000);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Магазин закрыт");
    }
}
