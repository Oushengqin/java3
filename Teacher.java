package xuanke;

public class Teacher extends Personal{
	String theselectedcourse;
	Teacher(){
	 }
	Teacher(int number,String name,String sexual,String theselectedcourse,String serialnumber ){
	  
	  this.theselectedcourse = theselectedcourse;
	 
	  System.out.println("我的名字是："+name+ "学工号是："+number+"课程是: "+theselectedcourse+"编号是：+serialnumber");
	 }
	public String toString() {
		return "编号："+number+"  姓名："+name+"  性别："+sexual+"  所选课程："+theselectedcourse+"  所选编号："+serialnumber;
	}
}
