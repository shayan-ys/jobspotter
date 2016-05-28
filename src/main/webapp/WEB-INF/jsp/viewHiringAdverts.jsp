<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />



<div class="container">
  <h1 class="pageHeader">آگهی استخدام</h1>

  <div class=" panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">عنوان کار</h3>
    </div>
    <div class="panel-body">
      ${ads.jobTitle}
    </div>
  </div>

<div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">محل کار</h3>
    </div>
    <div class="panel-body">
     ${ads.city} ، ${ads.ostan}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">نوع کار</h3>
    </div>
    <div class="panel-body">
       ${ads.jobType}
    </div>
  </div>
</div>

<div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">دسته بندی</h3>
    </div>
    <div class="panel-body">
       ${ads.category}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">شرح آگهی</h3>
    </div>
    <div class="panel-body">
     ${ads.description}
    </div>
  </div>
  </div>

  <div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">نام شرکت</h3>
    </div>
    <div class="panel-body">
      ${user.name}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">سایت شرکت</h3>
    </div>
    <div class="panel-body">
     ${user.site}
    </div>
  </div>
</div>


<div class="row">
  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">آدرس شرکت</h3>
    </div>
    <div class="panel-body">
     ${user.address}
    </div>
  </div>

  <div class="col-md-6 panel-success">
    <div class="panel-heading">
      <h3 class="panel-title">تلفن تماس</h3>
    </div>
    <div class="panel-body">
     ${user.phone}
    </div>
  </div>
</div>

  <div class="row">
  <div class=" panel-success  col-md-6 ">
    <div class="panel-heading">
      <h3 class="panel-title">حقوق پیشنهادی به تومان</h3>
    </div>
    <div class="panel-body">
     ${user.salary}
    </div>
  </div>

</div>

  <div class=" panel-success ourPanel">
    <div class="panel-heading">
      <h3 class="panel-title">توضیحات</h3>
    </div>
    <div class="panel-body">
      ${user.description}
    </div>
  </div>

  <div class="form-group">
    <label class="col-sm-3 control-label" for=""></label>
    <div class="col-sm-9 left">
      <button type="submit" class="greenItem btn btn-primary btn-lg">ارسال درخواست</button>
    </div>
  </div>

<br><br><br><br><br>

</div>



<jsp:include page="footer.jsp" />