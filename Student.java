package xuanke;

public class Student extends Personal {
	String theselectedcourse;
	 Student(){
	 }
	 Student(int number,String name,String sexual,String theselectedcourse,String serialnumber ){
	
	  this.theselectedcourse = theselectedcourse;
	  
	  System.out.println("�ҵ������ǣ�"+name+ "ѧ���ǣ�"+number+"�γ���: "+theselectedcourse+"����ǣ�+serialnumber");
	 }
}
	class UniverStudent extends Student{
		boolean ѡ�η�;
	    UniverStudent(int number,String name,String sexual,String theselectedcourse,String serialnumber,boolean a){
	 super(number,name,sexual,theselectedcourse,serialnumber);
	 ѡ�η� = a;
	 System.out.println("ѡ��="+ѡ�η�);
		}
	    public String toString() {
			return "��ţ�"+number+"  ������"+name+"  �Ա�"+sexual+"  ��ѡ�γ̣�"+theselectedcourse+"  ��ѡ��ţ�"+serialnumber;
		}

	public static void main(String ards[]) {
		UniverStudent li = new UniverStudent(1,"ŷ����","Ů","��ѧ","11459",true);
		System.out.println(li);
	}
}