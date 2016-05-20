<%-- 
    Document   : footer
    Created on : May 15, 2016, 3:05:29 PM
    Author     : POONEH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer style="position: relative; width:100%;">
      <div class="container">
        <div class="row">
          <div class="col-sm-7 hover open">
            <div class="row">
              <div class="col-sm-5">
                <h4 class="greenText" > دسترسی سریع </h4>
                <a class="footerlinks" href="employers_hiringAdverts.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>درج آگهی استخدام</a>
                <a class="footerlinks" href="employers_outsourceAdverts.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>درج آگهی برون‌سپاری</a>
                <a class="footerlinks" href="search_resume.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>جستجو در رزومه‌ها</a>
                <a class="footerlinks" href="search_job.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>جستجوی کار</a>
                <a class="footerlinks" href="apply.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>ثبت رزومه</a>
                <a class="footerlinks" href="search_project.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>جستجوی پروژه</a>
                <a class="footerlinks" href="applyTeamResume.html"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>ثبت رزومه تیم</a>
              </div>
              <div class="col-sm-7">
                <h4 class="greenText" >تماس با ما</h4>
                <h5><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span> نشانی: تهران، ولنجک، دانشگاه شهید بهشتی، دانشکده مهندسی برق و کامپیوتر </h5>
                <h5><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> ۰۲۱-۸۸۵۷۶۵۶۴</h5>
                <h5><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> support@jobspotter.com</h5>
              </div>
            </div>
            <div id="menuToggle" class="row">
              بستن
              <div class="arrow bounce"></div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              منو
            </div>
          </div>
        </div>
      </div>
      <div id="map" style="position: absolute; top:0; right:0; width: 100%; height: 350px;">
      </div>
      <div class="copyright">
        <center>
          &copy;&nbsp;
          تمامی حقوق مادی و معنوی این وب سایت به نویسندگان آن تعلق دارد. ۱۳۹۵
        </center>
      </div>
    </footer>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="/js/jquery-1.12.2.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/js/bootstrap.min.js"></script>
    <!-- google map API settings -->
    <script>
    
    function ajaxLogin(email, password) {
  	  $.ajax({
  	    url: "/login",
  	    type: "POST",
  	    data: {
  	    	email: email,
  	    	password: password
  	    },
  	    cache: false,
  	    success: function (response) {
  	      alert("ajax worked response: "+ response);
  	    },
  	    error: function (xhr) {
  	      alert("communication error"+ xhr.responseText);
  	    }
  	  });
  	} // function uploadFile
    $(document).ready(function(){
      $("#menuToggle").on("click", function(){
        if($(this).closest('.hover').hasClass('open'))
          $(this).closest('.hover').removeClass('open');
        else
          $(this).closest('.hover').addClass('open');
      });
      
      $("#loginModal").on("submit", "#loginForm", function(){
    	  var email = $(this).find("#loginEmail").val();
    	  var password = $(this).find("#loginPassword").val();
    	  alert("email= "+ email+ ", password= "+ password);
    	  ajaxLogin(email, password);
      });
    });
    function initMap() {
        var faculty = {lat: 35.802270, lng: 51.393872};
        var velenjak = {lat: 35.779043, lng: 51.522369};

        var map = new google.maps.Map(document.getElementById('map'), {
          scaleControl: true,
          center: velenjak,
          zoom: 12
        });

        var infowindow = new google.maps.InfoWindow;
        infowindow.setContent('<b>دانشکده علوم و مهندسی کامپیوتر</b>');

        // var trafficLayer = new google.maps.TrafficLayer();
        // trafficLayer.setMap(map);

        var marker = new google.maps.Marker({map: map, position: faculty});
        marker.addListener('click', function() {
          infowindow.open(map, marker);
        });

        var customMapType = new google.maps.StyledMapType([{"featureType":"all","elementType":"labels","stylers":[{"visibility":"on"}]},{"featureType":"all","elementType":"labels.text.fill","stylers":[{"saturation":36},{"color":"#000000"},{"lightness":40}]},{"featureType":"all","elementType":"labels.text.stroke","stylers":[{"visibility":"on"},{"color":"#000000"},{"lightness":16}]},{"featureType":"all","elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"administrative","elementType":"geometry.fill","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"administrative","elementType":"geometry.stroke","stylers":[{"color":"#000000"},{"lightness":17},{"weight":1.2}]},{"featureType":"administrative.country","elementType":"all","stylers":[{"color":"#328120"},{"weight":"1"}]},{"featureType":"administrative.country","elementType":"labels.text.fill","stylers":[{"color":"#ffffff"}]},{"featureType":"administrative.locality","elementType":"labels.text.fill","stylers":[{"color":"#c4c4c4"}]},{"featureType":"administrative.neighborhood","elementType":"labels.text.fill","stylers":[{"color":"#328120"}]},{"featureType":"landscape","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":20}]},{"featureType":"poi","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":21},{"visibility":"on"}]},{"featureType":"poi.business","elementType":"geometry","stylers":[{"visibility":"on"}]},{"featureType":"road.highway","elementType":"geometry.fill","stylers":[{"lightness":"0"},{"color":"#328120"}]},{"featureType":"road.highway","elementType":"geometry.stroke","stylers":[{"visibility":"off"}]},{"featureType":"road.highway","elementType":"labels.text.fill","stylers":[{"color":"#ffffff"}]},{"featureType":"road.highway","elementType":"labels.text.stroke","stylers":[{"color":"#1c9d00"},{"weight":"1"}]},{"featureType":"road.arterial","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":18}]},{"featureType":"road.arterial","elementType":"geometry.fill","stylers":[{"color":"#575757"}]},{"featureType":"road.arterial","elementType":"labels.text.fill","stylers":[{"color":"#ffffff"}]},{"featureType":"road.arterial","elementType":"labels.text.stroke","stylers":[{"color":"#2c2c2c"}]},{"featureType":"road.local","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":16}]},{"featureType":"road.local","elementType":"labels.text.fill","stylers":[{"color":"#999999"}]},{"featureType":"transit","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":19}]},{"featureType":"water","elementType":"geometry","stylers":[{"color":"#000000"},{"lightness":17}]}], {
            name: 'Custom Style'
        });
        var customMapTypeId = 'custom_style';
        map.mapTypes.set(customMapTypeId, customMapType);
        map.setMapTypeId(customMapTypeId);
      }
      </script>
      <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCNTMndy93H2Bp-AWM_pvxhnbaBxrGYmKY&language=fa&callback=initMap"></script>
  </body>
</html>