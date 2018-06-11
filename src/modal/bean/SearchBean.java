package modal.bean;

//查询文档、用户相关信息的实体类
public class SearchBean {

	private String uploader;  //上传者、用户名
	private String startTime;  //上传、注册   起始日期
	private String endTime;  //截止日期
	private String docType;     //文档类型
	private String docState;   //审核状态
	private String docTitle;  //文档标题
	private String condition;     //任意的一个条件--完全模糊的查询：搜索全部文档
	
	public SearchBean() {
		super();
	}
	public SearchBean(String uploader, String startTime, String endTime, String docType, String docState,
			String docTitle) {
		super();
		this.uploader = uploader;
		this.startTime = startTime;
		this.endTime = endTime;
		this.docType = docType;
		this.docState = docState;
		this.docTitle = docTitle;
	}
	public SearchBean(String uploader, String startTime, String endTime, String docType, String docState,
			String docTitle, String condition) {
		super();
		this.uploader = uploader;
		this.startTime = startTime;
		this.endTime = endTime;
		this.docType = docType;
		this.docState = docState;
		this.docTitle = docTitle;
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return "SearchBean [uploader=" + uploader + ", startTime=" + startTime + ", endTime=" + endTime + ", docType="
				+ docType + ", docState=" + docState + ", docTitle=" + docTitle + ", condition=" + condition + "]";
	}
	public String getDocTitle() {
		return docTitle;
	}

	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}

	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocState() {
		return docState;
	}
	public void setDocState(String docState) {
		this.docState = docState;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
