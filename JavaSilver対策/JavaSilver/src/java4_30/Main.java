package java4_30;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		A[] array = {new A(), new B(), new A(), new B()};
		for(A a : array) {
			if(a instanceof B b) {//左側は検証したい値、右側は型名なので、A型のものB型で扱えるか確認してOKなら
				b.test();
			}else {
				a.test();
			}
		}

	}

}
