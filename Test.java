package xuanke;

public class Test {
	public static void main(String ards[]) {
		Teacher t1 = new Teacher(1,"hei老师", "男", "高等数学","01");
		Teacher t2 = new Teacher(2, "bao老师", "女","大学英语读写译","02");
		Course aa1 = new Course(3,"高等数学","14:00~15:00","101");
		Course bb2 = new Course(4,"大学英语","14:00~15:00","102");
		Student li = new Student(1,"欧","女","数学","11459");
		System.out.println("选课信息：");
		System.out.println(aa1);System.out.println(t1);
		System.out.println(bb2);System.out.println(t2);
		
		System.out.println(li);
	}

}
