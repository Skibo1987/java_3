package ru.geekbrains.lesson4;

public class ABC {
    static Object mon = new Object();
    static volatile char currentLetter = 'B';

    public static void main(String[] args) {
        new Thread(()  -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (currentLetter !='A'){
                            mon.wait();
                        }
                        System.out.println("A");
                        currentLetter = 'B';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()  -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (currentLetter !='B'){
                            mon.wait();
                        }
                        System.out.println("B");
                        currentLetter = 'C';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()  -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (currentLetter !='C'){
                            mon.wait();
                        }
                        System.out.println("C");
                        currentLetter = 'D';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()  -> {
            try {
                for (int i = 0; i < 5; i++) {
                    synchronized (mon) {
                        while (currentLetter !='D'){
                            mon.wait();
                        }
                        System.out.println("D");
                        currentLetter = 'A';
                        mon.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
