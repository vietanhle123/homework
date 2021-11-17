function getTarget(e) {
  if (!e) {
    e = window.event;
  }
  return e.target || e.srcElement;
}

function itemDone(e) {
  var target, elParent, elGrandparent;
  target = getTarget(e);

  if ( target.nodeName.toLowerCase() == "a") {
    ellistItem = target.parentNode;
    allist = ellistItem.parentNode;
    allist.removeChild(ellistItem);
  }

  if ( target.nodeName.toLowerCase() == "em") {
    ellistItem = target.parentNode.parentNode;
    allist = ellistItem.parentNode;
    allist.removeChild(ellistItem);
  }

  if (e.preventDefault) {
    e.preventDefault();
  } else {
    e.preventDefault();
    e.returnValue = false;
  }
}

var el = document.getElementById('shoppinglist');
if (el.addEventListener) {
  el.addEventListener('click',function(e) {
    itemDone(e);
  }, false);
} else {
  el.attachEvent('onclick',function (e) {
    itemDone(e);
  });
}
