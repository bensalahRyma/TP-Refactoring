package org.example.refactoring;

public class MainRefactor {
    public static void main(String[] args) {

        NotificationSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);

        System.out.println("---- Test NotificationService (IntelliJ refactoring) ----");

        service.notifyUser("user@example.com", "Bienvenue sur notre plateforme !");
        service.notifyUser("admin@example.com", "Un nouvel utilisateur vient de s'inscrire.");
    }
}
