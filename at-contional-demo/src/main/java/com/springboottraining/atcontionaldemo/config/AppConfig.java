package com.springboottraining.atcontionaldemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.springboottraining.atcontionaldemo.service.CATaxCalculationService;
import com.springboottraining.atcontionaldemo.service.CATaxCalculationTypeCondition;
import com.springboottraining.atcontionaldemo.service.INTaxCalculationTypeCondition;

import com.springboottraining.atcontionaldemo.service.USTaxCalculationTypeCondition;
import com.springboottraining.atcontionaldemo.service.TaxCalculationService;
import com.springboottraining.atcontionaldemo.service.USTaxCalculationService;

@Configuration
public class AppConfig {
	@Bean 
	 @Conditional(USTaxCalculationTypeCondition.class)
	 public TaxCalculationService usTaxCalculationService() {
	  System.out.println("USTaxCalculationTypeCondition.class");
		return new USTaxCalculationService();
	 }

	 @Bean 
	 @Conditional(CATaxCalculationTypeCondition.class)
	 public TaxCalculationService caTaxCalculationService() {
		 System.out.println("CATaxCalculationTypeCondition.class");
	  return new CATaxCalculationService();
	 }
	 
	 @Bean 
	 @Conditional(INTaxCalculationTypeCondition.class)
	 public TaxCalculationService inTaxCalculationService() {
		 System.out.println("INTaxCalculationTypeCondition.class");
	  return new CATaxCalculationService();
	 }
}
