package Reflections;

public class Lab208 {

	public static void main(String[] args) throws ClassNotFoundException {
	System.out.println("main Started");
	Class c1=int.class;
	Class c2=long.class;
	Class c3=String.class;
	Class c4=com.lavi.p1.Hello.class;
	Class c5=coreJava.InterFaceObject.class;
	Class c6=coreJava.If.class;
	getInfo(c1);
	getInfo(c2);
	getInfo(c3);
	getInfo(c4);
	getInfo(c5);
	getInfo(c6);
	System.out.println("main ended");
	}
	public static void getInfo(Class cls) {
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass());
		System.out.println(cls.isInterface());
	}

	}


