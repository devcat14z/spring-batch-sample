package example;

import java.io.Serializable;
import java.util.Date;

public class Step2InputEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private Date bizDate;
	private String userName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getBizDate() {
		return bizDate;
	}

	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String toString() {
		return "Step2InputEntity:id=" + id + ",bizDate=" + bizDate
				+ ",userName=" + userName;
	}

}
