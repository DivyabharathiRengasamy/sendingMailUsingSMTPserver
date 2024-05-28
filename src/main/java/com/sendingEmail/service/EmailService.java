package com.sendingEmail.service;

import com.sendingEmail.model.EmailDetails;

public interface EmailService {
	
	public String sendSimpleMail1(EmailDetails details);

	public String sendMailWithAttachment(EmailDetails details);
}
