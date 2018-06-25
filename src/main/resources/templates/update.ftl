<html>
<body>
    <form action="save" method="post">
        id:<input name="uid" value="${user.uid}"/>
        账号:<input name="username" value="${user.username}"/>
        密码:<input name="password" type="password" value="${user.password}"/>
        性别:<input name="sex" value="${user.sex}"/>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
