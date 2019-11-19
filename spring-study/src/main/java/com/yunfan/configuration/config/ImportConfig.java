package com.yunfan.configuration.config;

import com.yunfan.configuration.bean.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yunfan
 * @date 2019/11/19 23:04
 */
@Configuration
public class ImportConfig {

	@Bean
	public Teacher teacher() {
		return new Teacher();
	}

}
