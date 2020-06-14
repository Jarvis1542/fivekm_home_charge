$(document).ready(function () {
    $("#indexJoin").on("click", function () {
        window.location.href = "/join";
    });

    $("#indexLogin").on("click", function () {
        window.location.href = "/login";
    });

    $("#cancel").on("click", function () {
        window.location.href = "/";
    });
    $("#loginPageJoin").on("click", function () {
        window.location.href ="/join";
    });

    $("#join").on("click", function () {
        var data = {
            id : $('#id').val(),
            password : $('#password').val(),
            email : $('#email').val()
        };

        $.ajax({
            type : 'POST',
            url : '/rest/join',
           // dataType : 'json',
           // contentType : 'application/json; charset=utf-8',
            data : data
        }).done(function () {
            alert("회원 가입 완료");
            window.location.href = "/login";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    });

});