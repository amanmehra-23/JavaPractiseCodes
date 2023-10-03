//Write a program to display pyramid pattern using * and # using multithreading.

import java.util.Scanner;

class Pattern implements Runnable {
    private int len;
    private String symbol;

    public Pattern(int len, String symbol) {
        this.len = len;
        this.symbol = symbol;
    }

    public void run() {
        for (int i = 1; i <= len; i++) {
            for (int k = len; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(symbol + " ");
            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the pattern: ");
        int len = scanner.nextInt();

        Pattern pattern1 = new Pattern(len, "*");
        Thread thread1 = new Thread(pattern1);

        Pattern pattern2 = new Pattern(len, "#");
        Thread thread2 = new Thread(pattern2);

        thread1.start();
        
        try {
            thread1.join(); // Wait for thread1 to complete before starting thread2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}
