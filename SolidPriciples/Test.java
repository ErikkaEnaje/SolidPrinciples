package SolidPriciples;

public class Test {
    public static void main(String[] args) {
        CalculatorTotal calculatorTotal = new OrderAction();
        calculatorTotal.calculateTotal(10.0, 2);

        SetUpPlace order = new OrderAction();
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoice = new OrderAction();
        invoice.generateInvoice("order_123.pdf");

        EmailNotification notifier = new OrderAction();
        notifier.sendEmailNotification("johndoe@example.com");
    }
}
