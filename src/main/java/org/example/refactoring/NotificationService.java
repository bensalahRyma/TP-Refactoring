package org.example.refactoring;

public class NotificationService {
    private final NotificationSender sender;

    // Dependency Injection via constructor (IntelliJ refactoring)
    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notifyUser(String userEmail, String content) {
        sender.sendEmail(userEmail, content);
    }
}
