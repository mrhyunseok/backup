function addForm(form) {
	form.title.value = form.title.value.trim();
	if (form.title.value.length == 0) {
		alert('제목을 입력해주세요');
		form.title.focus();
		return false;
	}
	form.body.value = form.body.value.trim();
	if (form.body.value.length == 0) {
		alert('내용을 입력해주세요');
		form.body.focus();
		return false;
	}
	form.submit();

}

function modifyForm(form) {
	form.title.value = form.title.value.trim();
	if (form.title.value.length == 0) {
		alert('제목을 입력해주세요');
		form.title.focus();
		return false;
	}
	form.body.value = form.body.value.trim();
	if (form.body.value.length == 0) {
		alert('내용을 입력해주세요');
		form.body.focus();
		return false;
	}
	form.submit();

}

function joinForm(form) {
	form.loginId.value = form.loginId.value.trim();
	if (form.loginId.value.length == 0) {
		alert('아이디를 입력해주세요');
		form.loginId.focus();
		return false;
	}
	form.loginPw.value = form.loginPw.value.trim();
	if (form.loginPw.value.length == 0) {
		alert('비밀번호를 입력해주세요');
		form.loginPw.focus();
		return false;
	}
	form.loginPwCheck.value = form.loginPwCheck.value.trim();
	if (form.loginPwCheck.value.length == 0) {
		alert('비밀번호를 다시 입력해주세요');
		form.loginPwCheck.focus();
		return false;
	}
	if (form.loginPwCheck.value != form.loginPw.value) {
		alert('비밀번호가 일치하지않습니다.');
		form.loginPwCheck.value = "";
		form.loginPw.value = "";
		form.loginPw.focus();
		return false;
	}
	form.submit();

}

function loginForm(form) {
	form.loginId.value = form.loginId.value.trim();
	if (form.loginId.value.length == 0) {
		alert('로그인 아이디를 입력해주세요');
		form.loginId.focus();
		return false;
	}
	form.loginPw.value = form.loginPw.value.trim();
	if (form.loginPw.value.length == 0) {
		alert('로그인 비밀번호 입력해주세요');
		form.loginPw.focus();
		return false;
	}
}
