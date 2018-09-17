


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMy {

	@RequestMapping("/hello2")
	public String hello2() {
		return "Hello2!EEE!!!";
	}
	

	
}
