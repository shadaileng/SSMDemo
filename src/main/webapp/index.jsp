<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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

</head>

<body>
	<nav class="uk-navbar uk-navbar-attached uk-margin-bottom">
		<div class="uk-container uk-container-center">
			<a href="/" class="uk-navbar-brand">Shadaileng</a>
			<ul class="uk-navbar-nav">
				<li data-url="blogs"><a href="/"><i class="uk-icon-home"></i>日志</a></li>
				<li target="_blank" href="#"><a href="/"><i class="uk-icon-book"></i>教程</a></li>
				<li target="_blank" href="#"><a href="/"><i class="uk-icon-code"></i>源码</a></li>
			</ul>
			<div class="uk-navbar-flip">
				<ul class="uk-navbar-nav">
					<li><a href="/login"><i class="uk-icon-sign-in"></i>登陆</a></li>
					<li><a href="/register"><i class="uk-icon-edit"></i>注册</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="uk-container uk-container-center">
		<div class="uk-grid">
			<h1 style="text-align: center">首页</h1>
			<h2><a href="${pageContext.request.contextPath }/redirect">validate test</a></h2>
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