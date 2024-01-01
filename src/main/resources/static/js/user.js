let user = {
    init: function () {
        let _this = this; // 뭐하는 코드지
        $("#btn-save").on("click", () => {
            _this.insertUser();
        });
    },

    insertUser: function () {
        alert("회원가입 요청됨");
    },
}

user.init();

// TODO: 회원가입 로직 추가