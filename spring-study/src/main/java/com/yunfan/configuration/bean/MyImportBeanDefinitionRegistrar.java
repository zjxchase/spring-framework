package com.yunfan.configuration.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yunfan
 * @date 2019/11/19 23:09
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// bean 定义 承载bean属性：className
		BeanDefinition beanDefinition = new RootBeanDefinition(School.class);
		// BeanDefinitionRegistry bean 定义注册器 bean 的id作为key 存在map中
		registry.registerBeanDefinition("school", beanDefinition);

	}
}
