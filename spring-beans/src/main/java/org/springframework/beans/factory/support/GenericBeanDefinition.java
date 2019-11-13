/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.lang.Nullable;

/**
 * GenericBeanDefinition is a one-stop shop for standard bean definition purposes.
 * Like any bean definition, it allows for specifying a class plus optionally（随意地）
 * constructor argument values and property values. Additionally（ 此外；又，加之）, deriving（源于） from a
 * parent bean definition can be flexibly（灵活地；易曲地；柔软地；有弹性地） configured through the "parentName" property.
 *
 * GenericBeanDefinition是标准bean定义目的的一站式服务。
 * 与任何bean定义一样,它允许指定一个类,再加上构造函数参数值和属性值。
 * 此外,从父bean定义中派生的可以通过“parentName”属性灵活配置。
 *
 * <p>In general, use this {@code GenericBeanDefinition} class for the purpose（目的；用途；意志） of
 * registering user-visible bean definitions (which a post-processor might operate on,
 * potentially even reconfiguring the parent name). Use {@code RootBeanDefinition} /
 * {@code ChildBeanDefinition} where parent/child relationships happen to be pre-determined（预先确定的）.
 *
 * 一般来说,使用这个{ @code GenericBeanDefinition }类来注册用户可见的bean定义(后处理器可能会运行,甚至可能重新配置父名)。
 * 使用{ @code RootBeanDefinition } / { @code child =定义},在那里,父母/子关系发生在确定的地方
 *
 * @author Juergen Hoeller
 * @since 2.5
 * @see #setParentName
 * @see RootBeanDefinition
 * @see ChildBeanDefinition
 */
@SuppressWarnings("serial")
public class GenericBeanDefinition extends AbstractBeanDefinition {

	@Nullable
	private String parentName;


	/**
	 * Create a new GenericBeanDefinition, to be configured through its bean
	 * properties and configuration methods.
	 * @see #setBeanClass
	 * @see #setScope
	 * @see #setConstructorArgumentValues
	 * @see #setPropertyValues
	 */
	public GenericBeanDefinition() {
		super();
	}

	/**
	 * Create a new GenericBeanDefinition as deep copy of the given
	 * bean definition.
	 * @param original the original bean definition to copy from
	 */
	public GenericBeanDefinition(BeanDefinition original) {
		super(original);
	}


	@Override
	public void setParentName(@Nullable String parentName) {
		this.parentName = parentName;
	}

	@Override
	@Nullable
	public String getParentName() {
		return this.parentName;
	}


	@Override
	public AbstractBeanDefinition cloneBeanDefinition() {
		return new GenericBeanDefinition(this);
	}

	@Override
	public boolean equals(Object other) {
		return (this == other || (other instanceof GenericBeanDefinition && super.equals(other)));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Generic bean");
		if (this.parentName != null) {
			sb.append(" with parent '").append(this.parentName).append("'");
		}
		sb.append(": ").append(super.toString());
		return sb.toString();
	}

}
