<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
	
	<title>로그인</title>
	
	 <!-- Bootstrap core CSS-->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin.css" rel="stylesheet">
</head>
<body class="bg-color">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Login</div>
			<div class="card-body">
			<form action="login" method="post">
				<div class="form-group form-group-lg">
					<div class="form-group">
						<label>사용자명</label> <input type="text" name="username"
							id="user_id" class="form-control" placeholder="아이디" required>
					</div>
					<div class="form-group">
						<label>비밀번호</label> <input type="password" name="password"
							id="user_pw" class="form-control" placeholder="비밀번호" required>
					</div>
					<div class="form-group">
						<input type="hidden" name="${ _csrf.parameterName }"
							value="${ _csrf.token }">
					</div>
					<div class="form-action">
						<sec:csrfInput />
						<input type="submit" class="btn btn-primary btn-lg" value="로그인">
						<a href="memberJoin" class="btn btn-primary btn-lg" >회원가입</a>
					</div>
				</div>
			</form>
			</div><!-- /card body -->
		</div>
	</div>

</body>
</html>