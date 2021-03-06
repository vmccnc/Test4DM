import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello!EEE!!!";
	}
	

	@RequestMapping("/hello4")
	public String hello4() {
		return "Hello!4444EEE!!!";
	}
	

	@RequestMapping("/hello3")
	public String hello3() {
		return "Hello!3333EEE!!!";
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}