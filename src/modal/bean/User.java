package modal.bean;

import java.math.BigDecimal;

public class User {

	private int user_id;
	private String user_name;
	private String user_pwd;
	private String sex;
	private String education;
	private String profession;
	private long tele;
	private String email;
	private int param_id;   //普通会员、管理员
	private String register_time;   //注册时间
	
	private Integral integral;  //积分对象
	
	public User() {
		super();
	}
	public User(String user_name,String sex) {
		this.user_name=user_name;
		this.sex=sex;
	}
	public User(int user_id, String user_name, String user_pwd, String sex, String education, String profession,
			long tele, String email, int param_id, String register_time, Integral integral) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_pwd = user_pwd;
		this.sex = sex;
		this.education = education;
		this.profession = profession;
		this.tele = tele;
		this.email = email;
		this.param_id = param_id;
		this.register_time = register_time;
		this.integral = integral;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_pwd=" + user_pwd + ", sex=" + sex
				+ ", education=" + education + ", profession=" + profession + ", tele=" + tele + ", email=" + email
				+ ", param_id=" + param_id + ", register_time=" + register_time + ", integral=" + integral + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public long getTele() {
		return tele;
	}

	public void setTele(long tele) {
		this.tele = tele;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getParam_id() {
		return param_id;
	}

	public void setParam_id(int param_id) {
		this.param_id = param_id;
	}

	public String getRegister_time() {
		return register_time;
	}

	public void setRegister_time(String register_time) {
		this.register_time = register_time;
	}

	public Integral getIntegral() {
		return integral;
	}

	public void setIntegral(Integral integral) {
		this.integral = integral;
	}
	
}
