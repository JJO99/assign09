package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.MemberVO;

import javax.inject.Inject;

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Inject
    private SqlSessionTemplate sql;

    @Override
    public void register(MemberVO vo) throws Exception {
        sql.insert("memberMapper.register", vo);
    }

    @Override
    public MemberVO login(MemberVO vo) throws Exception {

        return sql.selectOne("memberMapper.login", vo);
    }

    @Override
    public int idChk(MemberVO vo) throws Exception {
        int result = sql.selectOne("memberMapper.idChk", vo);
        return result;
    }
}
