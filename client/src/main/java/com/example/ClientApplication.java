package com.example;

import me.ucake.session.FlushMode;
import me.ucake.session.jvm.MapSessionRepository;
import me.ucake.session.web.SimpleSessionFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}


	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		SimpleSessionFilter filter = new SimpleSessionFilter(new MapSessionRepository());
		filter.setSessionRepository(new MapSessionRepository(FlushMode.IMMEDIATE));
		filterRegistrationBean.setFilter(filter);
		filterRegistrationBean.setOrder(Integer.MIN_VALUE);
		return filterRegistrationBean;
	}

}
