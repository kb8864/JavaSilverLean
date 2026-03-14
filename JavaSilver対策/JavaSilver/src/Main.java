public class Main {

	public static void main(String[] args) {
		Object object = null;
		test(object);
	}
	private static void test(Object obj) {
		System.out.println(obj.hashCode());
	
	}
}
