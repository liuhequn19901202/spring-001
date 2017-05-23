package jp.co.kksoft.form;

import lombok.Data;

@Data
public class Top01Form {

private int Id;
private String name;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
