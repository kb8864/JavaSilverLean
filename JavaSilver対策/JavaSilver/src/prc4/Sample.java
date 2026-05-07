package prc4;
public class Sample {
    // A. インスタンス初期化ブロック
    { System.out.println("A: 普通のブロック"); }

    // B. コンストラクタ
    public Sample() { System.out.println("B: コンストラクタ"); }

    // C. static初期化ブロック
    static { System.out.println("C: staticブロック1"); }

    // D. static変数（宣言と同時に代入）
    static String name = printName();

    // E. staticメソッド（Dの変数に入れるための裏方）
    static String printName() {
        System.out.println("D: static変数の代入");
        return "テスト";
    }

    // F. もう一つのstatic初期化ブロック
    static { System.out.println("F: staticブロック2"); }
}

