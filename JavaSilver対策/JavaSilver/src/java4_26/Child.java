package java4_26;

import ex26.Parent;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.num);//Parentにアクセスはできるが、そのさきのメソッドはデフォルトのため、パッケージを跨いで使用することはできない
	}

}
