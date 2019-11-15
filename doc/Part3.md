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
