package DIexample;


public class ClassA_DI {

	private String[] fortunePattern= {"‹g","‹¥",};
	
	public void run(String input, ClassB_IF classb) {		//IF‚ð“ü‚ê‚Æ‚­
		String fortune=getFortune(input);
		classb.tweet(fortune);
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
