## 自动装配
使用autowire 进行自动装配
###1. byType
当bean中仅含有单个同类bean时，可以使用此方法。
###2. byName
当bean中含有当前bean setter中的id（name）可以使用 **autoWire = byName**
缺点是id不同，不会装配。会装配null
###3. byConstructor
尽量不使用
###4. 自动装配缺点
只能统一自动，使用严谨的配置文档更加好。