package gg;

public class student {
	String name;
	String sex;
	int lg;
	void movement(){
		System.out.println("��С˵");
	}
	void sleep(){
		System.out.println("˯��");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student l=new student();
		l.name="��ӳ��";
		l.sex="girl";
		l.lg=1;
		System.out.println("������"+l.name);
		System.out.println("�Ա�"+l.sex);
		System.out.println("���ȣ�"+l.lg+"cm");
		l.movement();
		l.sleep();
	}

}
