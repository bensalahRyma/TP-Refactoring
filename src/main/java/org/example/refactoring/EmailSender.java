package org.example.refactoring;

public class EmailSender implements NotificationSender {

    @Override
    public void sendEmail(String recipient, String message) {
        System.out.println("[EMAIL] Sending to " + recipient + ": " + message);
    }
}