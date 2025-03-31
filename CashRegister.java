public class CashRegister{
     private double purchase;
     private double payment;
     public CashRegister(){
        purchase=0;
        payment=0;
    }
    public void recordPurchase(double amount){
        purchase += amount;
    }
    public void receivePayment(double amount){
        payment += amount;
    }
    public double giveChange(){
        double change=payment-purchase;
        purchase=0;
        payment=0;
        return change;
    }
    public double getItemCount(double amount){
        return amount;
    }
     
    public static void main(String[] args){
        CashRegister a=new CashRegister();
        a.recordPurchase(3);
        a.receivePayment(3);
        a.giveChange();
        a.getItemCount(3);

    }
}
