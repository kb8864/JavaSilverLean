package java4_17;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main m = new Main();
//		ここでコンパイルエラーとなる。
		System.out.println(m.calc(2,3));//どっちも暗黙の型変換可能なのでどっちからも呼び出せるので、JVMはどっちを呼び出せばいいかわからない。
	}
	private double calc(double a, int b) {
		return (a + b) / 2 ;
	}
	private double calc(int a, double b) {
		return (a + b ) / 2;
	}

}
