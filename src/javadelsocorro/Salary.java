
package javadelsocorro;
import java.util.Scanner;

public class Salary {
    public void getSalary(){
        Scanner sc = new Scanner(System.in);
        Salaries[] sr = new Salaries[100];
        
        System.out.print("Enter number of employees: ");
        int em = sc.nextInt();
        
        for(int i = 0; i < em; i++){
            System.out.println("Details of EMP "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Rate(Hour): ");
            double rate = sc.nextDouble();
            System.out.print("Hours worked: ");
            int hour = sc.nextInt();
            System.out.print("Total deduction: ");
            double deduction = sc.nextInt();
            
            sr[i] = new Salaries();
            sr[i].addSalary(id, name, rate, hour, deduction);
            
            System.out.println("");
        }
        
        double Tsalary = 0;
        double Tdeduction = 0;
        double Tnetpay = 0;
        
        System.out.println("\nEMP ID     Name       Rate       Hours      Gross      Deductions Netpay");
        for(int i = 0; i < em; i++){
            
            Tsalary += sr[i].gross;
            Tdeduction += sr[i].deduct;
            Tnetpay += sr[i].netpay;
            
            sr[i].getSalary();
        }
        System.out.println("-------------------------------------");
        System.out.println("Total salary for request: "+Tsalary);
        System.out.println("Total deductions: "+Tdeduction);
        System.out.println("Total salary to release: "+Tnetpay);
    }

    
    
}