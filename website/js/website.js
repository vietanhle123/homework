var LOGIN_API = "https://music-i-like.herokuapp.com/api/v1/accounts/authentication";
var btnSubmit = document.getElementById("btn-summit");
if (btnSubmit != null) {
  btnSubmit.onclick = function () {
    loginHandle();
  }
}
function loginHandle() {

  var fullName = document.getElementById('fullName').value;
  var email = document.getElementById('Email').value;
  var phone = document.getElementById('phone').value;
  var Gender = document.getElementById('Gender-form').value;
  var Hobby = document.getElementById('Hobby').value;

  var obj = {
    "data": {
      "type": "Register user information",
      "attributes": {
        "fullName" : fullName,
        "email": email,
        'phone': phone,
        'gender': Gender,
        'Hobby' : Hobby
      }
    }
  }

  var xhr = new XMLHttpRequest();
  xhr.open("POST", LOGIN_API, true);
  xhr.send(JSON.stringify(obj));
  xhr.onreadystatechange = function () {
    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
      var responseObject = JSON.parse(xhr.responseText);
      localStorage.setItem("access_token", responseObject.data.attributes.accessKey);
    } else {
      if (xhr.readyState === XMLHttpRequest.DONE) {
        var responseObject = JSON.parse(xhr.responseText);
        responseObject.errors[0].detail;
      }
    }
  }
}
