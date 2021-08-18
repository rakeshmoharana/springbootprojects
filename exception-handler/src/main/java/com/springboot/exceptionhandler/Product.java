package com.springboot.exceptionhandler;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//import org.springframework.lang.NonNull;
//import javax/.validation.constraints.Size;

public class Product {
		@NotBlank(message = "Id cannot be null")	
//		@Size
	   private String id;
	   private String name;

	   public String getId() {
	      return id;
	   }
	   public void setId(String id) {
	      this.id = id;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	}
