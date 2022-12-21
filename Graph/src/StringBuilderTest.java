
public class StringBuilderTest {
public static void main(String[] args) {
		String str1 = "jack";
		System.out.println("str1 : " +str1);
		System.out.println("str1 hashcode : "+str1.hashCode());
		str1 = str1 + " dsouza";
		System.out.println("\nNew str1 : " +str1);
		System.out.println("New str1 hashCode : " +str1.hashCode());
		
		System.out.println("===========================================================");

		
		StringBuilder sb = new StringBuilder("Jack");
		System.out.println("sb hashCode : "+ sb.hashCode());		
		System.out.println("sb : " +sb);
		sb.append(" Dsouza");
		System.out.println("\nNew sb : " +sb);
		System.out.println("New sb hashCode : "+ sb.hashCode());
}
}
