package io.pivotal.spring.bian.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

public abstract class ApiSubError {

}

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
class ApiValidationError extends ApiSubError {
	private String object;
	private String field;
	private Object rejectedValue;
	private String message;
	
	ApiValidationError(String object, String message) {
		this.object = object;
		this.message = message;
	}
}