package com.example.demo.api;

import com.example.demo.config.RabbitMqConfig;

import com.example.demo.dto.*;
import com.example.demo.dto.StudentDto;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
 * @author jrojas
 */
@RestController
public class ProducerController {

    @Autowired
    private RabbitTemplate template;

//    @PostMapping("/v1/api/consumer")
    @RequestMapping(method = RequestMethod.POST, value = "/v1/api/producer")
    public String sendMessage(@RequestBody MessageDto messageDto) {
        messageDto.setMessageId(UUID.randomUUID().toString());
        messageDto.setMessageDate(new Date());
        template.convertAndSend(RabbitMqConfig.EXCHANGE, RabbitMqConfig.ROUTING_KEY, messageDto);
        return "Mensaje enviado";
    }
//    post Student
    @RequestMapping(method = RequestMethod.POST, value = "/v1/api/Student")
    public String sendStudent(@RequestBody StudentDto studentDto) {
        template.convertAndSend(RabbitMqConfig.S_EXCHANGE, RabbitMqConfig.S_ROUTING_KEY, studentDto);
        return "Estudiante Enviado";
    }
//   Post Teacher
    @RequestMapping(method = RequestMethod.POST, value = "/v1/api/Teacher")
    public String sendTeacher(@RequestBody TeacherDto teacherDto) {
        template.convertAndSend(RabbitMqConfig.T_EXCHANGE, RabbitMqConfig.T_ROUTING_KEY, teacherDto);
        return "Teacher enviado Enviado";
}
//  Post Subject
    @RequestMapping(method = RequestMethod.POST, value = "/v1/api/Subject")
    public String sendSubject(@RequestBody SubjectDto subjectDto) {
        template.convertAndSend(RabbitMqConfig.SU_EXCHANGE, RabbitMqConfig.SU_ROUTING_KEY, subjectDto);
        return "Subject Enviado";
}
}
