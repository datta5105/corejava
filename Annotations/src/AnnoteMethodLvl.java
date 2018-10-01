import java.lang.reflect.*;
import java.lang.annotation.*;

 class AnnoteMethodLvl {
@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		Class cls=Hello.class;
		Method m[]=cls.getDeclaredMethods();
	for(int i=0;i<m.length;i++) {
		Method m1=m[i];
		
		boolean b=m1.isAnnotationPresent(Override.class);
		if(b) {
			Override o=(Override)m1.getAnnotation(Override.class);
			
System.out.println("method "+m1+"Overriden with "+o);

			
		}else {
			System.out.println("method "+m1+"is not marked with @Override");
		}
	}

	}
	public int Num1(int n,int m) {
		int sum=0;
		sum=m+n;
		return sum;
		
	}
 }
  
 
 
 
class Hello extends AnnoteMethodLvl{

@Override
	public int Num1(int x,int y) {
	int sub=0;
	sub=x-y;
	return sub;
	}
}