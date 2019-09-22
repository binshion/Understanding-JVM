/**
 * 首先切换到class文件目录E:\JavaProject\bin>
 * 再使用命令 javap -verbose Understanding_JVM.TestClass
 */
public class TestClass {
    private int m;

    public int inc() {
        return m + 1;
    }
}

/**
 警告: 二进制文件Understanding_JVM.TestClass包含TestClass
 Classfile /E:/JavaProject/bin/Understanding_JVM/TestClass.class
 Last modified 2019-9-22; size 471 bytes
 MD5 checksum c7e97ddb9592a16908a3a99ec6a2d989
 Compiled from "TestClass.java"
 public class TestClass
 minor version: 0
 major version: 52
 flags: ACC_PUBLIC, ACC_SUPER
 Constant pool:
 #1 = Methodref          #4.#22         // java/lang/Object."<init>":()V
 #2 = Fieldref           #3.#23         // TestClass.m:I
 #3 = Class              #24            // TestClass
 #4 = Class              #25            // java/lang/Object
 #5 = Utf8               m
 #6 = Utf8               I
 #7 = Utf8               <init>
 #8 = Utf8               ()V
 #9 = Utf8               Code
 #10 = Utf8               LineNumberTable
 #11 = Utf8               LocalVariableTable
 #12 = Utf8               this
 #13 = Utf8               LTestClass;
 #14 = Utf8               inc
 #15 = Utf8               ()I
 #16 = Utf8               main
 #17 = Utf8               ([Ljava/lang/String;)V
 #18 = Utf8               args
 #19 = Utf8               [Ljava/lang/String;
 #20 = Utf8               SourceFile
 #21 = Utf8               TestClass.java
 #22 = NameAndType        #7:#8          // "<init>":()V
 #23 = NameAndType        #5:#6          // m:I
 #24 = Utf8               TestClass
 #25 = Utf8               java/lang/Object
 {
 public TestClass();
 descriptor: ()V
 flags: ACC_PUBLIC
 Code:
 stack=1, locals=1, args_size=1
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 4: return
 LineNumberTable:
 line 1: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       5     0  this   LTestClass;

 public int inc();
 descriptor: ()I
 flags: ACC_PUBLIC
 Code:
 stack=2, locals=1, args_size=1
 0: aload_0
 1: getfield      #2                  // Field m:I
 4: iconst_1
 5: iadd
 6: ireturn
 LineNumberTable:
 line 5: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       7     0  this   LTestClass;

 public static void main(java.lang.String[]);
 descriptor: ([Ljava/lang/String;)V
 flags: ACC_PUBLIC, ACC_STATIC
 Code:
 stack=0, locals=1, args_size=1
 0: return
 LineNumberTable:
 line 10: 0
 LocalVariableTable:
 Start  Length  Slot  Name   Signature
 0       1     0  args   [Ljava/lang/String;
 }
 SourceFile: "TestClass.java"
*/