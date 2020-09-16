package egovframework.projbackend.bbs.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.projbackend.bbs.service.vo.BbsVO;
import lombok.extern.log4j.Log4j;


/**
 * @Class Name : MainController.java
 * @Description : 메인화면 컨트롤러
 * @Modification Information
 * @
 * @  	수정일				수정자				수정내용
 * @ ----------------------------------------------------------
 * @ 2020.07.23			Kim-Jeonghun			최초 생성
 *
 * @author Kim-Jeonghun
 * @since 2020.07.23
 * @version 1.0
 * @see
 *
 *  Copyright 2020. Kim-Jeonghun. All codes can be used without copyright permission.
 */

@Controller
public class BbsController {

	@RequestMapping(value = "/bbs/bbs.do")	
	public String mainPageController
	(@RequestParam("test")String[] name) {
		
	for(String str : name) {
		System.out.println(str);
	}
														
		return "bbs/bbs";
	}
	
}

