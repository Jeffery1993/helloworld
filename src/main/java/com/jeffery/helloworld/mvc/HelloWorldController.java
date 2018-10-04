package com.jeffery.helloworld.mvc;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JEFFERY YEW
 * @since 12 NOV 2017
 */
@RequestMapping(value = "/api", produces = { MediaType.APPLICATION_JSON_VALUE })
@RestController
public class HelloWorldController {

	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String getHelloWorld() {
		return "Hello World!";
	}

	@RequestMapping(value = "/human", method = RequestMethod.GET)
	public Human getHuman(@RequestParam(value = "name", required = true) String name) {
		return new Human(name);
	}

}
