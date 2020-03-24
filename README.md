# assign09
대충 이게 다 무슨소리냐는 말

## 목표
**JWT와 Spring Security를 이용한 회원가입, 회원인증 API 구현**
회원가입시 유저 정보를 입력받고, 패스워드는 **bcrypt**로 암호화 이후에 유저 db에 저장


로그인시 ID/PW를 입력받고, 입력받은 PW를 userDB에 저장된 bcrypt로 암호화된 PW를 userDB 에 저장된 bcrypt로 암호화된 pw 와  비교하여, 일치한다면 JWT Generate 를 통해 JWT를 발급하여 Response 로 넘겨주기


GET /jwtTest 호출시, jwt 토큰 검증 이후, 올바르면 성공(200 status code) 리턴, 올바르지 않으면 unauthorize(401 status code) 리턴


JWT generate는 Spring-Security 모듈이 아닌 Java로 구현


POST /register , POST /login , GET /jwtTest 3개를 @Controller에 추가해 라우팅 처리해야함.

**이게 다 무슨소리야**
