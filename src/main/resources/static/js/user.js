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
        console.log(user);
        // TODO: 유저 컨트롤러로 전달하는 로직 추가
    },
}

userObject.init();