# Spring Boot Email Sender Application

This is a Spring Boot web-based application that allows users to send emails via a simple form interface. The app supports both plain emails and emails with file attachments using Spring Boot's `JavaMailSender` service.

## Features
- Send simple text emails
- Send emails with attachments
- Form-based frontend using Thymeleaf
- Input validation and status feedback
- Lightweight and easy to integrate

## Technologies Used
- Java 17+
- Spring Boot
- Thymeleaf
- JavaMailSender
- MultipartFile (for attachment handling)

## Endpoints
- `/sendEmailForm` — form to send plain email
- `/sendEmailFormWithAttachment` — form to send email with attachment
- POST `/sendEmail` — handles simple email sending
- POST `/sendMailWithAttachment` — handles email with file attachment

## How to Run
1. Clone the repository
2. Configure your SMTP settings in `application.properties`
3. Run the Spring Boot app
4. Access `http://localhost:8080/` in your browser

---

Let me know if you'd like help writing the `application.properties` mail config or adding screenshots of the forms for a better GitHub presentation.
