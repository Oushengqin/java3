package xuanke;

public class Course {
	String serialnumber,String,coursetitle;String classtime;String tutor;
	Course(){
	 }
	Course(int number,String coursetitle,String classtime,String serialnumber ){
	  this.serialnumber = serialnumber;
	  this.coursetitle= coursetitle;
	  
	  this.tutor = tutor;
	  System.out.println("课程名称是："+coursetitle+"编号是："+serialnumber+"导师是:"+tutor);
	 }
}

