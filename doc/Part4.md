## SPEL
SpEL（Spring Expression Language），即Spring表达式语言，是比JSP的EL更强大的一种表达式语言。为什么要总结SpEL，因为它可以在运行时查询和操作数据，尤其是数组列表型数据，因此可以缩减代码量，优化代码结构。

```xml
<property name="tyrePerimeter" value="#{T(java.lang.Math).PI * 80}"/>
```
与java本身语法类似。可以直接使用java的包。

