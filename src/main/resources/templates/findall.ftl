<#list users as user>
  用户名：${user.username}
  密  码：${user.password}
  年  龄: ${user.sex}
  <a href="delete?uid=${user.uid}">删除</a>
  <a href="findById?uid=${user.uid}">修改</a>
</#list>