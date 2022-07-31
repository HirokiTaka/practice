import java.util.Arrays;
import java.util.List;

class Dog{
	private String name;
	public static final String type = "dog";
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void bow() {
		System.out.println("bow!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		// リスト・for・if文の練習
		Dog dog = new Dog("wan");
		dog.bow();
		System.out.println(dog.getName());
		
		List<Dog> dogList = List.of(new Dog("wan1"),
									new Dog("wan2")
				);
		
		for (Dog dog_for : dogList) {
			
			if (dog_for.getName().equals("wan1")){
				System.out.println("wan1がいます");
				System.out.println("犬：" + dog_for.getName());
			}
			else
				System.out.println("ほかの犬もいるよ！");
			}
		
		// ストリームAPI
		List<Integer> integerList = Arrays.asList(1,2,3,4,5);
		integerList.stream() //streamの取得
			.filter(i -> i % 2 == 0) //中間操作
			.forEach(i -> System.out.println(i)); //終端操作
			
	}
}