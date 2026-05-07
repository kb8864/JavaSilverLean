/**
 * ラッパークラス利用サンプル
 * @author M.Takahashi
 */
public class WrapperDriver {

	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {

		// プリミティブ型⇒ラッパーオブジェクト変換
		Integer iObj1 = Integer.valueOf(10);		// valueOf()メソッド使用
		Integer iObj2 = 20;						// オートボクシング
		
		System.out.println("\n iObj1=" + iObj1);
		System.out.println("\n iObj1=" + iObj1.toString());

		System.out.println("\n iObj2=" + iObj2);

		// ラッパーオブジェクト⇒プリミティブ型変換
		int i1 = iObj1.intValue();				// intValue()
		int i2 = iObj2;							// アンボクシング

		System.out.println("\n i1=" + i1);
		System.out.println("\n i2=" + i2);

		// メソッド・フィールド
		int i3 = Integer.parseInt("30");
		System.out.println("\n i3=" + i3);

		int i4 = Integer.max(40, 50);
		System.out.println("\n i4=" + i4);

		System.out.println("\n int型の最大値=" + Integer.MAX_VALUE);
	}

}
