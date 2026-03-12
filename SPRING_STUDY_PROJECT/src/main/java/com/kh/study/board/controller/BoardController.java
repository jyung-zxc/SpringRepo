package com.kh.study.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kh.study.board.vo.Board;

@Controller
public class BoardController {

    @GetMapping("/list")
    public String BoardList(
    		Model model
    		) {
//    	List<Board> list = 
//    			boardService.selectBoardList();
    	
        
//        model.addAttribute("list", list);
    	
        return "board/list"; 
    }
}