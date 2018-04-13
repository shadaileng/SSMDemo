<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/uikit.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/uikit.gradient.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/css/awesome.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/sha1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/uikit.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/sticky.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/vue.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/awesome.js"></script>

	<title>Index</title>
	<script type="text/javascript">
        function validateEmail(email) {
            var re = /^[0-9a-z\-\_\.]+\@[0-9a-z\-\_]+(\.[0-9a-z\-\_]+){1,4}$/;
            return re.test(email.toLowerCase())
        }
        $(function () {

            var vm = new Vue({
                el: '#vm',
                data: {
                    name: '',
                    email: '',
                    password1: '',
                    password2: ''
                },
                methods: {
                    submit: function(event){
                        event.preventDefault();
                        var $form = $('#vm');
                        if(!this.name.trim()){
                            return $form.showFormError('请输入名字')
                        }
                        if(!validateEmail(this.email.trim().toLowerCase())){
                            return $form.showFormError('请输入正确的Email地址')
                        }
                        if(this.password1.length < 6){
                            return $form.showFormError('密码长度至少为6位')
                        }
                        if(this.password1 != this.password2){
                            return $form.showFormError('两次输入的密码不一致')
                        }
                        $form.postJSON('{{action}}', {
                            name: this.name.trim(),
                            email: this.email.trim().toLowerCase(),
                            password: this.password1
                        }, function(err, r){
                            if(err){
                                return $form.showFormError(err)
                            }
                            return location.assign('/')
                        });
                    }
                }
            });
            $('#vm').show();
        });
	</script>

</head>

<body>
	<nav class="uk-navbar uk-navbar-attached uk-margin-bottom">
		<div class="uk-container uk-container-center">
			<a href="/" class="uk-navbar-brand">Shadaileng</a>
			<ul class="uk-navbar-nav">
				<li data-url="blogs"><a href="/"><i class="uk-icon-home"></i>日志</a></li>
				<li ><a target="_blank" href="/"><i class="uk-icon-book"></i>教程</a></li>
				<li ><a target="_blank" href="/"><i class="uk-icon-code"></i>源码</a></li>
			</ul>
			<div class="uk-navbar-flip">
				<ul class="uk-navbar-nav">
                    <c:choose>
                        <c:when test="${requestScope.__user__}">
                            <li><a href="${pageContext.request.contextPath }/redirect/logout"><i class="uk-icon-sign-out"></i>登出</a></li>
                            <li><a href="${pageContext.request.contextPath }/redirect/blogs"><i class="uk-icon-edit"></i>日志</a></li>
                        </c:when>
                        <c:otherwise>
                            <li><a href="${pageContext.request.contextPath }/redirect/login"><i class="uk-icon-sign-in"></i>登陆</a></li>
                            <li><a href="${pageContext.request.contextPath }/redirect/register"><i class="uk-icon-edit"></i>注册</a></li>
                        </c:otherwise>
                    </c:choose>
				</ul>
			</div>
		</div>
	</nav>
	<div class="uk-container uk-container-center">
		<div class="uk-grid">
			<h1 style="text-align: center">注册</h1>
			<form id="vm" v-on="submit: submit" class="uk-form uk-form-stacked">
                <div class="uk-alert uk-alert-danger uk-hidden"></div>
				<div class="uk-form-row">
					<label class="uk-form-label">姓名: </label>
					<div class="uk-form-controls">
						<input type="text" v-model="name" maxlength="50" placeholder="姓名" >
					</div>
				</div>
				<div class="uk-form-row">
					<label class="uk-form-label">电子邮箱: </label>
					<div class="uk-form-controls">
						<input type="text" v-model="email" maxlength="50" placeholder="电子邮箱" >
					</div>
				</div>
				<div class="uk-form-row">
					<label class="uk-form-label">密码: </label>
					<div class="uk-form-controls">
						<input type="password" v-model="password1" maxlength="50" placeholder="输入密码" >
					</div>
				</div>
				<div class="uk-form-row">
					<label class="uk-form-label">确认密码: </label>
					<div class="uk-form-controls">
						<input type="password" v-model="password2" maxlength="50" placeholder="确认密码" >
					</div>
				</div>
				<div class="uk-form-row">
					<button type="submit" class="uk-button uk-button-primary"><i class="uk-icon-user"></i> 注册 </button>
				</div>
			</form>
		</div>
	</div>
	
	<div class="uk-margin-large-top" style="background-color: #eee; border-top: 1px solid #ccc;">
		<div class="uk-container uk-container-center uk-text-center">
			<div class="uk-panel uk-margin-top uk-margin-bottom">
				<p>
					<a href="#" class="uk-icon-button uk-icon-weibo" target="_blank"></a>
				</p>
				<p>Powered By<a href="#">Shadaileng</a>. Copright &copy; 2018.</p>
			</div>
		</div>
	</div>
	
</body>

</html>