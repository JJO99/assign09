package dao;

import org.springframework.stereotype.Component;
import vo.MemberVO;

public interface MemberDAO {
    public void register(MemberVO vo) throws Exception;
    public MemberVO login(MemberVO vo) throws Exception;// 아이디 중복체크
    public int idChk(MemberVO vo) throws Exception;
}
