import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.start();
        long profit = 0;
        //блок управления
        Scanner in = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = in.next();
            switch(command){
                case "check":
                    System.out.println(stock.money);
                    break;
                case "fix":
                    //Фиксируем прибыль
                    profit += (long)stock.money - 1000;
                    System.out.println("Profit is " + profit);
                    //На счету остается минимальный остаток
                    stock.money = 1000;
            }
        }
    }
}
