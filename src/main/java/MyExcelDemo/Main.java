package MyExcelDemo;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        ConnectionConsSeller connectionConsSeller = new ConnectionConsSeller();
        new Seller(connectionConsSeller);
        new Consumer(connectionConsSeller);
        System.out.println("Press Control-C to stop.");


    }

}

