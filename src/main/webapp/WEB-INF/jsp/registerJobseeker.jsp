<%-- 
    Document   : registerJobseeker
    Created on : May 19, 2016, 4:56:33 PM
    Author     : negarbayati
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />
<!DOCTYPE html>


    <div class="content">
      <div class="container">
        <div class="row well">
          لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد. در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد وزمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.
        </div>
        <div class="row">
          <form action="registerJobseeker" method="post" class="form-horizontal register" id="pwd-container">
            <div class="form-group">
              <label for="username" class="col-sm-2 control-label">ایمیل</label>
              <div class="col-sm-10">
                <input name="email" type="email" class="form-control" id="username" placeholder="ایمیل">
              </div>
            </div>
            <div class="form-group">
              <label for="password" class="col-sm-2 control-label">کلمه عبور</label>
              <div class="col-sm-10">
                <input type="password" name="password" class="form-control" id="password" placeholder="کلمه عبور">
              </div>
              <div class="col-sm-offset-2 col-sm-10" style="margin-top: 7px;">
                <div class="pwstrength_viewport_progress"></div>
              </div>
            </div>
            <div class="form-group">
              <label for="password-re" class="col-sm-2 control-label">تکرار کلمه عبور</label>
              <div class="col-sm-10">
                <input type="password" name="repassword" class="form-control" id="password-re" placeholder="تکرار کلمه عبور">
                <ul class="match-error" style="display:none;"><li><span style="color: #d52929">Your passwords doesn't match</span></li></ul>
              </div>
            </div>
            <div class="form-group">
              <label for="provinces" class="col-sm-2 control-label">محل سکونت</label>
              <div class="col-sm-10">
                <div class="form-inline province-cities">
                  <div class="form-group">
                    <label for="ostan">استان</label>
                   <!-- <select id="provinces" class="province form-control"></select> -->
                   <input name="ostan" type="text" class="form-control" id="ostan" placeholder="استان">
                  </div>
                  <div class="form-group pull-left">
                    <label for="cities">شهر</label>
                    <input name="city" type="text" id="cities" class="city form-control"></input>
                  </div>
                </div>
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">ثبت نام</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>

 

  <jsp:include page="footer.jsp" />