##通过注解方式配置bean
###注解类型：
1. Controller
2. Repository
3. Service
>无本质区别，主要是用于功能区分
---
xml文件的引入：
```xml
<context:component-scan base-package="com.web.annotation">
```
>引入context命名空间，使用component-scan扫描，并且指定扫描的package。
---
在有关联类的时候，可以使用autowire注解，并且最好使用构造器和setter注入而不是类型注入

IOC中存在多个类型兼容的bean时，可以用qualifier提供Bean的名称
如
```java
@Autowired
@Qualifier("test")
//已有名字为test的类被注解了
```
