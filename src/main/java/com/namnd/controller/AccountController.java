//package com.namnd.controller;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.namnd.model.*;
//
//@RestController
//@RequestMapping("/account")
//public class AccountController {
//
//	@Autowired
//	private KafkaTemplate<String, Object> kafkaTemplate;
//
//	@PostMapping("/new")
//	public AccountDTO create(@RequestBody AccountDTO account) {
//		StatisticDTO stat = new StatisticDTO("Account" + account.getEmail() + " is created", new Date());
//		//send notification
//
//		MessageDTO messageDTO = new MessageDTO();
//		messageDTO.setTo(account.getEmail());
//		messageDTO.setToName(account.getName());
//		messageDTO.setSubject("NAMnd");
//		messageDTO.setContent("noi dung ABC");
//
//		kafkaTemplate.send("notification", messageDTO);
//		kafkaTemplate.send("statistic", stat);
//		return account;
//
//	}
//
//
//
//}
