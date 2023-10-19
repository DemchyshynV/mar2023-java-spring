package com.example.mar2023spring.services;

import com.example.mar2023spring.dto.CarDto;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MailService {
    private final MailSender mailSender;

    public void notifyCreatedCar(CarDto createdCar){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(System.getProperty("spring.mail.username"));
        message.setTo("demchyshyn.v87@gmail.com");
        message.setSubject("New Car");
        message.setText("A new car was created id: %d, model: %s, producer: %s, power: %d".formatted(createdCar.getId(), createdCar.getModel(), createdCar.getProducer(), createdCar.getPower()));
        mailSender.send(message);
    }

    public void notifyDeletedCar(int id){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(System.getProperty("spring.mail.username"));
        message.setTo("demchyshyn.v87@gmail.com");
        message.setSubject("deleted Car");
        message.setText("car with id: %d was deleted".formatted(id));
        mailSender.send(message);
    }
}
