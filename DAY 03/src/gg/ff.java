package gg;

public class ff {
	String name;
	String sex;
	int lg;
	ff(String n,String s,int h){
		name=n;
		sex=s;
		lg=h;
	}
	void introduce(){
		System.out.println("��Һã����ߴ��һ�����ܣ���ϲ����ǿ��");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ff li=new ff("��ӳ��", "Ů", 1);
		System.out.println("������"+li.name);
		System.out.println("�Ա�"+li.sex);
		System.out.println("���ȣ�"+li.lg+"cm");
		li.introduce();
	}

}
