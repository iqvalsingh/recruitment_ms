package com.ism.job.recruitment.service;

import java.util.List;

import com.ism.job.recruitment.entity.PasswordReset;
import com.ism.job.recruitment.entity.User;

public interface PasswordResetService {
	public List<PasswordReset> getByUser(User user);

	public PasswordReset storePasswordReset(PasswordReset passwordReset);

	public PasswordReset updatePasswordReset(PasswordReset passwordReset);

	public PasswordReset getByResetToken(String resetToken);

	public PasswordReset getById(long id);

	public List<PasswordReset> getPasswordResetByNotNullTokens();

}