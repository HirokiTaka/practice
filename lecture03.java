import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lecture03 {
public static void main(String[] args) {
	//	String型のListかMapを作成して、その内容をコンソール画面に表示してみよう
	//	Listに入れる内容は何でもOKだが、複数入れること
	//	任意のプログラムで例外を起こしてみる
	//	課題のソースコードをGitHubにpushしてレビューを依頼する
	
	// Mapインターフェース
	//	HashMapクラス　：　キーからハッシュ値を算出して管理するため、順序は保証されない
	//	TreeMapクラス　：　キーによってソートされるため、順序を保証する
	//	LinkedHashMapクラス　：　デフォルトでは挿入された順番を保持するが、コンストラクタの第3引数にtrueを設定するとアクセス順で要素を保持できる
	
	Map<String,String> foodMap = new HashMap<>();
	foodMap.put("lemon","レモン");
	foodMap.put("tomato","トマト");
	foodMap.put("apple","リンゴ");
	foodMap.put("grapes","ブドウ");
	
	
	List<String> ngFoodList = new ArrayList<String>();
	try {
		System.out.println("メニューを見せてください");
		List<String> foodList = new ArrayList<String>();
		
		for(String key : foodMap.keySet()) {

			if(key == "lemon") {
				ngFoodList.add(foodMap.get(key));
			}
			foodList.add(foodMap.get(key));
		}

		foodList.forEach(System.out::println);

		System.out.println(ngFoodList.get(0) + "以外食べたいです。");

		// 例外発生 (キーの重複)　同じキーだと上書きされてしまう
		if(foodMap.containsKey("grapes")) {
			throw new NumberFormatException("キーが重複しています。");
		}
		
		foodMap.put("grapes","マスカット");
		for(String key2 : foodMap.keySet()) {
			System.out.println(foodMap.get(key2));
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println(ngFoodList.get(0) + "以外を食べました。");
	}
	
//	・・・・・以下は残骸・・・・・
//	List<String> foodList = new ArrayList<String>();
	
//	foodList.add("lemon");
//	foodList.add("tomato");
//	foodList.add("apple");
	
	// 拡張for文
//	System.out.println("拡張for文");
//	for(String food : foodList) {		
//		System.out.println(food);
//	}
//	
//	System.out.println("forEachメソッド");
//	// forEachメソッド
//	foodList.forEach(System.out::println);	
	
}
}