//Praktikum Inheritance Nomor 9
package inheritanceno9;

public class Account {
    public static void main(String[] args) {
        
    }
    protected double balance;
    
    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public boolean deposit(double amt){
        balance+=amt;
        return true;
    }
    
    public boolean withDraw(double amt){
        balance-=amt;
        return true;
    }
}
