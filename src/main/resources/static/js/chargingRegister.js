$(document).ready(function () {
    $('#btn-scs-save').on('click', function () {
        var chargeType = [];
        $('input[name="chargeType"]:checked').each(function () {
            chargeType.push($(this).val());
        });

    var cable = $('input[name="cable"]:checked').val();

    var data = {
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
    };

    console.log(data);

    $.ajax({
        type : 'POST',
        url : '/scs/rest/save',
        data : data
    }).done(function () {
        alert("충전소 등록 완료");
        window.location.href = "/chargingStation";
    }).fail(function (error) {
        alert(JSON.stringify(error));
    });

    });
});