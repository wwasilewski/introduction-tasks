package pl.sda.introductiontasks.tasks4.task1;

public class Task4_1_Runnable implements Runnable {

    @Override
    public void run() {
        System.out.println("this is thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
