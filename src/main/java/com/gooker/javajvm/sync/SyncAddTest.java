package com.gooker.javajvm.sync;

/**
 * desc : SyncAddTest.java
 *
 * @author : mozi  on 2017/7/24 10:18.
 */
public class SyncAddTest {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
//            new Thread(new SyncAddRunnable(1, 2)).start();
//            new Thread(new SyncAddRunnable(2, 1)).start();

//            new Thread(new SyncAddRunnable(-128, 127)).start();
//            new Thread(new SyncAddRunnable(127, -128)).start();

            new Thread(new SyncAddRunnable(-129, 128)).start();
            new Thread(new SyncAddRunnable(128, -129)).start();
        }
    }

    static class SyncAddRunnable implements Runnable {
        int a, b;

        public SyncAddRunnable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }
}
