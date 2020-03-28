<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<h3>로그인</h3>
<form action="login" method="post">
    <table border="1" cellpadding="0" cellspacing="0">
        <tr>
            <td bgcolor="aqua">아이디</td>
            <td>
                <input type="text" name="id"/>
            </td>
            <td rowspan="2">
                <input type="submit" value="로그인"/>
            </td>
        </tr>
        <tr>
            <td bgcolor="aqua">비밀번호</td>
            <td><input type="password" name="password"/></td>
        </tr>
    </table>
</form>
<h3>계정이 없으신가요?</h3>
<form action="joinScreen" method="post">
    <input type="submit" value="회원가입">
</form>
</body>
</html>