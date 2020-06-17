$(document).ready(function () {
    var data = {
        parkingType : $('#parkingType').val(),
        wrap : function () {
            return function (text) {
                return text.replace('value="' + this.parkingType+'"', 'value="' + this.parkingType+'" checked');
            }
        }
    };


});