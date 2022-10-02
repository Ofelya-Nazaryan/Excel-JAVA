package MyExcelDemo;

public class Seller implements Runnable {

    ConnectionConsSeller connectionConsSeller;

    Seller(ConnectionConsSeller connectionConsSeller) {
        this.connectionConsSeller = connectionConsSeller;
        new Thread(this, "Seller").start();

    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            connectionConsSeller.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
