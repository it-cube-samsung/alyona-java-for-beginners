
package coffeemachine;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        System.out.println("Write how many cups of coffee you will need?");
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need:");
        int water = 200;
        int milk = 50;
        int coffeebeans = 15;
        System.out.println(  water * cups +" ml of water"  );
        System.out.println(  milk * cups +" ml of milk"  );
        System.out.println(  coffeebeans * cups +" g of coffee beans"  );
    }

}
