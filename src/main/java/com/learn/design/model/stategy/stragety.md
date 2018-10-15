# 策略模式
## 定义
策略模式(Strategy Pattern)是这一种比较简单的模式, 也叫做政策模式（Policy Pattern）, 其定义如下:
> Define a family of algorithms, encapsulate each one, and make them interchangeable.(定义一组算法, 将每个算法都封装起来, 并且使他们之间可以互换)

这个定义非常明确的，清晰的，`定义一组算法`, 看看我们的三个计谋是不是三个算法?`将每个算法都封装起来`, 封装类不就是这个作用吗?`使它们可以互换`当然可以互换了，都是是相同的接口，那当然可以相互转化了。
```
graph BT
Context --> Strategy
ConcreteStrategy --> Strategy
```

策略模式使用的就是面向对象的继承和多台机制, 非常容易理解和掌握，我们来看一下策略模式的三个角色:
- Context封装角色
> 它也叫做上下文角色，起承上启下封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在变化
- Strategy 抽象策略角色
> 策略, 算法家族的抽象, 通常为接口，定义每个策略或算法必须具有的方法和属性。
- ConcreteStrategy具体策略角色
> 实现抽象策略中的操作, 该类包含有具体的算法

以下为策略模式的通用文档:

**抽象的策略角色**
```java
public interface Strategy {
    // 策略模式的运算法则
    public void doSomething();
}
```

具体策略也是一个非常普通的一个实现类, 只要实现接口中的方法就可以, 如下:
**具体策略角色**
```java
public class ConcreteStrategy1 implements Strategy {
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}

public class ConcreteStrategy2 implements Strategy {
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
```
策略模式的重点就是封装角色, 他是借用了代理模式的思路, 它和代理模式的差别, 差别就是策略模式的封装角色和被封装的策略类不是同一个接口，如果是同一个接口那就成为了代理类。

**封装角色**
```java
public class Context {
    // 抽象策略
    private Strategy strategy = null;
    
    // 构造函数设置具体策略
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }
    
    // 封装后的策略
    public void doAnything() {
        this.strategy.doSomething();
    }
}
```

高层模块的调用非常简单, 知道要用哪个策略, 产生出它的对象, 然后放到封装角色中就完成任务了.

**高层模块**
```java
public class Client {
    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        
        // 声明上下文
        Context context = new Context(strategy);
        
        // 执行封装后的方法
        context.doAnything();
    }
}
```

简单策略模式就是在和么简单, 它就是采用了面向对象的继承和多态机制, 其他没有设么玄机. 一个类实现多个接口很正常, 你要火眼金睛看清楚哪个接口是抽象策略接口, 哪些是和策略模式没有任何关系，这就是作为系统分析师的价值所在.

## 策略模式的应用
### 优点
1. 算法可以自由切换
> 这是策略模式本身定义的, 只要实现抽象策略, 它就成为策略家族的一个成员, 通过封装角色对其进行封装, 保证对外提供"可以自由切换"的策略.
2. 避免使用多重条件判断
> 如果没有策略模式, 一个策略家族有5个策略算法, 一会要使用A策略, 一会儿要使用B策略, 如何设计?使用多重的条件判断判断?多重添加语句不易维护, 而且出错的概率大大增强. 使用策略模式后, 可以由其他模块决定采用何种策略, 策略家族对wait提供的访问接口就是封装类, 简化了操作, 同事避免了条件语句判断。
3. 扩展性良好
> 这甚至都不用说是它的有点，因为它太明显了。在现有的系统中，增加一个策略太容器了, 只要实现了接口就可以了，其他的不用修改.类似于一个可反复拆卸的查件，这大大地复核了OCP原则。

### 策略模式的缺点
1. 策略类数量增多
> 每一个策略都是一个类, 复用的可能性很小, 类数量增多.
2. 所有的策略类都需要对外暴露
> 上层模块必须知道有哪些策略, 然后才能决定使用哪一个策略, 这与迪米特法则是相违背的，我只是想使用了一个策略，我为什么需要了解这个策略呢？那要你的封装类还有什么意义呢?这是原装策略模式的一个缺点, 幸运的是, 我们可以使用其他模式来修正这个缺陷, 如工厂方法模式, 代理模式或享元模式。

### 策略模式的使用场景
- 多个类只有在算法或行为上稍有不同的场景
- 算法需要自由切换的场景
> 例如, 算法的选择是由使用者决定的，或者算法始终在进化，特别是一些站在技术前沿的行业，连业务专家都无法给你保证这样的系统规则能够存在多长时间, 在这种情况下, 策略模式是最好的助手
- 需要屏蔽算法规则的场景

现在科技发展的很快,人脑的记忆是有限的, 太多的算法你只要知道一个名字就可以了，传递相关的数字进来, 反馈一个运算结果, 万事大吉.

### 策略模式的注意事项
如果系统的一个策略家族的具体策略数量超过4个, 则需要考虑使用混合模式, 解决策略类膨胀和对外暴露的问题, 否则日后的系统维护就会成为一个烫手的山芋.

## 策略模式的扩展
> 先给出一道小学的题目: 输入3个参数, 进行加减法运算，参数中两个是int型的, 剩下的一个参数是String型的, 只有"+","-"两个可以选择，不要考虑什么复杂的校验，我们做的是白箱测试, 输入的就是标准的int类型和合规的String类型.

#### 注意
策略枚举类是一个非常优秀和方便的模式， 但是它受枚举类型的限制, 每个枚举项都是public, final , static的，扩展性收到了一定的约束, 因此在系统开发中, 策略枚举一般担当不经常发生变化的角色。

## 最佳实践
策略模式是一个非常简单的模式, 它在项目中使用得非常多, 但它单独使用得地方就比较少了, 因为它由致命缺陷: 所有的策略都需要暴露出去, 这样才方便客户端使用哪一个策略。例如, 在例子中的赵云, 赵云实际上不知道使用哪个策略, 但他知道拆第一个锦囊，而不知道是BackDook这个妙计。是的，诸葛亮已经在规定了在适当的场景下拆开指定的锦囊，我们的策略模式只是实现了锦囊的管理。但是我们没有严格地定义"适当的场景"拆开"适当的锦囊"，在实际项目中我们一般通过工厂方法模式来实现策略类的声明，读者可以参考混编模式。