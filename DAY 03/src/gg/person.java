package gg;

public class person {
	String name;
	int age;
	String address;
	public person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public person(String name,int age,String address){
		this(name, age);//���õ�ǰ��Ĵ����������Ĺ��췽���������������
		this.address=address;
	}
	void hello(){
		System.out.println("hello......");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person li=new person("��ӳ��",21,"Japan");
		li.introduce();
	}

}
