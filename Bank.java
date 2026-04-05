class Banking{
    // Properties
    int AccNo;
    String HolderName;
    double Balance;
    int depo;
    int req;
    
    // Behaviours
    void deposit(){
        Balance = Balance + depo ;
        System.out.println("Total amount after deposit is : "+Balance);
    }
    void withdraw(){
        if(req > Balance){
            System.out.println("The withdraw amount is higher than the Balance ");
        }
        else {
            Balance = Balance - req;
            System.out.println("Total amount after withdraw : "+ Balance);
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        Banking b1 = new Banking();
        b1.AccNo = 1232343453;
        b1.HolderName = "Abhishek";
        b1.Balance = 123456;
        b1.depo = 5000;
        b1.req = 5000;
        b1.deposit();
        b1.withdraw();
    }
}
