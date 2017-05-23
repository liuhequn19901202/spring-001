package jp.co.kksoft.modelview;

import lombok.Data;

@Data
public class EmployeesView {
	private String str = "ST_CLERK";

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
