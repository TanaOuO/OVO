package pet_1109412345;

public class Puppy {

	/*
	1、 字串：PuppyName (寵物姓名)
	2、 字串：PuppyType (寵物品種)
	3、 字串：PuppyColor (寵物顏色)
	4、 字串：PuppyGender (寵物性別)
	*/
	private String PuppyName;
	private String PuppyType;
	private String PuppyColor;
	private String PuppyGender;
	static final String[] Citemes= {"洗澡","修指","理毛","大美容","中美容"};
	static final double[]  Cprice={600,200,300,1000,750};

	Puppy(){
		
	}
	Puppy(String PuppyName){
		this.setPuppyName(PuppyName);
	}
	Puppy(String PuppyName,String PuppyType, String PuppyColor){
		this(PuppyName);
		this.setPuppyType(PuppyType);
		this.setPuppyColor(PuppyColor);
	}
	public double check(double ...ShoppingIndex ) {
		double RtnValue=0;
		for (var EachIndex : ShoppingIndex) {
			if ((EachIndex>this.Citemes.length) || (EachIndex<0)){
				return -1; // out of bound,超過陣列邊界,取消程式
			}
		}
		/*
		 計算消費金額,總金額放入到Rtnvalue變數中,回傳.
		*/  
		for (var EachIndex : ShoppingIndex) {
			//題目要求傳入double型別,此處要強制轉型
			RtnValue+=Cprice[(int)EachIndex]; 			
		}		 
		//印出明細,標題可在此處理或在主程式處理,不限制.
		//本案例標題,kitty 消費明細,皮皮消費明細 在此處理
		System.out.printf("%s消費明細%n",this.getPuppyName());
		System.out.printf("***************%n");
		int SerialNo=0;
		for (var EachIndex : ShoppingIndex) {
			SerialNo++;
			System.out.printf("%d %s %8.2f%n",SerialNo,Citemes[(int) EachIndex],Cprice[(int) EachIndex]);
		}
		System.out.printf("***************%n");
		
		return RtnValue;
			
	}
	
	public String getPuppyName() {
		return PuppyName;
	}
	public void setPuppyName(String puppyName) {
		PuppyName = puppyName;
	}
	public String getPuppyType() {
		return PuppyType;
	}
	public void setPuppyType(String puppyType) {
		PuppyType = puppyType;
	}
	public String getPuppyColor() {
		return PuppyColor;
	}
	public void setPuppyColor(String puppyColor) {
		PuppyColor = puppyColor;
	}
	public String getPuppyGender() {
		return PuppyGender;
	}
	public void setPuppyGender(String puppyGender) {
		PuppyGender = puppyGender;
	}

	
}
