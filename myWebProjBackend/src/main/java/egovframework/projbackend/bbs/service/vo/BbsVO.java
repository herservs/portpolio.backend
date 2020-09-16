package egovframework.projbackend.bbs.service.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Class Name : BbsVO.java
 * @Description : 게시판에 사용되는 데이터
 * @Modification Information
 * @
 * @  	수정일				수정자				수정내용
 * @ ----------------------------------------------------------
 * @ 2020.09.16			Kim-Jeonghun			최초 생성
 *
 * @author Kim-Jeonghun
 * @since 2020.09.16
 * @version 1.0
 * @see
 *
 *  Copyright 2020. Kim-Jeonghun. All codes can be used without copyright permission.
 */


public class BbsVO {	
	private int bbsID;
	private String bbsTitle;
	private String userID;
	private String bbsDate;
	private String bbsContent;
	private int bbsAvailable;
	
	public int getBbsID() {
		return bbsID;
	}
	public void setBbsID(int bbsID) {
		this.bbsID = bbsID;
	}
	public int getBbsAvailable() {
		return bbsAvailable;
	}
	public void setBbsAvailable(int bbsAvailable) {
		this.bbsAvailable = bbsAvailable;
	}
	
	
	public String getBbsTitle() {
		return bbsTitle;
	}
	public void setBbsTitle(String bbsTitle) {
		this.bbsTitle = bbsTitle;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getBbsDate() {
		return bbsDate;
	}
	public void setBbsDate(String bbsDate) {
		this.bbsDate = bbsDate;
	}
	public String getBbsContent() {
		return bbsContent;
	}
	public void setBbsContent(String bbsContent) {
		this.bbsContent = bbsContent;
	}
	

	
			
	
	
}
