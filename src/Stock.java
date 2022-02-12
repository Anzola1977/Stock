public class Stock extends Thread{
    int money = 1000;
    @Override
    public void run() {
        while(true){
            money++;
        }
    }
}
