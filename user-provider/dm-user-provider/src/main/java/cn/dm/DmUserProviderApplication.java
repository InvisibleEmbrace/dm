package cn.dm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DmUserProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmUserProviderApplication.class, args);
	}
}
