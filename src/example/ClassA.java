package example;

public class ClassA {

	private String[] fortunePattern= {"‹g","‹¥",};
	private ClassB classb=new ClassB("user1");	//<-ˆË‘¶
	
	public void run(String input) {
		String fortune=getFortune(input);
		classb.tweet(fortune);					//<-ˆË‘¶
	}
	
	private String getFortune(String input) {
		int index=getStrLength(input) % fortunePattern.length;
		if(index==0) {
			return fortunePattern[0];
		}else {
			return fortunePattern[1];
		}
		
	}
	
	private int getStrLength(String str) {
		return str.length();
	}
	
}
