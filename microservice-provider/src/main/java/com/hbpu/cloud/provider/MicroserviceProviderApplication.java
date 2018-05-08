package com.hbpu.cloud.provider;

import com.github.boot.framework.config.ServletConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.session.SessionAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 微服务提供者
 * @author chenjianhui
 */
@ComponentScan("com.hbpu.cloud.provider")
@Import(ServletConfigure.class)
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, SessionAutoConfiguration.class})
public class MicroserviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderApplication.class, args);
	}
}
