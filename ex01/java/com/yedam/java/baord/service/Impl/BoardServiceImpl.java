package com.yedam.java.baord.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

//impl에는 반드시 @Service
@Service
public class BoardServiceImpl implements BoardService {
	//Mapper에서 필요한거 가져오기  위해서 @Autowired
	@Autowired
	BoardMapper mapper;
	
	@Override
	public int getBoardNo() {
		BoardVO vo = mapper.getBoardNo();
		return vo.getBno();
	}
	
	@Override
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}

	@Override
	public BoardVO getBoardInfo(BoardVO boardVO) {
		return mapper.getBoardInfo(boardVO);
	}

	@Override
	public int insertBoard(BoardVO boardVO) {
		return mapper.insertBoard(boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) {
		return mapper.updateBoard(boardVO);
	}

	@Override
	public int deleteBoard(BoardVO boardVO) {
		return mapper.deleteBoard(boardVO.getBno());
	}

}
