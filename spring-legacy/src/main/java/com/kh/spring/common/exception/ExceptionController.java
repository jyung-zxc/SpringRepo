package com.kh.spring.common.exception;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.spring.member.model.vo.Member;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler
	public String exceptionHandler(Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("errorMsg","서비스 이용중 문제가 발생했습니다.");
		return "common/errorPage";
	}
	
//	@PostMapping("/insert")
//	public String register(
//			@Validated @ModelAttribute Member member,
//			BindingResult bindingResult,
//			// BindingResult
//			// - 유효성 검사 결과를 저장하는 객체
//			// - forward시 자동으로 jsp에게 전달되며, form 태그내에 에러내용을 바인딩하기위해 사용된다.
//			RedirectAttributes ra
//			) {
//			// 유효성 검사 실패시
//		if(bindingResult.hasErrors()) {
//			return "member/memberEnrollForm";
//		}
//		//유효성 검사 성공시 비밀번호 암호화하여 회원가입 진행
//		String encryptedPassword = passwordEnoder.encode{member.getUserPwd()}
//		member.setUserPwd(encryptedPassword);
//	}
}
