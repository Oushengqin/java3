package xuanke;

public class Teacher extends Personal{
	String theselectedcourse;
	Teacher(){
	 }
	Teacher(int number,String name,String sexual,String theselectedcourse,String serialnumber ){
	  
	  this.theselectedcourse = theselectedcourse;
	 
	  System.out.println("�ҵ������ǣ�"+name+ "ѧ�����ǣ�"+number+"�γ���: "+theselectedcourse+"����ǣ�+serialnumber");
	 }
	public String toString() {
		return "��ţ�"+number+"  ������"+name+"  �Ա�"+sexual+"  ��ѡ�γ̣�"+theselectedcourse+"  ��ѡ��ţ�"+serialnumber;
	}
}
