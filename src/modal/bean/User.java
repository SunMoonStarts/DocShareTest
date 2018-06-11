package modal.bean;

import java.math.BigDecimal;

public class User {

	private String user_name;
	private String user_pwd;
	private String sex;
	private String education;
	private String profession;
	private BigDecimal tele;
	private String email;
	private String amail;
	
	
	
	public User() {
		
	}
	public User(String user_name,String sex) {
		this.user_name = user_name;
		this.sex = sex;
	}
	public User(String user_name, String user_pwd, String sex, String education, String profession, BigDecimal tele,
			String email) {
		super();
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.sex = sex;
		this.education = education;
		this.profession = profession;
		this.tele = tele;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_pwd=" + user_pwd + ", sex=" + sex + ", education=" + education
				+ ", profession=" + profession + ", tele=" + tele + ", email=" + email + "]";
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public BigDecimal getTele() {
		return tele;
	}
	public void setTele(BigDecimal tele) {
		this.tele = tele;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
