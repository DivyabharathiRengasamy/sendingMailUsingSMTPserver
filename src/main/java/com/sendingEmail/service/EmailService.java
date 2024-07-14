package com.sendingEmail.service;

import org.springframework.stereotype.Service;

import com.sendingEmail.model.EmailDetails;
@Service
public interface EmailService {
	
	public String sendSimpleMail1(EmailDetails details);

	public String sendMailWithAttachment(EmailDetails details);
}
