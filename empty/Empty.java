package empty;

// list14-05
public class Empty {
	// メンバが空のクラス
}

// 暗黙の継承:あるクラスを定義するとき、extendsで親クラスを指定しなければ、
// java.lang.Objectを親クラスとして継承したと見なされる

// よって、実質的には
// public class Empty extends Object {}
// と同じ