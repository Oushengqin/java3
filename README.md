# 计191欧升琴2019311459
## 学生选课模拟系统
## 实验目的

（1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；

（2）掌握面向对象的类设计方法（属性、方法）；

（3）掌握类的继承用法，通过构造方法实例化对象；

（4）学会使用super()，用于实例化子类；

（5）掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 实验要求

（1）编写上述实体类以及测试主类（注意类之间继承关系的适用）

（2）在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

（3）编写实验报告。
## 实验过程

1.先创建父类people类，编写出编号，姓名，性别等信息；

2.创建student类，teacher类作为personal类的子类，运用extends继承父类信息；

3.用super(number,name,sexual)，实例化子类；

4.用this关键字给每一个变量传递它们的值

5.用public String toString()返回该对象的字符串表示，输出信息；
## 核心代码
用extends 继承父类信息,运用super（）实例化子类，用Object根类的toString（）方法,应用在相关对象的信息输出中
```
public class Student extends Personal {
	String theselectedcourse;
	 Student(){
	 }
	 Student(int number,String name,String sexual,String theselectedcourse,String serialnumber ){
	
	  this.theselectedcourse = theselectedcourse;
	  
	  System.out.println("我的名字是："+name+ "学号是："+number+"课程是: "+theselectedcourse+"编号是：+serialnumber");
	 }
}
```
```
public String toString() {
		return "编号："+number+"  姓名："+name+"  性别："+sexual+"  所选课程："+theselectedcourse+"  所选编号："+serialnumber;
	}
```
## 系统运行截图

 ![s]( https://github.com/Oushengqin/java3/blob/main/d3ddec1f1bf869c2111517633e8186a.png)
 
## 实验感想
通过这次实验学生选课系统进行了编程，熟悉了父类与子类的继承方法，学习了多个子类可以继承一个父类，运用extends方法和super（）实例化子类，
和Object根类的toString（）方法, 将相关对象的信息输出
希望在接下来努力学习获取很多的知识。
