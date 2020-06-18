$(document).ready(function () {
    $('#btn-scs-save').on('click', function () {

        var checkbox = [];
        $('input[name="chargeType"]:checked').each(function () {
            checkbox.push($(this).val());
        });

        // var chargeType = "";
        var chargeType = checkbox.toString();
        console.log(chargeType);
        // for(var i = 0; i=checkbox.length; i++){
        //     if(i==checkbox.length-1){
        //         chargeType += checkbox[i];
        //     } else {
        //         chargeType += checkbox[i] + ",";
        //     }
        // }

    var cable = $('input[name="cable"]:checked').val();

    var registerData = $("#registerData")[0];
    var data = new FormData(registerData);
    // data.append('cable', cable);
    // data.append('chargeType', chargeType);
    /*var data = {
        chargeName : $('#chargeName').val(),
        operation : $('#operation').val(),
        chargeSpeed: $('#chargeSpeed').val(),
        postcode : $('#postcode').val(),
        roadAddress : $('#roadAddress').val(),
        detailAddress : $('#detailAddress').val(),
        extraAddress : $('#extraAddress').val(),
        image1 : $('#image1').val(),
        image2 : $('#image2').val(),
        cable : cable,
        chargeType : chargeType
    };*/

    $.ajax({
        type : 'POST',
        url : '/scs/rest/save',
        enctype: 'multipart/form-data',
        processData: false,
        contentType: false,
        cache: false,
        data : data
    }).done(function () {
        alert("충전소 등록 완료");
        window.location.href = "/chargingStation";
    }).fail(function (error) {
        alert(JSON.stringify(error));
    });

    });
});
