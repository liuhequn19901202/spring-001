package jp.co.kksoft.modelview;

import lombok.Data;

@Data
public class InitView {

	//地域
	private String region;

	//国
	private String country;

	//位置
	private String location;

	//分野
	private String department;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


}
