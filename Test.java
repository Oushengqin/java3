package xuanke;

public class Test {
	public static void main(String ards[]) {
		Teacher t1 = new Teacher(1,"hei��ʦ", "��", "�ߵ���ѧ","01");
		Teacher t2 = new Teacher(2, "bao��ʦ", "Ů","��ѧӢ���д��","02");
		Course aa1 = new Course(3,"�ߵ���ѧ","14:00~15:00","101");
		Course bb2 = new Course(4,"��ѧӢ��","14:00~15:00","102");
		Student li = new Student(1,"ŷ","Ů","��ѧ","11459");
		System.out.println("ѡ����Ϣ��");
		System.out.println(aa1);System.out.println(t1);
		System.out.println(bb2);System.out.println(t2);
		
		System.out.println(li);
	}

}
