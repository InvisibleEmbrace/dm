package cn.dm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DmSchedulerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmSchedulerProviderApplication.class, args);
	}
}
