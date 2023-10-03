// WAP to declare an array in Java. Create two child threads. One thread must prompt user to enter element in the array (provide appropriate msg is array is full). Another thread must display the elements of the array (provide appropriate msg is array is empty).

import java.util.Scanner;

class A extends Thread {
    private int len;
    private int[] arr1;

    public A(int len) {
        this.len = len;
        arr1 = new int[len];
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");

        for (int i = 0; i < len; i++) {
            arr1[i] = scanner.nextInt();
        }
    }

    public int[] getArray() {
        return arr1;
    }
}

class B implements Runnable {
    private int[] arr1;

    public B(int[] arr1) {
        this.arr1 = arr1;
    }

    public void run() {
        if (arr1.length == 0) {
            System.out.println("Array is empty.");
        } else {
            System.out.println("The array elements are:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }
        }
    }
}
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = scanner.nextInt();

        A a = new A(len);
        Thread t1 = new Thread(a);
        t1.start();

        try {
            t1.join(); // Wait for thread1 to complete before proceeding

            int[] arr = a.getArray(); // Get the array entered by the user

            B b = new B(arr);
            Thread t2 = new Thread(b);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
