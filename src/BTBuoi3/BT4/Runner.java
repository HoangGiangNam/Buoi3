package BTBuoi3.BT4;

public class Runner {
    public static void main(String[] args) {
        Customer customer=new Customer(232,"Hoa Hien",8);
        System.out.println(customer);

        Invoice invoice=new Invoice(12,customer,999f);
        System.out.println(invoice);
        System.out.println("id is:"+invoice.getID());
        System.out.println("customer is:"+invoice.getCustomer());
        System.out.println("amount is:"+invoice.getAmount());
        System.out.println("customer's id is:"+invoice.getCustomerID());
        System.out.println("customer's name is:"+invoice.getCustomerName());
        System.out.println("customer's discount is:"+invoice.getCustomerDiscount());
        System.out.println("amount after discount is:"+invoice.getAmountAfterDiscount());



    }

}
