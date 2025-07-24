// Implement an interface for a real-world example,such as a payment gateway.
package JavaAssignment;

//Interface representing a payment gateway
interface PaymentGateway 
{
 void processPayment(double amount);
 void cancelPayment(String transactionId);
}

//Class implementing the PaymentGateway interface
class CreditCardPayment implements PaymentGateway
{
 public void processPayment(double amount) 
 {
     System.out.println("Processing credit card payment of ₹" + amount);
 }

 public void cancelPayment(String transactionId) 
 {
     System.out.println("Credit card payment with Transaction ID " + transactionId + " has been canceled.");
 }
}

//Another payment method
class UpiPayment implements PaymentGateway 
{
 public void processPayment(double amount) 
 {
     System.out.println("Processing UPI payment of ₹" + amount);
 }

 public void cancelPayment(String transactionId) 
 {
     System.out.println("UPI payment with Transaction ID " + transactionId + " has been canceled.");
 }
}

public class A028_PaymentGateway
{
 public static void main(String[] args)
 {
     // Using Credit Card payment
     PaymentGateway payment1 = new CreditCardPayment();
     payment1.processPayment(1500.00);
     payment1.cancelPayment("TXN12345");

     System.out.println();

     // Using UPI payment
     PaymentGateway payment2 = new UpiPayment();
     payment2.processPayment(999.99);
     payment2.cancelPayment("TXN54321");
 }
}
