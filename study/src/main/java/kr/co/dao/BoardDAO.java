package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;

public interface BoardDAO {
	
	public void write(BoardVO boardVO) throws Exception;
	
	public List<BoardVO> list(Criteria cri) throws Exception;
	
	public int listCount() throws Exception;
	
	public BoardVO read(int bno) throws Exception;
	
	public void update(BoardVO boardVO) throws Exception;
	
	public void delete(int bno) throws Exception;
}
