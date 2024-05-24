package com.ism.job.recruitment.service;

import java.time.LocalDateTime;
import java.util.List;

import com.ism.job.recruitment.entity.Notification;
import com.ism.job.recruitment.entity.User;
import com.ism.job.recruitment.entity.Vacancy;

public interface NotificationService {

	void createNotification(String message, LocalDateTime createdAt, Vacancy vacancy);

	void updateNotificationStatus(Notification notification, List<User> user);

	Notification getNotificationById(long id);

	List<Notification> getAllNotifications();

	List<Notification> getAllByUserId(int id);
}