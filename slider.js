
$('.slider').each(function () {
  var $this = $(this);
  var $group = $this.find('.slider-group');
  var $slides = $this.find('.slider');
  var buttonArray = [];
  var currenIndex = 0;
  var timeout;

  function move(newIndex) {
    var animateLeft, slideleft;

    advance();

    if ($group.is(':animated') || currenIndex === newIndex) {
      return;
    }

    buttonArray[currenIndex].removeClass('active');
    buttonArray[newIndex].addClass('active');

    if (newIndex > currenIndex) {
      slideleft = '100%';
      animateLeft = '-100%';
    }else {
      slideleft ='-100%';
      animateLeft = '100%';
    }

    $slides.eq(newIndex).css({
      left: slideleft,
      display: 'block'
    });

    $group.animate({
      left: animateLeft
    }, function (){
      $slides.eq(currenIndex).css({
        display: 'none'
      });
      $slides.eq(newIndex).css({
        left: 0
      });
      $group.css({
        left: 0
      });
      currenIndex = newIndex;
    });
  }
  function advance() {
    clearTimeout(timeout);
    timeout = setTimeout(function () {
      if (currenIndex < ($slides.length - 1)) {
        move(currenIndex + 1);
      } else {
        move(0);
      }
    },4000);
  }
  $.each($slides, function (index) {
    var $button = $('<button type="button" class="slide-bth">&bull;</button>');
    if (index === currenIndex) {
      $button.addClass('active');
    }
    $button.on('.click',function () {
      move(index);
    }).appendTo('.slide-buttons');
    buttonArray.push($button);
  });
  advance();
});
