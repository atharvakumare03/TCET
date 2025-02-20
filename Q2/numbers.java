package Q2;

class demo implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class numbers {
    public static void main(String[] args) {
        // Creating a Runnable object
        demo printer = new demo();
        
        // Creating a Thread and starting it
        Thread thread = new Thread(printer);
        thread.start();
    }
}
