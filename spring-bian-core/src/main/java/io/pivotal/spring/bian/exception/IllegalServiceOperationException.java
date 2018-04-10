package io.pivotal.spring.bian.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalServiceOperationException extends RuntimeException {
	public IllegalServiceOperationException(String action) {
		super("invalid service operation '" + action + "'.");
	}
}
