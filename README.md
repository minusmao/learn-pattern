# learn-pattern
学习设计模式
菜鸟教程：https://www.runoob.com/design-pattern/design-pattern-tutorial.html
廖雪峰教程：https://www.liaoxuefeng.com/wiki/1252599548343744/1264742167474528
进击的java菜鸟：https://fhfirehuo.github.io/Attacking-Java-Rookie/Chapter04/designPatterns.html

补充：[UML图教程](https://cloud.tencent.com/developer/article/1684161)

### 设计模式六大原则

#### 1、开闭原则（Open Close Principle）

>对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。

#### 2、里氏代换原则（Liskov Substitution Principle）

>任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

#### 3、依赖倒转原则（Dependence Inversion Principle）

>这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

#### 4、接口隔离原则（Interface Segregation Principle）

>使用多个隔离的接口，比使用单个接口要好（一个接口的方法较多时，全部实现比较麻烦）。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

#### 5、迪米特法则（最少知道原则）（Demeter Principle）

>一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。即一个类对自己依赖的类知道的越少越好。无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。

#### 6、合成复用原则（Composite Reuse Principle）

>尽量使用合成、聚合的方式，而不是使用继承。
