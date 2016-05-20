<%-- 
    Document   : header
    Created on : May 15, 2016, 3:04:25 PM
    Author     : POONEH
--%>

<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="description" content="JobSpotter, trending job find solution for job seekers and business owners">
    <meta name="keywords" content="job, work, spot, spotter, spotters, find, seek, seekers, business, owner, owners, trend">
    <meta name="author" content="shayan_ys@outlook.com, negar.baiati@yahoo.com, Pooneh">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Job Spotter</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/bootstrap-rtl.min.css" />

    <%--<link href="<c:url value='/jsp/css/bootstrap.min.css' />" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-rtl.min.css" rel="stylesheet">
    <link href="css/bouncing.css" rel="stylesheet">
    <link href="<c:url value='/jsp/css/bootstrap-rtl.min.css' />" rel="stylesheet">--%>

    <!-- Custom styles -->
    <link 
        rel="stylesheet"
        type="text/css"
        href="/css/bouncing.css" />

    <%--<link href="css/style.css" rel="stylesheet">--%>
    <link rel="stylesheet" href="/css/style.css" />

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>

        <!--header-->
        <!-- Modals -->
        <div id="loginModal" class="modal fade" tabindex="-1" role="dialog">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">ورود</h4>
              </div>
              <div class="modal-body">
                <form id="loginForm" action="/" method="post" class="form-horizontal">
                  <div class="form-group">
                    <label for="loginEmail" class="col-sm-2 control-label">ایمیل</label>
                    <div class="col-sm-10">
                      <input name="email" type="email" class="form-control" id="loginEmail" placeholder="Email">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="loginPassword" class="col-sm-2 control-label">رمز عبور</label>
                    <div class="col-sm-10">
                      <input name="password" type="password" class="form-control" id="loginPassword" placeholder="Password">
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> مرا به خاطر بسپار
                        </label>
                      </div>
                    </div>
                  </div>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">انصراف</button>
                <button type="submit" class="btn btn-success">وارد شدن</button>
              </div>
              </form>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        <div id="registerModal" class="modal fade" tabindex="-1" role="dialog">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">ثبت نام</h4>
              </div>
              <div class="modal-body">
                <a href="registerJobseeker.html" class="btn btn-success">کار جویان</a>
                <a href="registerJobowners.html" class="btn btn-success">صاحبان کار</a>
                <a href="registerTeams.html" class="btn btn-success">تیم های کاری</a>
              </div>
            </div><!-- /.modal-content -->
          </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->

        <div class="container">
          <div class="row">
            <div class="col-sm-3 logoPic ">
              <a href="#"><img src="img/logo/js.png" width=110 /></a>
            </div>

            <div class="col-sm-4 pull-left searchToolbar" >
          <div class="input-group">
            <input type="text" class="form-control" placeholder="جستجو...">
            <span class="input-group-btn">
              <button class="btn btn-default greenItem" type="button"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
            </span>
          </div><!-- /input-group -->
        </div><!-- /.col-lg-6 -->

      </div>

    </div>



    <nav class="navbar navbar-default main-menu">

      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">JobSpotter</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav">
            <li><a href="index.html">خانه</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">خدمات کارفرمایان <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="employers_hiringAdverts.html">درج آگهی استخدام</a></li>
                <li><a href="employers_outsourceAdverts.html">درج آگهی برون‌سپاری</a></li>
                <li><a href="search_resume.html">جستجو در رزومه‌ها</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">خدمات کارجویان <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="search_job.html">جستجوی کار</a></li>
                <li><a href="apply.html">ثبت رزومه</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">خدمات تیم های کاری <span class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="search_project.html">جستجوی پروژه</a></li>
                <li><a href="applyTeamResume.html">ثبت رزومه</a></li>
              </ul>
            </li>
            <li><a href="contactus.html">تماس با ما</a></li>
          </ul>
     <c:choose>
    <c:when test="${userId!='false'}">
        
          
          <ul class="nav navbar-nav navbar-left">
            <li><a href="employee_profile.html">پروفایل&nbsp;<span class="glyphicon glyphicon-user" aria-hidden="true"></span></a></li>
            <li><a href="logOut">خروج</a></li>
          </ul>
         
           </c:when>    
	
  <c:otherwise>
     <ul class="nav navbar-nav navbar-left">
            <li><a style="cursor:pointer;" data-toggle="modal" data-target="#loginModal">ورود</a></li>
            <li><a style="cursor:pointer;" data-toggle="modal" data-target="#registerModal">ثبت نام</a></li>
          </ul>
           
       </c:otherwise>
</c:choose>
    
		


        </div><!-- /.navbar-collapse -->
      </div><!-- /.container-fluid -->
    </nav>
<!--end header-->

