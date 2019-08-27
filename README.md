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