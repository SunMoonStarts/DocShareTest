package modal.bean;


import org.springframework.stereotype.Component;

//积分
@Component
public class Integral {

	private int integral_id;
	private String user_name;  //用户名
	private int total_integral;  //总积分
	public Integral() {
		super();
	}
	public Integral(String user_name, int total_integral) {
		
		this.user_name = user_name;
		this.total_integral = total_integral;
	}
	public Integral(int integral_id, String user_name, int total_integral) {
		super();
		this.integral_id = integral_id;
		this.user_name = user_name;
		this.total_integral = total_integral;
	}
	@Override
	public String toString() {
		return "Integral [integral_id=" + integral_id + ", user_name=" + user_name + ", total_integral="
				+ total_integral + "]";
	}
	public int getIntegral_id() {
		return integral_id;
	}
	public void setIntegral_id(int integral_id) {
		this.integral_id = integral_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getTotal_integral() {
		return total_integral;
	}
	public void setTotal_integral(int total_integral) {
		this.total_integral = total_integral;
	}
	
}
