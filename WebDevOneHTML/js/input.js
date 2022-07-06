function showtext(){
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var phnum = document.getElementById("phnum").value;
    var email = document.getElementById("email").value;
    var course = document.getElementById("course").value;

    document.getElementById("show").innerHTML = fname + "<br>" + lname + "<br>"
    + phnum + "<br>" + email + "<br>" + course;


}