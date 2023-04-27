
setInterval(jishi, 1000);

function jishi() {
    var iTime = new Date();
    var iYear = iTime.getFullYear();
    var iMonth = iTime.getMonth();
    var iDate = iTime.getDate();
    var iDay = iTime.getDay();
    var iHour = iTime.getHours();
    var iMinute = iTime.getMinutes();
    var iSecond = iTime.getSeconds();
    var aPic = document.getElementsByClassName('timePic');
    if (iDay == '0') {
        iDay = '星期日';
    } else if (iDay == '1') {
        iDay = '星期一';
    } else if (iDay == '2') {
        iDay = '星期二';
    } else if (iDay == '3') {
        iDay = '星期三';
    } else if (iDay == '4') {
        iDay = '星期四';
    } else if (iDay == '5') {
        iDay = '星期五';
    } else {
        iDay = '星期六';
    }
    var str = iYear + '年' + (iMonth + 1) + '月' + iDate + '号' + '' + iDay + '' + ChangeTime(iHour) + ':' + ChangeTime(iMinute) + ':' + ChangeTime(iSecond);
    var strNew = ChangeTime(iHour) + '' + ChangeTime(iMinute) + '' + ChangeTime(iSecond);//转换为字符串
    for (var i = 0; i < 6; i++) {
        aPic[i].src = 'img/' + strNew.charAt(i) + '.JPG';
    }
    var myTime = document.getElementsByTagName('h1');
    myTime[0].innerHTML = str;
}

function ChangeTime(obj) {
    return obj < 10 ? ('0' + obj) : obj;
}