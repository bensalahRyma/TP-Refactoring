# TP – Refactoring with IDE and LLM
## Code Smell: Concrete Dependency

---

## 1. Objective of the TP

The objective of this practical work is to study **code refactoring operations** provided by modern IDEs
and to analyze how **Large Language Models (LLMs)** can assist or replace these operations.

The work focuses on:
- identifying a **code smell / anti-pattern**
- creating a **functional Java program containing this smell**
- applying refactoring operations using:
    - an **IDE (IntelliJ IDEA)**
    - a **Large Language Model**
- comparing the two approaches in terms of quality, safety, and usability

---

## 2. Assigned Code Smell

- **Category**: Dependencies
- **Name**: Concrete Dependency

### Description

The *Concrete Dependency* code smell occurs when a class depends directly on a **concrete implementation**
instead of an **abstraction (interface)**.  
This design reduces flexibility, increases coupling, and violates the
**Dependency Inversion Principle (DIP)**.

---

## 3. Initial Program (Before Refactoring)

### 3.1 Description of the Design

The initial program implements a simple notification system:

- `EmailSender` is responsible for sending email notifications
- `NotificationService` uses `EmailSender` to notify users
- `Main` contains a test scenario

However, `NotificationService`:
- directly instantiates `EmailSender` using the `new` keyword
- depends on a concrete class instead of an abstraction

This creates a **strong coupling** between the service and the implementation.

---

### 3.2 Code Smell Illustration

```java
class NotificationService {

    private EmailSender emailSender = new EmailSender();

    public void notifyUser(String userEmail, String content) {
        emailSender.sendEmail(userEmail, content);
    }
}
