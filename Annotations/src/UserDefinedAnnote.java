import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.*;

public class UserDefinedAnnote {

	public static void main(String[] args)throws Exception {
	Hai h= new Hai();	
	Class cls=Hai.class;
	Method[] m=cls.getDeclaredMethods();
for(int i=0;i<m.length;i++) {
	Method m1=m[i];
	boolean b=m1.isAnnotationPresent(overrride.class);
	if(b) {
		overrride o=(overrride)m1.getAnnotation(overrride.class);
		System.out.println("method"+m1+"is overriden"+o);
	}else {
		throw new Exception("not overrided");
	}
}
	}

public int sum1(int x,int y) {
	int add=0;
	add = x+y;
	return add;

}
public int mul(int a,int b) {
	int multi=0;
	multi=a*b;
	return multi;
}

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@interface overrride{
	String name();
	//int value();

}


class Hai{
@overrride(name = "sum1")	
public int sum1(int m,int n) {
	int sub=0;
	sub =m-n; 
	return sub;
}
@overrride(name="mul")
public int mul(int a,int b) {
	int fa=0;
	if(fa==0) {
		return 1;
	}
	fa=a*b;
	a=b;b=b+1;
	return fa;
}
}