package egovframework.projbackend.bbs.service.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class Name : BbsVO.java
 * @Description : 게시판에 사용되는 데이터
 * @Modification Information
 * @
 * @  	수정일				수정자				수정내용
 * @ ----------------------------------------------------------
 * @ 2020.09.17			Kim-Jeonghun			최초 생성
 *
 * @author Kim-Jeonghun
 * @since 2020.09.17
 * @version 1.0
 * @see
 *
 *  Copyright 2020. Kim-Jeonghun. All codes can be used without copyright permission.
 */


public class BbsVOList {	
	
	List<BbsVO> list;
	
	public BbsVOList() {
		list = new ArrayList<>();
	}

	public List<BbsVO> getList() {
		return list;
	}

	public void setList(List<BbsVO> list) {
		this.list = list;
	}

	
	
	
}
