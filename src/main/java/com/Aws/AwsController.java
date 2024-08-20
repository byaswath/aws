package com.Aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {
	@GetMapping(value = "/getget")
	public String display() {
		return "Itha Na Solliye Aaganum !!!!";
	}

}
