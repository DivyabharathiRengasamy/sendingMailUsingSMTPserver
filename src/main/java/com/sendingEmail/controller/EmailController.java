package com.sendingEmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sendingEmail.model.EmailDetails;
import com.sendingEmail.service.EmailService;

import jakarta.mail.Multipart;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/")
    public String home(Model model) {
    	 model.addAttribute("emailDetails", new EmailDetails());
        return "home";
    }

    @GetMapping("/sendEmailForm")
    public String showEmailForm(Model model) {
        model.addAttribute("emailDetails", new EmailDetails());
        return "sendEmail";
    }
    @GetMapping("/sendEmailFormWithAttachment")
    public String showEmailFormWithAttachment(Model model) {
        model.addAttribute("emailDetails", new EmailDetails());
        return "sendEmailAttachment";
    }

    @PostMapping("/sendEmail")
    public String sendMail(@ModelAttribute("emailDetails") EmailDetails emailDetails, Model model) {
        String status = emailService.sendSimpleMail1(emailDetails);
        model.addAttribute("status", status);
        return "redirect:/sendEmailForm?status=" + status;
    }

    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@ModelAttribute("emailDetails") EmailDetails emailDetails,
    		Model model,
    		@RequestParam("file") MultipartFile file) {
       emailDetails.setAttachment(file);
    	String status = emailService.sendMailWithAttachment(emailDetails);
    	 model.addAttribute("status", status);
        return "redirect:/sendEmailForm?status=" + status;
    }
}
