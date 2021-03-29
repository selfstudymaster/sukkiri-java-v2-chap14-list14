package hero;

// list14-08
//public class Hero {
//	public String name;
//	public int hp;
//}

//list14-09
//public class Hero {
//	public String name;
//	public int hp;
//
//	// ObjectクラスのtoStringメソッドをHeroクラスでオーバーライドする
//	public String toString() {
//		return "名前:" + this.name + "/HP:" + this.hp;
//	}
//}

// list14-10
//public class Hero {
//	public String name;
//	public int hp;
//}

//list14-11 equalsメソッド()で「なにを持って等価とみなすか」をオーバーライドで定義する
// 「Heroクラスは名前(nameの値)が同じであれば同じ内容のインスタンスとみなす」と定義する場合のコード
public class Hero {
	public String name;
	public int hp;

	public boolean equals(Object o) {
		if (this == o) { // 等値なら間違いなく等価
			return true;
		}
		if (o instanceof Hero) { // o が Hero型なら
			Hero h = (Hero) o; // 変数hにHero型のoを代入
			if (this.name.equals(h.name)) { // 名前(nameの値)が等ひければ等価
				return true;
			}
		} // 等価でも等値でもなければ
		return false;
	}
}

/* 新しくクラスを作成したら、toString()とequals()をオーバーライドする必要がないか検討する */
