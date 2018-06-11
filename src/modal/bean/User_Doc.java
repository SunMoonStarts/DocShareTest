package modal.bean;


//用户文档关系表，记录用户对文档的相关操作--上传和下载
public class User_Doc {

	private int user_doc_id;
	private String user_name;
	private int doc_id;
	private String state;  //记录对文档的操作，是上传还是下载
	public User_Doc() {
		super();
	}
	
	public User_Doc(String user_name, int doc_id, String state) {
		super();
		this.user_name = user_name;
		this.doc_id = doc_id;
		this.state = state;
	}

	public User_Doc(int user_doc_id, String user_name, int doc_id, String state) {
		super();
		this.user_doc_id = user_doc_id;
		this.user_name = user_name;
		this.doc_id = doc_id;
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "User_Doc [user_doc_id=" + user_doc_id + ", user_name=" + user_name + ", doc_id=" + doc_id + ", state="
				+ state + "]";
	}
	public int getUser_doc_id() {
		return user_doc_id;
	}
	public void setUser_doc_id(int user_doc_id) {
		this.user_doc_id = user_doc_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
