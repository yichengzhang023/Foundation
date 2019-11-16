# Spring Foundation
## 1.1 IOC 控制反转
IoC模式，系统中通过引入实现了IoC模式的IoC容器，即可由IoC容器来管理对象的生命周期、依赖关系等，从而使得应用程序的配置和依赖性规范与实际的应用程序代码分离。其中一个特点就是通过文本的配置文件进行应用程序组件间相互关系的配置，而不用重新修改并编译具体的代码
具体的说，Spring 利用Java的反射等特性完成IOC。

主要模式：
1. 基于setter，即直接对对象赋值
2. 基于构造器，通过构造函数的参数对对象赋值
## 1.2 DI 依赖注入
就是由IOC容器在运行期间，动态地将某种依赖关系注入到对象之中
## 1.3 代码示例
###1.31 配置bean
1. 创建类
2. 构造器
3. getter setter方法，类方法
4. applicationContext.xml文件配置bean
5. 主方法测试
###1.32 主函数调用方式
```
ApplicationContext：IOC容器，使用ClassPathXmlApplicationContext作为实现类。
```
```
xml中使用<beans> 定义此文件命名空间，引入命名空间。
<bean> 配置bean
 <配置bean
    id: 引用bean(bean的引用)
    class：bean的全类名
    property：属性注入，使用类里的set方法
    用反射的方式在IOC容器中创建bean，所以要求bean中必须有无参构造器>
 其他配置方式见文件
```
[具体代码](./doc/Part1.md)
### 1.4 自动装配
[自动装配](./doc/Part2.md)
### 1.5 继承和依赖
[继承和依赖](./doc/Part3.md)
### 1.6 外部属性(连接mysql)
[外部属性](./doc/Part3.md)
### 1.7 SPEL





