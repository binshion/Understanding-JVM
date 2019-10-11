# Understanding-JVM

# 第一部分 走进Java
## 第1章 走进Java
* 1.1 概述
* 1.2 Java技术体系
* 1.3 Java发展史
* 1.4 Java虚拟机发展史
    * 1.4.1 Sun Classic/Exact VM
    * 1.4.2 Sun HotSpot VM
    * 1.4.3 Sun Mobile-Embedded VM/Meta-Circular VM
    * 1.4.4 BEA JRockit/IBM J9 VM
    * 1.4.5 Azul VM/BEA Liquid VM
    * 1.4.6 Apache Harmony/Google Android Dalvik VM
    * 1.4.7 Microsoft JVM及其他
* 1.5 展望Java技术的未来
    * 1.5.1 模块化
    * 1.5.2 混合语音
    * 1.5.3 多核并行
    * 1.5.4 进一步丰富语法
    * 1.5.5 64位虚拟机
* 1.6 实战：自己编译JDK
    * 1.6.1 获取JDK源码
    * 1.6.2 系统需求
    * 1.6.3 构建编译环境
    * 1.6.4 进行编译
    * 1.6.5 在IDE工具中进行源码调试
* 1.7 本章小结

# 第二部分 自动内存管理机制
## 第2章 Java内存区域与内存溢出异常
* 2.1 概述
* 2.2 运行时数据区域
    * 2.2.1 程序计数器
    * 2.2.2 Java虚拟机栈
    * 2.2.3 本地方法栈
    * 2.2.4 Java堆
    * 2.2.5 方法区
    * 2.2.6 运行时常量池
    * 2.2.7 直接内存
* 2.3 HotSpot虚拟机对象探秘
    * 2.3.1 对象的创建
    * 2.3.2 对象的内存布局 
    * 2.3.3 对象的访问定位
* 2.4 实战：OutOfMemoryError异常
    * 2.4.1 Java堆溢出
    * 2.4.2 虚拟机栈和本地方法栈溢出
    * 2.4.3 方法区和运行时常量池溢出
    * 2.4.4 本机直接内存溢出

## 第3章 垃圾收集器与内存分配策略
* 3.1 概述
* 3.2 对象已死吗
    * 3.2.1 引用计数算法
    * 3.2.2 可达性分析算法
    * 3.2.3 再谈引用
    * 3.2.4 生存还是死亡
    * 3.2.5 回收方法区
* 3.3 垃圾收集算法
    * 3.3.1 标记-清除算法
    * 3.3.2 复制算法
    * 3.3.3 标记-整理算法
    * 3.3.4 分代收集算法
* 3.4 HotSpot的算法实现
    * 3.4.1 枚举根节点
    * 3.4.2 安全点
    * 3.4.3 安全区域
* 3.5 垃圾收集器
    * 3.5.1 Serial收集器
    * 3.5.2 ParNew收集器
    * 3.5.3 Parallel Scavenge收集器
    * 3.5.4 Serial Old收集器
    * 3.5.5 Parallel Old收集器
    * 3.5.6 CMS收集器
    * 3.5.7 G1收集器
    * 3.5.8 理解GC日志
    * 3.5.9 垃圾收集器参数总结
* 3.6 内存分配与回收策略
    * 3.6.1 对象优先在Eden分配
    * 3.6.2 大对象直接进入老年代
    * 3.6.3 长期存活的对象将进入老年代
    * 3.6.4 动态对象年龄判定
    * 3.6.5 空间分配担保
* 3.7 本章总结

## 第4章 虚拟机性能监控与故障处理工具
* 4.1 概述
* 4.2 JDK的命令行工具
    * 4.2.1 jps:虚拟机进程状态工具
    * 4.2.2 jstat:虚拟机统计信息监视工具
    * 4.2.3 jinfo:Java配置信息工具
    * 4.2.4 jmap:Java内存映像工具
    * 4.2.5 jhat:虚拟机堆转储快照分析工具
    * 4.2.6 jstack:Java对战跟踪工具
    * 4.2.7 HSDIS:JIT生成代码反汇编
* 4.3 JDK的可视化工具
    * 4.3.1 JConsole:Java监视与管理控制台
    * 4.3.2 VisualVM:多合一故障处理工具
* 4.4 本章总结

## 第5章 调优案例分析与实践
* 5.1 概述
* 5.2 案例分析
    * 5.2.1 高性能硬件上的程序部署策略
    * 5.2.2 集群间同步导致的内存溢出
    * 5.2.3 堆外内存导致的溢出错误
    * 5.2.4 外部命令导致系统缓慢
    * 5.2.5 服务器JVM进程崩溃
    * 5.2.6 不恰当数据结构导致内存占用过大
    * 5.2.7 由Windows虚拟内存导致的长时间停顿
* 5.3 实战：Eclipse运行速度调优
    * 5.3.1 调优前的程序运行状态
    * 5.3.2 升级JDK1.6的性能变化及兼容问题 
    * 5.3.3 编译时间和类加载时间的优化
    * 5.3.4 调整内存设置控制垃圾收集频率
    * 5.3.5 选择收集器降低延迟
* 5.4 本章总结


# 第三部分 虚拟机执行子系统
## 第6章 类文件结构
* 6.1 概述
* 6.2 无关性的基石
* 6.3 Class类文件的结构
    * 6.3.1 魔数与Class文件的版本
    * 6.3.2 常量池 
    * 6.3.3 访问标志
    * 6.3.4 类索引、父类索引与接口索引集合
    * 6.3.5 字段表集合
    * 6.3.6 方法表集合
    * 6.3.7 属性表集合
* 6.4 字节码指令简介
    * 6.4.1 字节码与数据类型
    * 6.4.2 加载和存储指令
    * 6.4.3 运算指令
    * 6.4.4 类型转换指令
    * 6.4.5 对象创建与访问指令
    * 6.4.6 操作数栈管理指令
    * 6.4.7 控制转移指令
    * 6.4.8 方法调用和返回指令
    * 6.4.9 异常处理指令
    * 6.4.10 同步指令
* 6.5 公有设计和私有实现
* 6.6 Class文件结构的发展
* 6.6 本章小结

## 第7章 虚拟机类加载机制
* 7.1 概述
* 7.2 类加载的时机
* 7.3 类加载的过程
    * 7.3.1 加载
    * 7.3.2 验证
    * 7.3.3 准备
    * 7.3.4 解析
    * 7.3.5 初始化
* 7.4 类加载器
    * 7.4.1 类与类加载器
    * 7.4.2 双亲委派模型
    * 7.4.3 破坏双亲委派模型
* 7.5 本章总结

## 第8章 虚拟机字节码执行引擎
* 8.1 概述
* 8.2 运行时帧栈结构
    * 8.2.1 局部变量表
    * 8.2.2 操作数栈
    * 8.2.3 动态连接
    * 8.2.4 方法返回地址
    * 8.2.5 附加信息
* 8.3 方法调用
    * 8.3.1 解析
    * 8.3.2 分派
    * 8.3.3 动态类型语言支持
* 8.4 基于栈的字节码解释执行引擎
    * 8.4.1 解释执行
    * 8.4.2 基于栈的指令集与基于寄存器的指令集
    * 8.4.3 基于栈的解释器执行过程
* 8.5 本章总结

## 第9章 类加载及执行子系统的案例与实战
* 9.1 概述
* 9.2 案例分析
    * 9.2.1 Tomcat：正统的类加载器架构
    * 9.2.2 OSGi：灵活的类加载器结构
    * 9.2.3 字节码生成技术与动态代理的实现
    * 9.2.4 Retrotranslator：跨越JDK版本
* 9.3 实战：自己动手实现远程执行功能
    * 9.3.1 目标
    * 9.3.2 思路
    * 9.3.3 实现
* 9.4 本章小结

# 第四部分 程序编译与现代优化
## 第10章 早期（编译期）优化
* 10.1 概述
* 10.2 Javac编译器
    * 10.2.1 Javac的源码与调试
    * 10.2.2 解析与填充符号表
    * 10.2.3 注解处理器
    * 10.2.4 语义分析与字节码生成
* 10.3 Java语法糖的味道
    * 10.3.1 泛型与类型擦除
    * 10.3.2 自动装箱、拆箱与遍历循环
    * 10.3.3 条件编译
* 10.4 实战：插入式注解处理器
    * 10.4.1 实战目标
    * 10.4.2 代码实现
    * 10.4.3 运行与测试
    * 10.4.4 其他应用案例
* 10.5 本章总结

## 第11章 晚期（运行期）优化
* 11.1 概述
* 11.2 HotSpot虚拟机内的即时编译器
    * 11.2.1 解释器与编译器
    * 11.2.2 编译对象与触发条件
    * 11.2.3 编译过程
    * 11.2.4 查看及分析即时编译结果
* 11.3 编译优化技术
    * 11.3.1 优化技术概览
    * 11.3.2 公共子表达式消除

# 第五部分 高效并发
## 第12章 Java内存模型与线程

## 第13章 线程安全与锁优化

