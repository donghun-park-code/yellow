package site.metacoding.demo.yellow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YellowControllrer {

	@GetMapping("/index")
	public String yellow() {
		return "index";
	}
}
