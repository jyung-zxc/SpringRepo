package com.kh.spring.board.model.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.kh.spring.board.model.dao.BoardDao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class BoardServiceImp1 implements BoardService{
	
	private final BoardDao boardDao;
	
	@Override
	public Map<String, String> getBoardTypeMap() {
		return boardDao.getBoardTypeMap();
	}

}
