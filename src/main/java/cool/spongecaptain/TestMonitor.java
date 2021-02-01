package cool.spongecaptain;

public class TestMonitor {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();

        synchronized (o){
            new Thread(()->{
                synchronized (o){
                    System.out.println("xxx");
                }
            }).start();

            Thread.sleep(100000);
        }


    }
}
