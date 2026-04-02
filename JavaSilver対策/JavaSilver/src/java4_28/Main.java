package java4_28;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample s = new Sample(10);
		modifly(s.num);
		System.out.println(s.num);

	}
	private static void modifly(int num) {
		num += 2;
	}

}
