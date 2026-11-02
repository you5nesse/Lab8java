package com.tp8;

import com.tp8.payment.*;
import com.tp8.notification.*;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor cardProcessor = new CreditCardProcessor("5200-2222-1133-1111");
		PaymentService cardService = new PaymentService(cardProcessor);
		cardService.pay(60.0);
		System.out.println("\n" + "=".repeat(40) + "\n");
		PaymentProcessor transferProcessor = new BankTransferProcessor("FR76-3000-6000-0112-3456");
		PaymentService transferService = new PaymentService(transferProcessor);
		transferService.pay(200.0);
		System.out.println("\n" + "=".repeat(40) + "\n");
		PaymentProcessor paypalProcessor = new PayPalProcessor("younesse@gmail.com");
		PaymentService paypalService = new PaymentService(paypalProcessor);
		paypalService.pay(130.0);
		System.out.println("\n" + "=".repeat(40) + "\n");
		System.out.println("TESTS NOTIFICATIONS\n");

		NotificationSender emailSender = new EmailNotificationSender();
		NotificationService emailService = new NotificationService(emailSender);
		emailService.sendWelcomeMessage("younesse@example.com");

		System.out.println("\n");

		NotificationSender smsSender = new SmsNotificationSender();
		NotificationService smsService = new NotificationService(smsSender);
		smsService.sendWelcomeMessage("+212647380823");
	}
}
