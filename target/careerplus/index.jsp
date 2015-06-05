<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.11.3.js"></script>
</head>
<body>
<h2>登录</h2>

<form id="form" name="form" method="post">
    用户名：<input name="loginName" type="text">
    用户名：<input name="loginPwd" type="password">
    <%--<input type="hidden" name="id">--%>
    <%--<input type="hidden" name="typeId">--%>
    <input type="button" value="登录" id="login">
</form>
</body>
<script>
    //将一个表单的数据转成JSON对象
    $.fn.serializeObject = function () {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
    $('#login').click(function () {
        var jsonform = JSON.stringify($('#form').serializeObject());
        $.ajax({
            type: 'post',
            contentType: 'application/json',
            url: 'login',
            data: jsonform,
            dataType: 'json',
            success: function (data) {
                if (data.result == 'success') {
                    alert('登录成功');
                }
            }
        })
    })
</script>
</html>
