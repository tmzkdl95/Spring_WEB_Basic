<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
	<title>회원가입</title>
	
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
			<div class="card-header">회원가입</div>
			<div class="card-body">
				<div class="form-group form-group-lg">
					<form action="memberJoin/register" method="post" id="userInfo">
						<!-- name이 vo에 설정된 이름이랑 똑같아야함 -->
						<div class="form-group">
							<label> ID </label> <input type="text" name="user_id" size="10" class="form-control"
								id="user_id" placeholder="영문 입력" style="IME-MODE: disabled" required >
						</div>
						<div class="form-group">
							<label> Password </label> <input type="text" name="user_pw" class="form-control"
								size="10" id="user_pw" placeholder="비밀번호 입력" required >
						</div>
						<div class="form-group">
							<label> Mail </label> <input type="email" name="user_mail" class="form-control"
								size="10" id="user_mail" placeholder="메일 입력(영문만 가능)" style="IME-MODE: disabled" required >
						</div>

						<div class="form-group">
							<input type="hidden" name="${ _csrf.parameterName }"
								value="${ _csrf.token }">
						</div>
						<input type="submit" class="btn btn-primary btn-lg" value="회원가입" >
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>