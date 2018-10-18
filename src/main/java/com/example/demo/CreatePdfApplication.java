package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatePdfApplication extends PdfGenaratorUtil {
	@Autowired
	PdfGenaratorUtil pdfGenaratorUtil;
	
	public static void main(String[] args) {
		 Map<String,String> data = new HashMap<String,String>();
		    data.put("name","James");
		    pdfGenaratorUtil.createPdf("Hello",data); 
		SpringApplication.run(CreatePdfApplication.class, args);
		
	}
}
