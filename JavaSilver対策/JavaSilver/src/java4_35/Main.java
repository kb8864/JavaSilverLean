package java4_35;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 User user = new User("hoge","sample");
		 //ゲッターはすでに暗黙的に提示されているので、
		 //フィールドと同じメソッドで出力が可能
		 System.out.println(user.id());
		 System.out.println(user.name());
	
	}

}
