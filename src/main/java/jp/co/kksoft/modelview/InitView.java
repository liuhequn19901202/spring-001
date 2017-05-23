package jp.co.kksoft.modelview;

import lombok.Data;

@Data
public class InitView {
	private String abc ="ST_CLERK";

	public String getStr() {
		return abc;
	}

	public void setStr(String abc) {
		this.abc = abc;
	}
}
