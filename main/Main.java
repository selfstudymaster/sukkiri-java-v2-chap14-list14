package main;

// chap14
// list14-01 long型の数値
//public class Main {
//	public static void main(String[] args) {
//		// currentTimeMillis()メソッドで現在日時をlong型で取得できる(単位はミリ秒)
//		long start = System.currentTimeMillis();
//		// ここに何らかの時間がかかる処理をおこなう
//		long end = System.currentTimeMillis();
//		System.out.println("処理にかかった時間は..." + (end - start) + "ミリ秒です");
//	}
//}

// list14-02 Date型のインスタンス
//import java.util.Date;
//public class Main {
//	public static void main(String[] args) {
//		Date now = new Date(); // 現在時刻をDate型で取得
//		System.out.println(now); // 実行結果: Mon Mar 29 12:14:29 JST 2021
//		System.out.println( now.getTime() ); // 実行結果: 1616987669076
//		// 上記では、getTime()メソッドで、Dateインスタンスnowの内部に格納されているlong値を取り出している
//		Date past = new Date(1316622225935L); // 指定時点の日時を持つDateインスタンスを取得(この場合はlong値で指定)
//		System.out.println(past); // 実行結果: Thu Sep 22 01:23:45 JST 2011
//	}
//}

/* long型の数値もDate型インスタンスも、内部的にはlong型の値(エポックからの経過ミリ秒数)であることは変わらない*/
/* エポックとは、基準日時である 1970年1月1日0時0分0秒のこと */

// list14-03 Calendatクラスの利用
//import java.util.Calendar;
//import java.util.Date;
//
//public class Main {
//	public static void main(String[] args) {
//		// 現在の年を表示する
//		Date now = new Date();
//
//		Calendar c = Calendar.getInstance(); // インスタンスを生成
//		c.setTime(now); // インスタンスにsetTime(now)メソッドを用いて現在時刻を代入
//		int y = c.get(Calendar.YEAR); // get()メソッドを用いて変数に値を代入
//		System.out.println(y); // 実行結果(実行した日時の年によって数値は異なる): 2021
//
//		// 指定した日のDate型の値を得る
//		c.set(2010, 8, 22, 1, 23, 45); // 年,月,日,時,分,秒 を指定(月の指定は-1で行う点に注意)
//		c.set(Calendar.YEAR,  2011); // 年を2011に変更
//		Date past = c.getTime(); // set()メソッドで指定した値をgetTime()メソッドで代入
//		System.out.println(past); // 実行結果: Thu Sep 22 01:23:45 JST 2011
//	}
//}

// Dateインスタンスからint型を生成する
// Calendar c = Calendar.getIntance();
// c.setTime(d); // dはDate型変数
// int year = c.get(Calender.YEAR);
// int month = c.get(Calendar.MONTH);
// int day = c.get(Calendar.DAY_OF_MONTH);
// int hour = c.get(Calendar.HOUR);
// int minute = c.get(Calendar.MINUTE);
// int second = c.get(Calendar.SECOND);

// list14-04
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//		// 本日の日時を表示する
//		Date now = new Date();
//
//		// Date型からStringを生成する
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		String s = f.format(now); // nowはDate型変数(インスタンス)
//		System.out.println(s); // 表示結果: 2021/03/29 13:16:40
//
//		// 指定日時の文字列を解析し、Date型として得る
//		Date d = f.parse("2021/03/29 13:16:40");
//		System.out.println(d); // 表示結果: Mon Mar 29 13:16:40 JST 2021
//	}
//}

// list14-05
//import empty.Empty;
//
//public class Main {
//	public static void main(String[] args) {
//		Empty e = new Empty(); // Emptyクラスはメソッドもフィールドも定義されていない空のクラス
//		String s = e.toString(); // toString()メソッドを呼び出す
//		// 暗黙の継承:あるクラスを定義するとき、extendsで親クラスを指定しなければ、java.lang.Objectを親クラスとして継承したと見なされる
//		System.out.println(s); // 実行結果: empty.Empty@626b2d4a
//	}
//}

//list14-06
//import hero.Hero;
//
//public class Main {
//	public static void main(String[] args) {
//		/* 暗黙の継承:あるクラスを定義するとき、extendsで親クラスを指定しなければ、
//		   java.lang.Objectを親クラスとして継承したと見なされる */
//
//		// Object型の変数にはどんなインスタンスも代入できる
//		Object o1 = new Empty();
//		Object o2 = new Hero();
//		Object o3 = "こんにちは";
//
//		System.out.println(o1); // 実行結果: empty.Empty@5e91993f
//		System.out.println(o2); // 実行結果: hero.Hero@156643d4
//		System.out.println(o3); // 実行結果: こんにちは
//	}
//}

//list14-07
//import java.util.Date;
//
//public class Main {
//	public static void printAnything(Object o) {
//		// 何型でもいいから、引数を1つ受け取り画面に表示
//		System.out.println(o.toString());
//	}
//	public static void main(String[] args) {
//		Date d = new Date();
//		new Main().printAnything(d);
//	}
//	// 実行結果(実行日時が出力される): Mon Mar 29 14:09:23 JST 2021
//}

// list14-08
//public class Main {
//	public static void main(String[] args) {
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println(h.toString()); // 実行結果: hero.Hero@626b2d4a
//		System.out.println(h); // 実行結果: hero.Hero@626b2d4a
//		/* HeroクラスにはtoString()メソッドが宣言されていないため、137,138行目で呼び出され動作しているのは
//		 * Objectクラスに宣言され、Heroクラスに継承されてきたtoString()メソッドです。
//		 * 実際、Objectクラスに定義されているtoString()メソッドは「型名@英数字」という形式で
//		 * 情報を表示する処理内容となっている。 */
//	}
//}

//list14-09
//public class Main {
//	public static void main(String[] args) {
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println(h.toString()); // 実行結果: 名前:ミナト/HP:100
//		System.out.println(h); // 実行結果: 名前:ミナト/HP:100
//		/* ObjectクラスのtoString()メソッドをHeroクラスでオーバーライドしたため、実行結果に反映される */
//	}
//}

//list14-10 Objectクラスで定義されているequals()メソッド
// 2つのインスタンスが「同じ内容であるか」を判定する
//public class Main {
//	public static void main(String[] args) {
//
//		Hero h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;
//
//		Hero h2 = new Hero();
//		h2.name = "ミナト";
//		h2.hp = 100;
//
//		// equals()メソッドでh1とh2が同じ内容か判定
//		if (h1.equals(h2) == true) {
//			System.out.println("同じ内容です");
//		} else {
//			System.out.println("違う内容です");
//		}
//		// 実行結果: 違う内容です
		/* Objectクラスのequals()メソッドの判定によってfalseと判定される */
//	}
//}

/* 等値判定 if(h1 == h2) と等価判定 if(h1.equals(h2) == true) の違い
 * 等値判定:指しているものが「完全に同一の存在」であること。つまり同じアドレスをさしていること。
 * Hero h1 = new Hero("ミナト"); Hero h2 = h1; h1とh2は同じアドレスを参照しているため、h1 == h2である。
 * 等価判定:指している2つのものが「同じ内容」であること。同じアドレスを指していなくてもよい。
 * Hero h1 = new Hero("ミナト"); Hero h2 = new Hero("ミナト"); h1のアドレスとh2のアドレスは異なるが、指している内ものは完全に同一なため、h1.equals(h2) == true である
 * equalsで「何を持って完全に同一と見なすか」を指定してあげないといけない。
 * */

/* Objectクラスから継承されるequals()メソッドの処理内容はおおむね以下のようになっている
 *
 * public boolean equals (Object o) {
 *     if(this == o) {
 *         return true;
 *     } else {
 *         return false;
 *     }
 * }
 *
 *  */

//list14-11 Objectクラスで定義されているequals()メソッドをHeroクラスでオーバーライドした場合
//2つのインスタンスが「同じ内容であるか」を判定する
//public class Main {
//	public static void main(String[] args) {
//
//		Hero h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;
//
//		Hero h2 = new Hero();
//		h2.name = "ミナト";
//		h2.hp = 100;
//
//		// equals()メソッドでh1とh2が同じ内容か判定
//		if (h1.equals(h2) == true) {
//			System.out.println("同じ内容です");
//		} else {
//			System.out.println("違う内容です");
//		}
//		// 実行結果: 同じ内容です
//		/* Objectクラスのequals()メソッドを、Heroクラス内でequals()メソッドをオーバーライド(再定義)した結果、trueと判定される */
//	}
//}

//list14-12
// 基本データ型に対応したラッパークラス(Java API)
//public class Main {
//	public static void main(String[] args) {
//		int i1 = 15;
//		// int を Integer に変換
//		Integer i2 = Integer.valueOf(i1);
//		// Integer を int に変換
//		int i3 = i2.intValue();
//
//		System.out.println(i1); // 実行結果: 15
//		System.out.println(i2); // 実行結果: 15
//		System.out.println(i3); // 実行結果: 15
//	}
//}

public class Main {
	public static void main(String[] args) {
		int i1 = 15;
		Integer i2 = i1; // int型をInteger型に自動変換
		int i3 = i2; // Integer型をint型に自動変換

		System.out.println(i1); // 実行結果: 15
		System.out.println(i2); // 実行結果: 15
		System.out.println(i3); // 実行結果: 15
	}
}

// 雛形
// list14-
//public class Main {
//	public static void main(String[] args) {
//
//	}
//}

/*============================================================================
 ==============================以下は一周目の時のコード===========================
 ============================================================================*/
// package main;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

//public class Main {
//	public static void main(String[] args) {
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println(h.toString()); // 表示結果:hero.Hero@626b2d4a
//		// HeroクラスでtoStringメソッドを定義(オーバーライド)していないため
//
//	}
//}

// list14-09
//public class Main {
//	public static void main(String[] args) {
//		Hero h = new Hero();
//		h.name = "ミナト";
//		h.hp = 100;
//		System.out.println(h); // HeroクラスでtoString()メソッドをオーバーライドした通りに表示される
//	}
//}

// list14-10 等値と等価の違い
//public class Main {
//	public static void main(String[] args) {
//		// 1人目の勇者
//		Hero h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;
//
//		// 2人目の勇者 1人目の勇者と同じ内容
//		Hero h2 = new Hero();
//		h2.name = "ミナト";
//		h2.hp = 100;
//
//		if (h1.equals(h2) == true) {
//			System.out.println("同じ内容です");
//		} else {
//			System.out.println("違う内容です");
//		}
//		// 表示結果:違う内容です // 等値(==)とみなされるが等価(equals)とはみなされない
//	}
//}
// Objectクラスから継承されるequals()メソッドの処理内容はおおむね以下の通り
//public boolean equals(Object) {
//	if (this == o) {
//		return true; // 等値(==)ならtrueを返す
//	} else {
//		return false;
//	}
//}

//list14-11 等価とみなされるようにHeroクラスのequalsメソッドをオーバーライドする
//public class Main {
//	public static void main(String[] args) {
//		// 1人目の勇者
//		Hero h1 = new Hero();
//		h1.name = "ミナト";
//		h1.hp = 100;
//
//		// 2人目の勇者 1人目の勇者と同じ内容
//		Hero h2 = new Hero();
//		h2.name = "ミナト";
//		h2.hp = 100;
//
//		if (h1.equals(h2) == true) {
//			System.out.println("同じ内容です");
//		} else {
//			System.out.println("違う内容です");
//		}
//		// 表示結果:同じ内容です
//	}
//}

// list14-12 基本データ型とラッパークラスの型変換
// Javaには基本データ型を利用できないAPIがいくつか存在し、それらのAPIを利用する際に型変換する必要がある
//public class Main {
//	public static void main(String[] args) {
//		int i1 = 15; // int型のi1に15が代入される
//		// 基本データ型(int型)の変数i1の内容を、ラッパークラス型Integerの変数i2に変換
//		Integer i2 = Integer.valueOf(i1); // Integer型のインスタンス内のフィールドにvalue;15が代入される
//		System.out.println(i2); // 表示結果: 15
//
//		// Integer型をint型に変換
//		int i3 = i2.intValue();
//		System.out.println(i3); // 表示結果: 15
//	}
//}

// list14-13 暗黙的に基本データ型とラッパークラスを相互変換してくれる
//public class Main {
//	public static void main(String[] args) {
//		int i1 = 15; // int型のi1に15が代入される
//
//		// int型をInteger型に自動変換
//		Integer i2 = i1;
//		System.out.println(i2); // 表示結果: 15
//
//		// Integer型をint型に自動変換
//		int i3 = i2;
//		System.out.println(i3); // 表示結果: 15
//	}
//}

// practice14-01
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

//public class Main {
//	public static void main(String[] args) {
//
//		Date now = new Date(); // 1
//		Calendar c = Calendar.getInstance(); // 2
//		c.setTime(now); // 2
//		int day = c.get(Calendar.DAY_OF_MONTH); // 3
//		day += 100; // 4
//		c.set(Calendar.DAY_OF_MONTH, day); // 4
//		Date future = c.getTime(); // 5
//		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日"); // 6
//		System.out.println(future);
//	}
//}