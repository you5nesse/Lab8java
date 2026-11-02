# Module paiement

L’interface PaymentProcessor impose deux méthodes : processPayment et getPaymentMethod.
Trois classes l’implémentent : CreditCardProcessor (numéro de carte), BankTransferProcessor et PayPalProcessor .
PaymentService reçoit n’importe quel PaymentProcessor dans son constructeur. Sa méthode pay affiche le moyen utilisé, lance le paiement, puis indique si la transaction a réussi ou échoué.
# Module notifications 

L’interface NotificationSender impose sendNotification et getChannelType.
EmailNotificationSender vérifie que l’adresse contient un @. SmsNotificationSender tronque le message à 160 caractères.
NotificationService reçoit un NotificationSender dans son constructeur. Sa méthode sendWelcomeMessage envoie un message de bienvenue par le canal choisi.
<img width="1920" height="1080" alt="Capture d’écran (328)" src="https://github.com/user-attachments/assets/4dca6d7d-ab63-4152-bd56-c6befe9213bd" />
