window.onload= function() {
    var currentDate = new Date();
    var greeting = document.getElementById("greeting");
    if (currentDate.getHours() < 12){
        var greeting = document.getElementById("greeting").innerHTML = "good morning...it's " + currentDate.getHours() + ":" + currentDate.getMinutes();}
    else if (currentDate.getHours() < 17){
        var greeting = document.getElementById("greeting").innerHTML = "good afternoon...it's " + currentDate.getHours() + ":" + currentDate.getMinutes();
    }
    else{
        var greeting = document.getElementById("greeting").innerHTML = "good evening...it's " + currentDate.getHours() + ":" + currentDate.getMinutes();
    }
}