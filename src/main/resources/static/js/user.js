let userObject = {
    init: function () {
        let _this = this; // 뭐하는 코드지
        $("#btn-save").on("click", () => {
            _this.insertUser();
        });
    },

    insertUser: function () {
        alert("회원가입 요청됨");
        // 사용자가 입력한 값 추출
        let user = {
            username: $("#username").val(), // 제이쿼리 아이디 선택자
            password: $("#pwd").val(),
            email: $("#email").val()
        }

        // Ajax를 이용한 비동기 호출
        $.ajax({
            type: "POST",
            url: "/auth/insertUser", // 요청 경로
            data: JSON.stringify(user), // user 객체를 JSON 형식 문자열로 변환
            // HTTP의 body에 설정되는 데이터 MIME(파일 변환) 타입
            contentType: "application/json; charset=utf-8",
        }).done(function (response) { // 응답으로 들어온 JSON 데이터를 response로 받음
            console.log(response);
            location = "/";
        }).fail(function (error) {
            alert("에러 발생: " + error);
        });
    },
}

userObject.init();