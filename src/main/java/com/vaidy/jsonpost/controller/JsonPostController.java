package com.vaidy.jsonpost.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vaidy.jsonpost.entity.DTOEvent;
import com.vaidy.jsonpost.entity.EventResponse;



@RestController
@RequestMapping("/api")
public class JsonPostController {
	
	
	@PostMapping(path = "/event",
	consumes = MediaType.APPLICATION_JSON_VALUE,
    produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	public ResponseEntity<EventResponse> eventPost(@RequestBody DTOEvent event) {
		System.out.println("Bhaktha's first program ");
		System.out.println("----------------------------------------------------------------");
		System.out.println(event.toString());
		System.out.println("----------------------------------------------------------------");
		return null;

	}

}
