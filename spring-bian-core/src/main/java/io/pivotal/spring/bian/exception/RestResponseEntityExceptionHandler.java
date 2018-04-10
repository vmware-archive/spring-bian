package io.pivotal.spring.bian.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(IllegalServiceOperationException.class)
	protected ResponseEntity<Object> handleBadServiceOperation(RuntimeException ex) {
		ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
		apiError.setMessage(ex.getMessage());
		return buildResponseEntity(apiError);
	}
	
	private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
		return new ResponseEntity<>(apiError, apiError.getStatus());
	}
	
	HttpStatus resolveAnnotatedResponseStatus(Exception ex) {
//		ResponseStatus annotation = findMergedAnnotation(ex.getClass(), ResponseStatus.class);
//		if (annotation != null) {
//			return annotation.value();
//		}
		return HttpStatus.INTERNAL_SERVER_ERROR;
	}
}
