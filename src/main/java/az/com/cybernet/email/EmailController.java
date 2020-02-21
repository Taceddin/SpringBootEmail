package az.com.cybernet.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	public JavaMailSender javaMailSender;
	
	@GetMapping(value = "/sendEmail")
	public void sendEmail() {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("taceddin.eli@mail.ru");
		message.setSubject("SpringBootApplication");
		message.setText("Spring Boot Email");
		javaMailSender.send(message);
	}
}
