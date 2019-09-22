package FileUtility;

public class Locator {
	public final String email;
	public final String passwd;
	public final String day;
	public final String month;
	public final String year;
	public final String login;
	
	
	public Locator() {
		email=PropertiesFile.getProperty("email");
		passwd=PropertiesFile.getProperty("passwd");
		day=PropertiesFile.getProperty("day");
		month=PropertiesFile.getProperty("month");
		year=PropertiesFile.getProperty("year");
		login=PropertiesFile.getProperty("login");
	}
	
}
