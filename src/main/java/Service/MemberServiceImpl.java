package Service;

import dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vo.MemberVO;

import javax.inject.Inject;

@Service
public class MemberServiceImpl implements MemberService {
    @Inject
    MemberDAO dao;

    @Override
    public void register(MemberVO vo) throws Exception {

        dao.register(vo);

    }

    @Override
    public MemberVO login(MemberVO vo) throws Exception {
        return dao.login(vo);
    }

    @Override
    public int idChk(MemberVO vo) throws Exception {
        int result = dao.idChk(vo);
        return result;
    }
}
