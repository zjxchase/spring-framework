package com.yunfan.configuration.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author yunfan
 * @date 2019/11/19 23:12
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 按类型查找
		return new String[]{"com.yunfan.configuration.bean.Teacher"};
	}
}
