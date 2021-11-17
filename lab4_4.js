function checkUsername() {
  var alMsg = document.getElementById('feedback');
  if (this.value.length < 5) {
    elMsg.textContent = 'Username must be 5 characters or more';
  } else  {
    elMsg.textContent ='';
  }
}

var ulUsername = document.getElementById('Username');

alUsername.addEventListener('blur',checkUsername, false);
