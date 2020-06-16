package DIexample;

public class ClassB_DI implements ClassB_IF{
	
	public ClassB_DI() {};
	public ClassB_DI(String account) {};
	
	public void tweet(String str) {
		System.out.println("tweet:"+str);
	}

}
