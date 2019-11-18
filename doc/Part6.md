## 工厂方法配置bean
### 静态工厂方法
* 建立静态工厂类
* 使用factory-method，并用构造器参数得到对象

### 实例工厂方法
* 建立实例工厂类
* 使用factory-bean建立工厂bean
* 使用其他bean调用工厂bean

### 使用Spring FactoryBean接口
需要实现：
```java
public class CarFactoryBean implements FactoryBean<Car> {


    @Override
    public Car getObject() throws Exception {
        return new Car("BMW", 4000000);
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
```