//Main.java
//Name: Bhoomika Kapde
//PRN: 2307016025
//Batch: A1

public class Main {
    public static void main(String[] args) {
        new Thread(new MyThread(1, 2, 300)).start();
        new Thread(new MyThread(100, 20, 1000)).start();
    }
}
