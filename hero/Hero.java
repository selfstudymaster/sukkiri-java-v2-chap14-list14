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
//	// オーバーライドする
//	public String toString() {
//		return "名前：" + this.name + "／HP：" + this.hp;
//	}
//}

//list14-11 等価とみなされるようにオーバーライドする
public class Hero {
	public String name;
	public int hp;

	public boolean equals(Object o) {
		if (this == o) {
			return true; // 等値(==)ならtrueを返す
		} if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

}