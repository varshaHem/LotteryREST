package com.lottery.rest.LotteryREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
	
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}*/
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
