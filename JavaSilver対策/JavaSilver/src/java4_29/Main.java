package java4_29;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample s = new Sample(10);//ヒープ領域でSample インスタンス（実体）が生成されます。sは同じオブジェクトの住所を指している
		modifly(s);//sはヒープ領域にある全く同じインスタンスを指している
		System.out.println(s.num);
	}
	private static void modifly(Sample s) {
		s.num += 2;//同じオブジェクトの住所なので値は変更される。
	}

	}

