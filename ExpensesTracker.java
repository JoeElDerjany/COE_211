import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExpensesTracker{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("expenses.txt");
        FileReader fr = new FileReader("expenses.txt");
        Scanner scan = new Scanner(System.in);
        String yn;
        String name;
        String purchase;
        double cost;
        
        do{
        
        System.out.println("Input your name: ");
        name = scan.nextLine();
        System.out.println("What did you purchase?");
        purchase = scan.nextLine();
        System.out.println("How much did you pay? (in USD)");
        cost = scan.nextDouble();
        
        fw.write(name + " purchased " + purchase + " for " + cost + " US Dollars. ");
        
        System.out.println("Would you like to log another purchase? (y/n)");
        scan.nextLine();
        yn = scan.nextLine();
        
        } while (yn.equals("y"));

        fw.close();
        
        System.out.println("Would you like to read a summary of your purchases?");
        yn = scan.nextLine();
        
        if (yn.equals("y")){
            int data = fr.read();
            while (data != -1){
                System.out.print((char)data);
                data = fr.read();
            }
            System.out.println();
        }
        
        System.out.println("End of code.");
        
        fr.close();
        scan.close();
    }
}
