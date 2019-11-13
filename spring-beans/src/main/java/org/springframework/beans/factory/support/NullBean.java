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

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

/**
 * Internal（内部的；里面的；体内的；（机构）内部的） representation（代表；表现；表示法；陈述） of a null bean instance, e.g. for a {@code null} value
 * returned from {@link FactoryBean#getObject()} or from a factory method.
 *
 * 一个空bean实例的内部表示,例如从{ @link factory ybean # getObject()}或工厂方法返回的{ @code null }值。
 *
 * <p>Each such null bean is represented by a dedicated {@code NullBean} instance
 * which are not equal to each other, uniquely differentiating each bean as returned
 * from all variants of {@link org.springframework.beans.factory.BeanFactory#getBean}.
 * However（无论以何种方式; 不管怎样）, each such instance will return {@code true} for {@code #equals(null)}
 * and returns "null" from {@code #toString()}, which is how they can be tested
 * externally (since this class itself is not public).
 *
 * 每个这样的空bean都是由一个专用的{ @code NullBean实例来表示的,它不等于彼此,唯一的区分每个bean,
 * 就像从{ @link org. springframework. beans.factory。beanfactory # getBean }中返回的每个bean一样。
 *
 * 但是,每个这样的实例都将返回{@code true} for {@code #equals(null)},并从{ @code # toString()}返回“null”,这就是它们如何在外部测试的方法(因为这个类本身不是公开的)。
 *
 * @author Juergen Hoeller
 * @since 5.0
 */
final class NullBean {

	NullBean() {
	}


	@Override
	public boolean equals(@Nullable Object obj) {
		return (this == obj || obj == null);
	}

	@Override
	public int hashCode() {
		return NullBean.class.hashCode();
	}

	@Override
	public String toString() {
		return "null";
	}

}
