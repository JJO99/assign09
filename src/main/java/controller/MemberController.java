package controller;

import javax.inject.Inject;

import Service.MemberService;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vo.MemberVO;

import java.util.logging.Logger;

public class MemberController {

    @Inject
    MemberService service;

    @Inject
    BCryptPasswordEncoder pwdEncoder;

    // 회원가입 get
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public void getRegister() throws Exception {
        System.out.println("get register");
    }

    // 회원가입 post
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postRegister(MemberVO vo) throws Exception {
        System.out.println("post register");
        int result = service.idChk(vo);
        try {
            if (result == 1) {
                return "/register";
            } else if (result == 0) {
                String inputPass = vo.getPassword();
                String pwd = pwdEncoder.encode(inputPass);
                vo.setPassword(pwd);

                service.register(vo);
            }
            // 요기에서~ 입력된 아이디가 존재한다면 -> 다시 회원가입 페이지로 돌아가기
            // 존재하지 않는다면 -> register
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return "redirect:/";
    }
}
