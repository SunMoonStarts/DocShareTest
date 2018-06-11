package modal.bean;


import org.springframework.stereotype.Component;

//文档
@Component("docum")
public class Doc {

	private int doc_id;
	private int down_count;  //下载次数
	private String uploader;  //上传者
	private String upload_time;
	private int down_integral; //下载积分
	private String doc_type; 
	private String doc_title;  //文档名
	private String state;  //文档状态---审核、未审核
	private String doc_name;    //物理文件名
	public Doc() {
		super();
	}
	public Doc(int doc_id, int down_count, String uploader, String upload_time, int down_integral,
			String doc_type, String doc_title, String state, String doc_name) {
		super();
		this.doc_id = doc_id;
		this.down_count = down_count;
		this.uploader = uploader;
		this.upload_time = upload_time;
		this.down_integral = down_integral;
		this.doc_type = doc_type;
		this.doc_title = doc_title;
		this.state = state;
		this.doc_name = doc_name;
	}
	@Override
	public String toString() {
		return "Doc [doc_id=" + doc_id + ", down_count=" + down_count + ", uploader=" + uploader + ", upload_time="
				+ upload_time + ", down_integral=" + down_integral + ", doc_type=" + doc_type + ", doc_title="
				+ doc_title + ", state=" + state + ", doc_name=" + doc_name + "]";
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public int getDown_count() {
		return down_count;
	}
	public void setDown_count(int down_count) {
		this.down_count = down_count;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(String upload_time) {
		this.upload_time = upload_time;
	}
	public int getDown_integral() {
		return down_integral;
	}
	public void setDown_integral(int down_integral) {
		this.down_integral = down_integral;
	}
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getDoc_title() {
		return doc_title;
	}
	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	
	
}
