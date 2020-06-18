$(document).ready(function () {
    var data = {
        parkingType : $('#parkingType').val(),
        parkingTypeDefault1 : function () {
            return this.parkingType == '단독주택';
        },
        parkingTypeDefault2 : function () {
            return this.parkingType == '개인 사유지';
        },
        parkingTypeDefault3 : function () {
            return this.parkingType == '공동 주택';
        },
        parkingTypeDefault4 : function () {
            return this.parkingType == '기타';
        }
    };

    var template = $("#tmpl").html();
    var result = Mustache.render(template, data);

    $("#formWrapper").html(result);

});