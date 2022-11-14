package BTBuoi3.BT4;

public class Invoice
{
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerID(){
        return customer.getId();

    }
    public String getCustomerName(){
        return customer.getName();

    }
    public int getCustomerDiscount(){
        return customer.getDiscount();

    }
    public double getAmountAfterDiscount(){
        return amount-(amount*getCustomerDiscount()/100);
    }

    @Override
    public String toString() {
      return String.format("Invoice[id=%d,customer=%s(%d)(%d%s),amount=%f",id,getCustomerName(),getCustomerID(),getCustomerDiscount(),"%",amount);
    }
}
