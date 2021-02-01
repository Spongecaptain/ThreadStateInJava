package cool.spongecaptain;

public class TestWait {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        synchronized (o){
            o.wait();
        }
    }
}
