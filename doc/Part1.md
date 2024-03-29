##1. 主函数调用方式
```java
package com.web.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // IOC 容器
        // ClassPathXmlApplicationContext 是ApplicationContext的一个实现类
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean 根据id
        HelloworldBean helloworldBean = (HelloworldBean) applicationContext.getBean("helloworld");
        // 调用bean方法

        Car car1 = (Car) applicationContext.getBean("car");
        System.out.println(car1.toString());

        Car car2 = (Car) applicationContext.getBean("car2");

        System.out.println(car2.toString());
        helloworldBean.hello();

        Person p = (Person) applicationContext.getBean("person");
        System.out.println(p.toString());

        DataSource dataSource = (DataSource) applicationContext.getBean("properties");
        System.out.println(dataSource.toString());

        Person p1 = (Person) applicationContext.getBean("person1");
        System.out.println(p1.toString());

    }
}
```

##2. XML配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!--xml namespace 引入 可以引入p-->
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:util="http://www.springframework.org/schema/util"
       xmlns:p="http://www.springframework.org/schema/p"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd">
    <!--配置bean
    id: 引用bean
    class：bean的全类名
    用反射的方式在IOC容器中创建bean，所以要求bean中必须有无参构造器
    -->
    <bean id="helloworld" class="com.web.spring.HelloworldBean">
        <!--属性注入，通过set方法-->
        <property name="name" value="Yicheng"/>
    </bean>

    <bean id="car" class="com.web.spring.Car">
        <constructor-arg value="Audi"/>
        <constructor-arg value="300000"/>
    </bean>
    <!--    属性和位置可以同时使用区分重载的构造器-->
    <bean id="car2" class="com.web.spring.Car">
        <constructor-arg value="200000" type="int"/>
        <constructor-arg value="Baoma" type="java.lang.String" index="0"/>
        <constructor-arg value="240" type="float"/>
        <constructor-arg type="java.lang.String">
            <value><![CDATA[<Shanghai ^^^>]]></value>
        </constructor-arg>
    </bean>

    <bean id="person" class="com.web.spring.Person">
        <property name="name" value="Tom"/>
        <property name="age" value="24"/>
        <property name="car" ref="car"/>
        <!--list，set用ref引入其他bean， map用entry value-ref 引入其他bean-->
        <property name="carList">
            <list>
                <ref bean="car"/>
                <ref bean="car2"/>
            </list>
        </property>
    </bean>

    <bean id="person1" class="com.web.spring.Person" p:name = "Queen" p:age="30" p:car-ref="car" p:carList-ref="cars">

    </bean>

    <bean id="properties" class="com.web.spring.DataSource">
        <property name="properties">
            <props>
                <prop key="user">root</prop>
                <prop key="oassword">1234</prop>
                <prop key="jbdurl">root</prop>
                <prop key="driverclass">test.com</prop>
            </props>
        </property>
    </bean>
    <!--直接定义list 可以作为ref传给其他bean-->
    <util:list id="cars">
        <ref bean="car"/>
        <ref bean="car2"/>
    </util:list>
</beans>
```
