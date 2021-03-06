package egovframework.projbackend.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class MainController {

	@RequestMapping(value = "/main/main.do")
	public String mainPageController() {
		
		return "main/main";
	}
	
}
