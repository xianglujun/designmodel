# 代理模式

代理模式又被称作委托模式, 主要涉及有三个角色:

Subject:

该角色就是一个普通的业务逻辑的主题，主要定义了基本的操作

RealSubject:

是对Subject的功能的实现, 是Subject的实现类，该角色也是被委托角色

Proxy:

是委托角色，是对RealSubject的功能的委托，以及对RealSubject相关功能实现后的善后工作。

