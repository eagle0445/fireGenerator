package fire;

import java.lang.reflect.Field;

import org.junit.Test;

public class Formater {

	/**
	 * 返回类型的简短的名称 比如 java.lang.Integer 返回 Integer
	 * @param field
	 * @return
	 */
	public static String shortTypeName(Field field){
		if(null==field){
			return "";
		}
		return field.getType().getName().substring(field.getType().getName().lastIndexOf(".")+1);
	}
	
	@Test
	public void testShortTypeName() throws SecurityException, NoSuchFieldException{
		Field field = this.getClass().getDeclaredField("testField");
		
		String s = shortTypeName(field);
		System.out.println(s);
	}
	
	//用于测试的字段
	String testField;
	
}
