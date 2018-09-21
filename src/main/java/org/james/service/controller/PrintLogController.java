package org.james.service.controller;

import org.james.service.model.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin
public class PrintLogController {

	private static final Logger logger = LoggerFactory.getLogger(PrintLogController.class);

	@RequestMapping("/print/{num}")
	public void printLog(@PathVariable int num) {
		for (int i = 0; i < num; i++) {
			logger.info("Just for print log - {}", i);
		}
	}
	
	@RequestMapping("/test")
	public Result test() {
		return new Result("123");
	}

}
