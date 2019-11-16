## Bean之间的关系
###1. 继承
1.1 模板(抽象Bean)

可用于模板。子bean可以继承属性 并且有自己的属性

1.2  继承

关键字 ```parent="parent-bean"```

###2. 依赖

关键字 ```depend-on="depend-bean"```

###3. Scope
默认单例模式，但是可定义为prototype，每次建bean会新建对象

## 外部属性
主要使用包：
**c3p0** **mysql-connector**
### XML配置代码片段
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
        <property name="user" value="${user}"/>
        <property name="password" value="${password}"/>
        <property name="driverClass" value="${driverclass}"/>
        <property name="jdbcUrl" value="${jdbcurl}"/>
    </bean>

    <context:property-placeholder location="classpath:db.properties"/>
</beans>
```
两种方式，直接定义value或者用db.properties 定义，用placeholder引入
${} 引入值