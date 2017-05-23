package jp.co.kksoft.modelview;

import lombok.Data;

@Data
public class TestModelView {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
