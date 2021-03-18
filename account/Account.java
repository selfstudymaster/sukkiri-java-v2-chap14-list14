package account;
// chap14
// practice14-2

// 銀行口座クラス Accountを作成
public class Account {
	private String accountNumber; // 口座番号
	private int balance; // 残高

	// 1:文字列表現のメソッド
	public String toString() {
		return "¥¥" + this.balance + ("口座番号：" + this.accountNumber);
	}

	// 2:等価判定のメソッド
	public boolean equals(Object o) {

		if (this == o) {

			return true;

		} if (o instanceof Account) {

			Account a = (Account) o;
			String an1 = this.accountNumber.trim(); // 空白(スペース)を取り除くtrim()メソッド
			String an2 = this.accountNumber.trim();

			if (an1.equals(an2)) {
				return true;
			}

		}
		return false;
	}
}
