package com.sendingEmail.model;

import org.springframework.web.multipart.MultipartFile;

public class EmailDetails {

	// Class data members
	private String recipient;
	private String msgBody;
	private String subject;
	private MultipartFile attachment;
	
	
	public EmailDetails() {
		super();
	}


	public EmailDetails(String recipient, String msgBody, String subject, MultipartFile attachment) {
		super();
		this.recipient = recipient;
		this.msgBody = msgBody;
		this.subject = subject;
		this.attachment = attachment;
	}


	public String getRecipient() {
		return recipient;
	}


	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}


	public String getMsgBody() {
		return msgBody;
	}


	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public MultipartFile getAttachment() {
		return attachment;
	}


	public void setAttachment(MultipartFile attachment) {
		this.attachment = attachment;
	}
	
	
}

	