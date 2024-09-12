
package javadelsocorro;
import java.util.Scanner;



public class Reciept {
    public void getreceipt(){
        
        Scanner input = new Scanner(System.in);
        String fname,pname;
        
        int quan, price, cash, totald,change;
        
        System.out.println("Customer name:");
        fname = input.nextLine();
        
        System.out.println("Product Name:");
        pname = input.nextLine();
        
        System.out.println("Quantity:");
        quan = input.nextInt();
        
        System.out.println("Price:");
        price = input.nextInt();
        
        System.out.println("Cash:");
        cash = input.nextInt();
        Rcpt rc = new Rcpt();
        rc.processReceipt(fname, pname, quan, price, cash);
        rc.viewReceipt();
        
    }
    
}