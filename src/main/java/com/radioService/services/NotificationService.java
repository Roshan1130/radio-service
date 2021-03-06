package com.radioService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.radioService.dtos.MessageDto;


@Service
public class NotificationService {
	
	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessage(MessageDto message) {
		jmsTemplate.convertAndSend(message);
	}
}
