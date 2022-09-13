package com.yedam.java.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {
	//게시글 번호 조회
	public BoardVO getBoardNo();
	
	//전체조회
	public List<BoardVO> getBoardList();
	
	//단건조회
		//한개만 가지고 오려면 특정한 조건이 필요 -BoardVO로 받아오겠습니다.
	public BoardVO getBoardInfo(BoardVO boardVO);
	
	//등록
		//호출할때 return을 안받으면 되니까 returntype을 int
	public int insertBoard(BoardVO boardVO);
	
	//수정
	public int updateBoard(BoardVO boardVO);	
	
	//삭제
		//삭제 조건 = 매개변수로 (삭제 조건 넘겨줘야하니까)
		//@Param : MyBatis에서 변수로 사용할 값 -> 보통 두개넘길때 사용
	public int deleteBoard(@Param("bno") int boardNo);
	
}	
