package com.yunfan.configuration.config;

import com.yunfan.configuration.bean.MyImportBeanDefinitionRegistrar;
import com.yunfan.configuration.bean.MyImportSelector;
import com.yunfan.configuration.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yunfan
 * @date 2019/11/19 22:59
 */
@Configuration
//@Import(ImportConfig.class)
@Import(value = {MyImportBeanDefinitionRegistrar.class, MyImportSelector.class})
public class AppConfig {

//	@Bean
//	public User user() {
//		return new User();
//	}

}
