package MyExcelDemo;

public class ConnectionConsSeller {


    int n;
    boolean valueSet = false;

    public synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");

            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n) {

        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");

            }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();

    }


}

