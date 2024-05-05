package SolidPriciples;

public class OrderAction implements CalculatorTotal, EmailNotification, InvoiceGenerator, SetUpPlace {
    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("\nOrder total: $" + total);
    }


    @Override
    public void sendEmailNotification(String email) {
        //Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }

    @Override
    public void generateInvoice(String fileName) {
        //Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }


    @Override
    public void placeOrder(String customerName, String address) {
        //Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
