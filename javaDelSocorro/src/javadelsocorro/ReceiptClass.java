package javadelsocorro;

import java.util.Scanner;

public class ReceiptClass {
    public void receipt(){
    
    Scanner input = new Scanner(System.in);
    
   String fname,pname;
   
   int q,p,c;
   
   System.out.print("Costumer name: ");
        fname = input.nextLine();
        System.out.print("Product name: ");
        pname = input.nextLine();
        System.out.print("Quantity: ");
        q = input.nextInt();
        System.out.print("Price: ");
        p = input.nextInt();
        System.out.print("Cash : ");
        c = input.nextInt();
        
        System.out.println("-----------------------");
        System.out.println("RECEIPT");
        System.out.println("-----------------------");
        System.out.println("Costumer name: "+fname);
        System.out.println("Product name: "+pname);
        System.out.println("Quantity: "+q);
        System.out.println("-----------------------");
        System.out.println("Total Due: "+(q*p));
        System.out.println("Cash: "+c);
        System.out.println("-----------------------");
        System.out.println("Change: "+(c-(q*p)));
}
    
}
