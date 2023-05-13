package sbu.cs.Semaphore;

import static java.lang.Thread.currentThread;

public class Resource {

    public static void accessResource() {
        try {
            System.out.println(currentThread().getName() + " : " + System.currentTimeMillis());
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
