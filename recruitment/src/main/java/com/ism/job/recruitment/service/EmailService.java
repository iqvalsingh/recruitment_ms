package com.ism.job.recruitment.service;

import javax.mail.MessagingException;

import org.springframework.security.core.Authentication;

import com.ism.job.recruitment.entity.User;
import com.ism.job.recruitment.model.Email;

public interface EmailService {

	public User getCurrentUser(Authentication authentication);

	public String sendMail(String toEmail, String subject, String body) throws MessagingException;

	public String sendMailWithCCAttachment(Email email);

	public String validateCCAndAttachment(String[] ccAddress, String[] attachment);
}