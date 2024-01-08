package pet_1109412345;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy MyDog=new Puppy("皮皮");		
		Puppy MyCat=new Puppy("Kitty","cat","Gray");
		double Total; //總消費金額
		Total=MyDog.check(0,1);
		System.out.printf("總金額為:%8.2f%n%n",Total);
		Total=MyCat.check(0,1,3);
		System.out.printf("總金額為:%8.2f%n%n",Total);
	}

}
//程式碼會放GitHub上.