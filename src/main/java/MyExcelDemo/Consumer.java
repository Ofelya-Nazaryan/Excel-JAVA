package MyExcelDemo;

public class Consumer implements Runnable {


    ConnectionConsSeller connectionConsSeller;

    Consumer(ConnectionConsSeller connectionConsSeller) {

        this.connectionConsSeller = connectionConsSeller;
        new Thread(this, "Consmer").start();

    }

    @Override
    public void run() {
        while (true) {
            connectionConsSeller.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


