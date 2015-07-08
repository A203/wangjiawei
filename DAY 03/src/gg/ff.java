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
		System.out.println("大家好，告诉大家一个秘密，我喜欢冷强。");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ff li=new ff("李映鲲", "女", 1);
		System.out.println("姓名："+li.name);
		System.out.println("性别："+li.sex);
		System.out.println("长度："+li.lg+"cm");
		li.introduce();
	}

}
