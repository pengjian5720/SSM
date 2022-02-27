<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/2/24
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="">

<head>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>欢迎登录</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
<div class="col-md-6 col-12 fxt-bg-color">
  <div class="fxt-content">
    <div class="fxt-form">
      <h2>欢迎登录</h2>
      <form method="POST" action="login">
        <div class="form-group">
          <div class="fxt-transformY-50 fxt-transition-delay-3">
            <input type="text" class="form-control" name="userId" placeholder="用户名" required="required">
          </div>
        </div>
        <div class="form-group">
          <div class="fxt-transformY-50 fxt-transition-delay-4">
            <input id="password" type="password" class="form-control" name="pwd" placeholder="********" required="required">
            <i toggle="#password" class="fa fa-fw fa-eye toggle-password field-icon"></i>
          </div>
        </div>
        <div class="form-group">
          <div class="fxt-transformY-50 fxt-transition-delay-5">
            <div class="text-center">
              <button type="submit" class="fxt-btn-fill">登录</button>
            </div>
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
</body>

</html>
