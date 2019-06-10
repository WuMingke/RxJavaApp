# RxJavaApp
重新系统学习RxJava

Rxjava常用操作符：
* 创建
* 变换
* 过滤
* 条件
* 布尔
* 合并

创建操作符
1.just()：将一个或多个对象转换成发射这个或这些对象的一个Observable
2.fromXXX()：将一个Iterable、一个Future或者一个数组转换成一个Observable，逐个发射
3.create()：使用一个函数从头创建一个Observable
4.defer()：只有当前订阅者订阅才创建Observable，为每个订阅创建一个新的Observable
5.range()：创建一个发射指定范围的整数序列的Observable
6.interval()：创建一个按照给定的时间间隔发射整数序列的Observable
7.timer()：创建一个在给定的延时之后发射单个数据的Observable
8.empty()：创建一个什么都不做直接通知完成的Observable
9.error()：创建一个什么都不做直接通知错误的Observable
10.never()：创建一个不发射任何数据的Observable
11.repeat()：创建一个发射特定数据重复多次的Observable
* 11(a)：repeatWhen
* 11(b)：repeatUtil
