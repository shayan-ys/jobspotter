<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<jsp:include page="header.jsp" />
<div class="content">
      <div class="container">
        <div class="row">
          <div class="col-md-8 search-wrapper">
            <div class="row search-desc">
              <div class="well">
                برای جستجو میان کارهای موجود در بازار
              </br>
                مقادیر زیر را پر کنید و جستجو کنید تا کار مورد نظر خود را توسط سامانه ما بیابید.
              </div>
            </div>
            <div class="row search-box">
              <div class="col-md-12">
                <form method="get" accept-charset="UTF-8" action="/search/job" id="jobs-search" role="form">
                  <div class="row">
                    <div class="col-sm-6">
                      <input type="text" placeholder="عبارت جستجو" class="form-control search-input input-stacked" name="keyword">
                    </div>
                    <div class="col-sm-6">
                      <div class="form-inline province-cities">
                        <div class="form-group">
                          <label for="provinces">استان</label>
                          <select name="ostan" id="provinces" class="province form-control"></select>
                        </div>
                        <div class="form-group pull-left">
                          <label for="cities">شهر</label>
                          <select name="city" id="cities" class="city form-control"></select>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-sm-6">
                      <input class="form-control" placeholder="دسته بندی کار را انتخاب کنید..." list="browsers" name="zamine_kari">
                      <datalist id="browsers">
                        <option value="مهندسی نرم افزار یا سخت افزار"></option>
                        <option value="برنامه نویس"></option>
                        <option value="مدیریتی"></option>
                        <option value="تحلیل و طراحی"></option>
                        <option value="موبایل"></option>
                        <option value="شبکه"></option>
                        <option value="سایر"></option>
                      </datalist>
                    </div>
                    <div class="col-lg-4 col-md-3 col-sm-4">
                      <select class="form-control" name="time_type">
                        <option value="">تمامی زمان های کاری</option>
                        <option value="1">تمام وقت</option>
                        <option value="2">پاره وقت</option>
                        <option value="3">آزاد</option>
                        <option value="4">موقت</option>
                      </select>
                    </div>
                    <div class="col-lg-2 col-md-3 col-sm-2" style="margin-top: 7px; text-align: left;">
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-sm-6">
                      <label>جنسیت:</label>
                      <div class="block" style="margin-top: 7px;">
                        <input type="radio" name="gender" value="مرد"/> مرد
                        <input type="radio" name="gender" value="زن"/> زن
                        <input type="radio" name="gender" value="" /> اهمیتی ندارد
                      </div>
                    </div>
                    <div class="col-sm-12">
                      <button type="submit" class="btn btn-primary btn-search form-control">
                        <span class="glyphicon glyphicon-search"></span>
                         جستجوی کار
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            <div class="row search-result">
                <div class="jobs-list">
                  <c:forEach var="found_ad" items="${found_ads}" varStatus="status">
                  <div class="job featured">
                    <div class="row">
                      <div class="details col-sm-10 col-xs-8">
                        <div class="pull-left hidden-xs logo">
                          <a href="/jobs/255562-senior-devops-engineer-at-symphony-communication-services-llc">
                            <img border="0" src="https://d6dyoorq84mou.cloudfront.net/uploads/job/logo/255562/thumb_Symphony_Logo_12.16.2015.png" alt="SmartBear" class="img-responsive">
                          </a>
                        </div>
                        <div class="details">
                          	<div class="title"><a href="/jobs/255562-senior-devops-engineer-at-symphony-communication-services-llc">
								<p class="user_name">نام کاربر: ${found_users[status.index].name}</p>
								<p class="resume_jobTitle">عنوان شغلی: ${found_ad.jobTitle}</p>
							</a></div>
                          <div class="company">${found_users[status.index].reshte}</div>
                          <div class="location">${found_users[status.index].address}</div>
                        </div>
                      </div>
                      <div class="date col-sm-2 col-xs-4">
                        <div>${found_ad.created}</div>
						<div style="margin-top: 25px;">
							<a href="/viewHiringAdverts?id=${found_ad.id}" class="btn btn-success">مشاهده رزومه</a>
						</div>
                      </div>
                    </div>
                  </div>
                  </c:forEach>
                </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="panel panel-warning" style="margin-top: 25px;">
              <div class="panel-heading">
                <p class="panel-title">
                  لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد. در این صورت می توان امید داشت که تمام و دشواری موجود در ارائه راهکارها و شرایط سخت تایپ به پایان رسد وزمان مورد نیاز شامل حروفچینی دستاوردهای اصلی و جوابگوی سوالات پیوسته اهل دنیای موجود طراحی اساسا مورد استفاده قرار گیرد.
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
<jsp:include page="footer.jsp" />
