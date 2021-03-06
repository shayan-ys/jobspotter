<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />



<div class="container">
  <h1 class="pageHeader">رزومه</h1>

  <div class=" panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">نام و نام خانوادگی</h3>
    </div>
    <div class="panel-body">
     ${user.name}
    </div>
  </div>

<div class="row">
 <!--   <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">تاریخ تولد</h3>
    </div>
    <div class="panel-body">
      ۱۳۷۲/۰۷/۱۸
    </div>
  </div>-->

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">جنسیت</h3>
    </div>
    <div class="panel-body">
        ${user.gender}
    </div>
  </div>
  
   <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">تخصص</h3>
    </div>
    <div class="panel-body">
       ${resume.takhasos}
    </div>
  </div>
  
</div>

<div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">عنوان شغلی</h3>
    </div>
    <div class="panel-body">
       ${resume.jobTitle}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">میزان سابقه کار</h3>
    </div>
    <div class="panel-body">
       ${resume.sabeghe}
    </div>
  </div>
  </div>

  <div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">میزان تحصیلات</h3>
    </div>
    <div class="panel-body">
       ${user.degree}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">رشته تحصیلی</h3>
    </div>
    <div class="panel-body">
        ${user.reshte}
    </div>
  </div>
</div>




  <div class="row">
  <div class=" panel-success  col-md-6 ">
    <div class="panel-heading">
      <h3 class="panel-title">شماره همراه</h3>
    </div>
    <div class="panel-body">
        ${user.phone}
    </div>
  </div>

  <div class="= panel-success  col-md-6">
    <div class="panel-heading">
      <h3 class="panel-title">پست الکترونیک</h3>
    </div>
    <div class="panel-body">
       ${user.email}
    </div>
  </div>
</div>

  <div class=" panel-success ourPanel">
    <div class="panel-heading">
      <h3 class="panel-title">توضیحات</h3>
    </div>
    <div class="panel-body">
        ${resume.description}
    </div>
  </div>

  <div class="form-group">
    <label class="col-sm-3 control-label" for=""></label>
    <div class="col-sm-9 left">
      <button type="submit" class="greenItem btn btn-primary btn-lg">دانلود رزومه</button>
    </div>
  </div>

<br><br><br><br><br>

</div>


<jsp:include page="footer.jsp" />