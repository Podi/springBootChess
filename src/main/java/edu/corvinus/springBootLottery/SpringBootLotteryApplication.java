package edu.corvinus.springBootLottery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootLotteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLotteryApplication.class, args);
	}

}
