
package javadelsocorro;
public class Salaries {
    int eid,hours;
    String ename;
    double rates,deduct,gross,netpay;
    
    public void addSalary(int id, String name, double rate, int hour, double deduction){
        this.eid = id;
        this.ename = name;
        this.rates = rate;
        this.hours = hour;
        this.deduct = deduction;
        this.gross = this.rates * this.hours;
        this.netpay = this.gross - this.deduct;
    }
    
    public void getSalary(){
        
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10.2f %-10.2f %-10.2f\n",eid,ename,rates,hours,gross,deduct,netpay);
    }
}