function checkUsername() {
  var username = el.value;
  if (username.length < 5) {
    elMsg.className = 'warning';
    aLMsg.textContent = 'not long enough, yet...';
  } else{
    elMsg.textContent = '';
  }
}

function tipUsername() {
  eLMsg.className = 'tip';
  eLMsg.innerHTML = 'Username must be at least 5 characters';
}

var el = document.getElementById('username');
var elMsg = document.getElementById('feedback');

el.addEventListener('focus', tipUsername,false);
el.addEventListener('blur', checkUsername, false);
