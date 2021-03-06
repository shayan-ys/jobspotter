<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div class="container">
    <h1 class="pageHeader">ثبت رزومه</h1>



    <div class="row" id="tenant_content">
      <div class="col-md-8 col-sm-8 main-col">
        <div class="content-well">
          <form class="form-job form-horizontal" role="form" id="new_job" enctype="multipart/form-data" action="/apply/edit" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="uVDUUAo13Ms1qadbA8IXvd099SZgtjxMtHhkgYuc0DsrSrRvQ6byO8fLWfISChumtbqxNlFB2+PyAjb/eFd/lA==" /><div id="a_comment_body_hp_1459844241"><style type="text/css" media="screen" scoped="scoped">#a_comment_body_hp_1459844241 { display:none; }</style><label for="a_comment_body">Do not fill in this field</label><input type="text" name="a_comment_body" id="a_comment_body" /></div>
            <div class="form-group">
              <label class="col-sm-3 control-label" for="name">نام و نام‌خانوادگی</label>
              <div class="col-sm-9">
                <input class="form-control" type="text" name="name" id="name" value="${resume.name}" required />
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="birthDate">تاریخ تولد</label>
              <div class="col-sm-9">
                <input class="form-control" type="text" name="birthDate" id="birthDate" value="${ resume.birthDate }" required/>
              </div>
            </div>   <!-- beshe dateTimePickers -->

            <div class="form-group job-types">
              <label class="col-sm-3 control-label" for="inlineRadiobuttons">جنسیت</label>
              <div class="col-sm-9">
                  <label class="radio-inline">
                  <input type="radio" name="gender" id="job_detail_ids_1" value="1" checked="checked" />
                  زن&nbsp;&nbsp;
                  </label>
                  <label class="radio-inline">
                  <input type="radio" name="gender" id="job_detail_ids_2" value="2" />
                  مرد&nbsp;&nbsp;
                  </label>

              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="job_title">عنوان شغلی</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="jobTitle" id="job_title" value="${ resume.jobTitle }" required/>
              </div>
            </div>


            <div class="form-group">
              <label class="col-sm-3 control-label" for="degree">میزان تحصیلات</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="degree" id="degree" value="${ resume.degree }" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="reshteTahsili">رشته تحصیلی</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="reshteTahsili" id="reshteTahsili" value="${ resume.reshteTahsili }" />
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="sabeghe">میزان سابقه کار</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="sabeghe" id="sabeghe" value="${ resume.sabeghe }"/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="takhasos">تخصص</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="takhasos" id="takhasos" value="${ resume.takhasos }"/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="zamineKari">زمینه کاری</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="zamineKari" id="zamineKari" value="${ resume.zamineKari }" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="phone_number">شماره همراه</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="phone_number" id="phone_number" value="${ resume.phone_number }" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="email">پست الکترونیک</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="email" id="email" value="${ resume.email }" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="HowDidYouMeetUs">نحوه آشنایی با ما</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="HowDidYouMeetUs" id="HowDidYouMeetUs" value="${ resume.HowDidYouMeetUs }"/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="description">توضیحات</label>
              <div class="col-sm-9">
                <textarea class="form-control"rows="10" cols="89" class="redactor" name="description" id="description" value="${ resume.description }">
                </textarea>
              </div>
            </div>
            <div class="form-group">
              <label class="col-sm-3 control-label"></label>
              <div class="col-sm-9">
                <div class="container-fluid groupItem">
                  <div class="col-md-6" style="margin-top:7px;">
                    <h5>   در صورتی که رزومه آماده دارید از دکمه آپلود رزومه استفاده نمایید.</h5>
                  </div>
                  <div class="col-md-6 left">
                   <!-- <input type="file" id="fileUpload" style="display: none;">
                    <label for="fileUpload" class="btn btn-success fileUpload">آپلود رزومه</label>-->

					<input type="file" id="uploadBtn" style="display: none;">
                    <label for="uploadBtn" class="btn btn-success">آپلود رزومه</label>
					<div class="row" style="margin-left:1px; margin-top:2px;">
					<input id="uploadFile" placeholder="فایل مورد نظر" disabled="disabled" style="width: 212px; border-radius:5px;" />
					</div>
				  </div>
                </div>
              </div>
            </div>

            <!-- <div class="form-group">
              <div class="col-md-3"></div>
              <div class="col-md-9 ourBtn">
                <button type="submit" class="btn btn-primary btn-lg">ثبت رزومه</button>
              </div>
            </div> -->
            <div class="form-group">
              <label class="col-sm-3 control-label" for=""></label>
              <div class="col-sm-9">
                <button type="submit" class="greenItem btn btn-primary btn-lg">ثبت رزومه</button>
              </div>
            </div>

            <!-- <div class="ourBtn offset-md-3">
              <button type="button" class="btn btn-primary btn-lg">ثبت رزومه</button>
            </div> -->
          </div>
          <!-- content-well -->
        </div>
        <!-- main-col -->
      </div>
      <!-- content -->
    </div>
    <!-- container -->
    <jsp:include page="footer.jsp" />