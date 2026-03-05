package com.kh.spring.board.controller;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring.board.model.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	private final ResourceLoader resourceloader;
	private final ServletContext application; // application scope
	/*
	 * ResourceLoader
	 *  - 스프링에서 제공하는 자원 로딩 클래스
	 *  - classpath, file시스템, url등 다양한 경로상의 자원을 
	 *    "동일한"인터페이스로 로드(입력)하는 메서드를 제공한다.
	 */
	
	// BoardType전역객체 설정
	// - 어플리케이션 전역에서 사용할 수 있는 BoardType 객체 추가
	// - 서버 가동중 1회만 수행되도록 설정
	@PostConstruct
	public void init() {
		// key = 코드 , value= 게시판 이름
		Map<String, String> boardTypeMap
			= boardService.getBoardTypeMap();
		application.setAttribute("boardTypeMap", boardTypeMap);
		log.debug("boardTypeMap : {}", boardTypeMap);		
	}
}
