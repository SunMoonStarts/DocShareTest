package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

//多文件上传
public class UploadAction extends ActionSupport {

	private File[] uploadImages;// 得到上传的文件
	private String[] uploadImagesContentType;// 得到文件的类型
	private String[] uploadImagesFileName;// 得到文件的名称

	public String saveFiles() throws Exception {
		System.out.println("upload2...");
		ServletContext sc = ServletActionContext.getServletContext();
		String realpath = sc.getRealPath("/uploadfile");
		try {
			if (uploadImages != null && uploadImages.length > 0) {
				for (int i = 0; i < uploadImages.length; i++) {

					File destFile = new File(realpath, uploadImagesFileName[i]);
					FileUtils.copyFile(uploadImages[i], destFile);
				}
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("upload...");
		return "success";
	}

	public File[] getUploadImages() {
		return uploadImages;
	}

	public void setUploadImages(File[] uploadImages) {
		this.uploadImages = uploadImages;
	}

	public String[] getUploadImagesContentType() {
		return uploadImagesContentType;
	}

	public void setUploadImagesContentType(String[] uploadImagesContentType) {
		this.uploadImagesContentType = uploadImagesContentType;
	}

	public String[] getUploadImagesFileName() {
		return uploadImagesFileName;
	}

	public void setUploadImagesFileName(String[] uploadImagesFileName) {
		this.uploadImagesFileName = uploadImagesFileName;
	}
	
}
