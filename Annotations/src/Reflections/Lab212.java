package Reflections;

import java.lang.reflect.Constructor;
import java.text.DateFormat.Field;
import java.lang.reflect.*;
public class Lab212 {


	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class cls=Class.forName("com.lavi.p1.Hello");
Constructor co[]= cls.getDeclaredConstructors();
for(Constructor c:co) {
System.out.println(c);
	}
java.lang.reflect.Field[] f=cls.getDeclaredFields();

}}
