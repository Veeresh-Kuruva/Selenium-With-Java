package AutomationTesting;

public class BCMethodCalling {

	public static void main(String[] args) {
		BaseClass bclass=new BaseClass();
		bclass.launchApp("https://fb.com");
		bclass.elementavailable("email", true);
		bclass.elementenabled("pass", true);
		bclass.urlcontains("facebook",true);
		bclass.closeApp();
	}

}
