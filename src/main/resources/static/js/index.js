$(document).ready(function () {
    $("#indexJoin").on("click", function () { // 전체 페이지 회원가입 버튼
        window.location.href = "/join";
    });

    $("#indexLogin").on("click", function () { // 전체 페이지 로그인 버튼
        window.location.href = "/login";
    });

    $("#cancel").on("click", function () { // 회원가입 페이지 취소 버튼
        window.location.href = "/";
    });
    $("#loginPageJoin").on("click", function () { // 로그인 페이지 로그인 버튼
        window.location.href ="/join";
    });
    $('#indexLogout').on("Click", function () { // 로그아웃 버튼
        window.location.href = "/logout";
    });

    // 회원가입 버튼
    $("#join").on("click", function () {
        if($('#joinId')==null || $('#joinPassword')==null ||
            $('#joinEmail')==null || $('#joinName')==null) {
            alert("뭐하노 덜 썼다!");
            history.go(-1);
        }
        var data = {
            id : $('#joinId').val(),
            password : $('#joinPassword').val(),
            email : $('#joinEmail').val(),
            name : $('#joinName').val()
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

    // 로그인 버튼
    // $("#loginPageLogin").on("click", function () {
    //     var data = {
    //         id : $('#id').val(),
    //         password : $('#password')
    //     };
    //
    //     $.ajax({
    //        type : 'POST',
    //        url : '/rest/login',
    //        data : data
    //     }).done(function () {
    //         alert($('#id') + "님 로그인 됨!");
    //         window.location.href = "/";
    //     }).fail(function (error) {
    //         alert(JSON.stringify(error));
    //     });
    // });

});