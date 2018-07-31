
public class Person {

	private int aptNum;
	private String aptName;
	private int stNum;
	private String stName;
	private String suburb;
	private String town;
	private String city;
	private String county;
	private String state;
	private String province;
	private String country;
	
	public Person() {
		
	}
	
	public Person(int a, String ap, int s, String st, String sb, String tw, String cy, 
			String co, String p, String sta, String cn) {
		this.aptNum=a;
		this.aptName=ap;
		this.stNum=s;
		this.stName=st;
		this.suburb=sb;
		this.town=tw;
		this.city=cy;
		this.county=co;
		this.province=p;
		this.state=sta;
		this.country=cn;
		
		
	}
	
	//required method - returns the complete address of the person
	public String getAddress() {
		String apt=Integer.toString(aptNum)+" "+aptName;
		String st=Integer.toString(stNum)+" "+stName;
		
		return (apt+", "+st+", "+suburb+", "+town+", "+city+", "+county+", "+province+", "+state+", "+country);
		//return null;
	}

	public int getAptNum() {
		return aptNum;
	}

	public void setAptNum(int aptNum) {
		this.aptNum = aptNum;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
