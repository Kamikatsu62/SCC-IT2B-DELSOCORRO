
package javadelsocorro;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    Accounts[] acs = new Accounts[100];
    
    public void getAccounts(){
        
        System.out.print("Add number of users: ");
        int user = sc.nextInt();
        
        for(int i = 0; i < user; i++){
            System.out.println("\nEnter details of User "+(i+1));
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("First name: ");
            String fName = sc.nextLine();
            System.out.print("Last name: ");
            String lName = sc.nextLine();
            System.out.print("Email: ");
            String Eadd = sc.next();
            System.out.print("Username: ");
            String usern = sc.next();
            
            System.out.println("\nPassword criterea:"
                    + "\n1. Must be above 8 characters"
                    + "\n2. Must have at least 1 upper & 1 lower case letters"
                    + "\n3. Must have at least 1 number"
                    + "\n4. Must have at least 1 special character"
                    + "\n5. Must not have common password names like 'admin', password', and '1234'");
            
            System.out.print("\nPassword: ");
            String passw = sc.next();
            
            while(!passwordVerify(passw)){
                System.out.print("\nPassword: ");
                passw = sc.next();
            }
            
            if(duplicateVerify(ID, Eadd, usern, i)){
                i--;
                continue;
            }
            
            acs[i] = new Accounts();
            acs[i].addAccounts(ID, fName, lName, Eadd, usern, passw);
        }
        
        System.out.printf("\n\n%-5s %-10s %-10s %-20s %-10s %-10s\n","ID", "First Name", "Last Name", "Email", "Username", "Password");
        
        for(int i = 0; i < user; i++){
            acs[i].viewAccounts();
        }
    }
    
    private boolean duplicateVerify(int id, String email, String user, int index){
        for(int j = 0; j < index; j++){
            if(id==acs[j].aid){
                System.out.println("\nInput invalid, must not have a duplicated ID.");
                return true;
            } else if(email.contains(acs[j].email)){
                System.out.println("\nInput invalid, must not have a duplicated Email.");
                return true;
            } else if(user.contains(acs[j].user)){
                System.out.println("\nInput invalid, must not have a duplicated Username.");
                return true;
            }
        }
        return false;
    }
    
    private boolean passwordVerify(String password){
        if(!(password.length() > 8)){
            System.out.println("\nPassword is invalid, password must be above 8 characters");
            return false;
        }
        
        if(password.equals("admin") || password.equals("password") || password.equals("1234")){
            System.out.println("\nPassword is invalid, password must not contains common passwords like 'admin', 'password', and '1234'");
            return false;
        }
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialchar = false;
        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
                hasLowercase = true;
            } else if(Character.isUpperCase(c)){
                hasUppercase = true;
            } else if(Character.isDigit(c)){
                hasDigit = true;
            } else if(!Character.isLetterOrDigit(c)){
                hasSpecialchar = true;
            }
        }
        
        if(!(hasUppercase && hasLowercase)){
            System.out.println("\nPassword is invalid, must have 1 upper and l lower case letters");
            return false;
        } else if(!hasDigit){
            System.out.println("\nPassword is invalid, must have at least 1 number");
            return false;
        } else if(!hasSpecialchar){
            System.out.println("\nPassword is invalid, must have at least 1 special character");
            return false;
        }
        return true;
    }
}
