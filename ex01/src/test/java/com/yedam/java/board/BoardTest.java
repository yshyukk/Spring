package com.yedam.java.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
public class BoardTest {
	
	@Autowired
	BoardService service;
	
	
	@Test
	public void BoardAllProcess() {
		//등록
		BoardVO info = new BoardVO();
		info.setTitle("테스트-제목");
		info.setContents("테스트-내용");
		info.setWriter("테스트-작성자");
		
		int result = service.insertBoard(info);
		
		assertEquals(result, 1);
		
		//단건조회
		BoardVO findVO = service.getBoardInfo(info);
		assertNotNull(findVO);
		
		//수정
		info.setContents("수정-내용");
		result = service.updateBoard(info);
		
		
		//전체조회
		List<BoardVO> list = service.getBoardList();
		assertNotNull(list);
		
		//삭제
		result = service.deleteBoard(info);
		assertEquals(result, 1);
	}
}
