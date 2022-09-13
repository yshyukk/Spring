package com.yedam.java.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

//~기능을 가질껍니다~

@Service
public interface BoardService {
	//게시글 조회
	public int getBoardNo();
	//전체조회
	public List<BoardVO> getBoardList();
	//단건조회
	public BoardVO getBoardInfo(BoardVO boardVO);
	//등록
	public int insertBoard(BoardVO boardVO);
	//수정
	public int updateBoard(BoardVO boardVO);
	
	//삭제
	public int deleteBoard(BoardVO boardVO);
}
