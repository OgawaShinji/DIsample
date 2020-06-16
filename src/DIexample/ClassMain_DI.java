package DIexample;

public class ClassMain_DI {
	public static void main(String args[]) {
		ClassB_IF classb=new ClassB_DI("user");
		
		ClassA_DI class_a=new ClassA_DI();
		class_a.run("aa", classb);

}
}