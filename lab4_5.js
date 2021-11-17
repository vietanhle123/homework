var msg = '<div class=\"header\"><a id=\"close\" href="#">close X</a></div>';
msg += '<div><h2>system maintenance</h2>';
msg += 'our servers are being updated between 3 and 4 a.m. ';
msg += 'during this time, there may be minor dicruptions to service.</div>';

var elNOTE = document.createElement('div');
elNOTE.setAttribute('id', 'note');
elNOTE.innerHTML = msg;
document.body.appendChild(elNOTE);

function dismissNOTE() {
  document.body.removeChild(elNOTE);
}

var elClose = document.getElementById('close');
alClose.addEventListener('click',dismissNOTE,false);
