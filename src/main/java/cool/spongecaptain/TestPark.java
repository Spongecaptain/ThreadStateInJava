package cool.spongecaptain;


import java.util.concurrent.locks.ReentrantLock;

public class TestPark {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock reentrantLock = new ReentrantLock();

        reentrantLock.lock();

        new Thread(()->{
            reentrantLock.lock();
            System.out.println("get lock");
        }).start();

        Thread.sleep(10000);

    }
}
