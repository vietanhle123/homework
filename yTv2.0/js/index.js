document,addEventListener("DOMContentLoaded", function (event) {
  var inputSearch = document.getElementById("Keyword");
  inputSearch.onkeydown = function (event) {
    if (event.keyCode == 13) {
      loadVideo(this.value);
    }
  }
  loadVideo("Đen Vâu");
});

var modal = document.getElementById('myModel');

var span = document.getElementsByClassName("close")[0];

var videoFrame = document.getElementById("video-frame");

span.onclick = function () {
  closeVideo();
}

window.onclick = function (event) {
  if (event.target == modal) {
    closeVideo();
  }
}

function loadVideo(Keyword){
  var YOUTUBE_API = "https://content.googleapis.com/youtobe/v3/search?q=" + Keyword +"&type=video&maxResults=9&part=snippet&key=AIzaSyAwUjk3CwtXCiB_W6XI0colfOKPgm90Hc";
  var xhr = new XMLHttpRequest();
  xhr.open("GET",YOUTUBE_API,true);
  xhr.onreadystatechange = function () {
    if(this.readyState == 4 && this.status == 200) {
      var responseJson = JSON.parse(this.responseText);
      var htmlContent = "";

      for (var i = 0,i < responseJson.items.length; i++) {
        if (responseJson.items[i].id.Kind == 'youtube#channel'){
          continue;
        }

        var videoId = responseJson.items[i].id.videoId;
        var videoTitle = responseJson.items[i].snippet.title;
        var videoDescription = responseJson.items[i].snippet.description;
        var videoThumbnail = responseJson.items[i].snippet.thumbnails.medium.url;
        htmlContent += '<div class="video" onclick="showVideo(\'' + videoId +'\')">'
          htmlContent += '<div src="' + videoThumbnail + '">'
          htmlContent += '<div class="title">' + videoTitle +'</div>'
        htmlContent += '</div>'
      }
      document.getElementById("list-video").innerHTML = htmlContent;
    }else if (this.readyState == 4){
      console.log("Fails");
    }
  };
  xhr.send();
}

function closeVideo(){
  modal.style.display = "none";
    videoFrame.src = "";
}

function showVideo(videoId) {
  videoFrame.src = "https://www.youtube.com.embed/" + videoId + "?autoplay=1";
  setTimeout(function (){
    modal.style.display = "block";
  }, 300);
}
