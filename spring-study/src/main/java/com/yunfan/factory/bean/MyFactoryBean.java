package com.yunfan.factory.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author yunfan
 * @date 2019/11/19 22:48
 */
public class MyFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
