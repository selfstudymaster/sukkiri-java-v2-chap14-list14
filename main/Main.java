package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

public class Main {
	public static void main(String[] args) {

		Date now = new Date(); // 1
		Calendar c = Calendar.getInstance(); // 2
		c.setTime(now); // 2
		int day = c.get(Calendar.DAY_OF_MONTH); // 3
		day += 100; // 4
		c.set(Calendar.DAY_OF_MONTH, day); // 4
		Date future = c.getTime(); // 5
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日"); // 6
		System.out.println(future);
	}
}