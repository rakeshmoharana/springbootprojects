package com.springboot.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductExceptionController {
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
   @ExceptionHandler(value = ProductNotfoundException.class)
   public ResponseEntity<Object> exception(ProductNotfoundException exception) {
	   System.out.println("Insode exception");
      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
   }


@ResponseStatus(HttpStatus.BAD_REQUEST)
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<Map<String, String>> handleValidationExceptions(
  MethodArgumentNotValidException ex) {
	 System.out.println("Insode handleValidationExceptions");
    Map<String, String> errors = new HashMap<String, String>();
    ex.getBindingResult().getAllErrors().forEach((error) -> {
        String fieldName = ((FieldError) error).getField();
        String errorMessage = error.getDefaultMessage();
        errors.put(fieldName, errorMessage);
        System.out.println(fieldName +"----"+errorMessage);
    });
    return new ResponseEntity<Map<String, String>>(errors,HttpStatus.NOT_FOUND);
}
}
