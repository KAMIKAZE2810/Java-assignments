package week1.day2;

public class Browser {

	public String launchbrowser(String browserName) {
		System.out.println("Browser Is Launched successfully"+browserName);
		return browserName;

	}
	public void loadUrl() {
		System.out.println("Application Loaded Successfully");
	}
	public static void main(String[] args)
	{
Browser Browserobj= new Browser();
Browserobj.launchbrowser("My first method");
Browserobj.loadUrl();
}
}


