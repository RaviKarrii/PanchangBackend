package com.ravikarri.panchang;
import java.util.Optional;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@GetMapping(value="/api/getPanchang")
	public String getPanchang(@RequestParam("lat") Float lat,@RequestParam("lon") Float lon) {
		return "Welcome to Panchang \n" +
				"Latitude Given "+lat+ " Longitude Given "+lon;
	}

}
