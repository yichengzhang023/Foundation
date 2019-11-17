##生命周期
类似Java，Spring的生命周期也从开始到结束分为几个步骤，并且通过IOC容器进行管理。
- 通过构造器或者工厂创建bean实例
- 调用bean的初始化方法
> ```<init-method>```
- 操作bean
- 容器关闭时，销毁bean
>```<destroy-method>```
---
另一种方式：<br>
实现BeanPostProcessor接口。<br>
此两个方法会在init-method前后调用<br>
```postProcessBeforeInitialization```<br>
```postProcessAfterInitialization```<br>


