$(document).ready(function () {
    $('#map1Btn').on('click', function () {
        var data = {
            lat : $('#latt').val(),
            lng : $('#lngg').val()
        };
        alert("lat : " + data.lat);
        alert("lng : " + data.lng);

        $.ajax({
            type : 'get',
            url : '/rest/map/map1',
            data : data
        }).done(function () {
            alert("전달 완료");
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    });
});