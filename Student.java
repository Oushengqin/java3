package xuanke;

public class Student extends Personal {
	String theselectedcourse;
	 Student(){
	 }
	 Student(int number,String name,String sexual,String theselectedcourse,String serialnumber ){
	
	  this.theselectedcourse = theselectedcourse;
	  
	  System.out.println("我的名字是："+name+ "学号是："+number+"课程是: "+theselectedcourse+"编号是：+serialnumber");
	 }
}
	class UniverStudent extends Student{
		boolean 选课否;
	    UniverStudent(int number,String name,String sexual,String theselectedcourse,String serialnumber,boolean a){
	 super(number,name,sexual,theselectedcourse,serialnumber);
	 选课否 = a;
	 System.out.println("选课="+选课否);
		}
	    public String toString() {
			return "编号："+number+"  姓名："+name+"  性别："+sexual+"  所选课程："+theselectedcourse+"  所选编号："+serialnumber;
		}

	public static void main(String ards[]) {
		UniverStudent li = new UniverStudent(1,"欧升琴","女","数学","11459",true);
		System.out.println(li);
	}
}