<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div class="container">
    <h1 class="pageHeader">ثبت رزومه تیم</h1>



    <div class="row" id="tenant_content">
      <div class="col-md-8 col-sm-8 main-col">
        <div class="content-well">
          <form class="form-job form-horizontal" role="form" id="new_job" enctype="multipart/form-data" action="/applyTeamResume" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="uVDUUAo13Ms1qadbA8IXvd099SZgtjxMtHhkgYuc0DsrSrRvQ6byO8fLWfISChumtbqxNlFB2+PyAjb/eFd/lA==" /><div id="a_comment_body_hp_1459844241"><style type="text/css" media="screen" scoped="scoped">#a_comment_body_hp_1459844241 { display:none; }</style><label for="a_comment_body">Do not fill in this field</label><input type="text" name="a_comment_body" id="a_comment_body" /></div>
            <!--<div class="form-group">
              <label class="col-sm-3 control-label" for="name">نام تیم</label>
              <div class="col-sm-9">
                <input class="form-control" type="text" name="name" id="name" required/>
              </div>
            </div>-->
            <div class="form-group">
              <label class="col-sm-3 control-label" for="job_title">تعداد نفرات</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="teamNumber" id="job_title" required/>
              </div>
            </div>

            <!-- 

            <div class="form-group">
              <label class="col-sm-3 control-label" for="beginningDate">تاریخ شروع به کار</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="beginningDate" id="beginningDate" />
              </div>
            </div>-->

            <div class="form-group">
              <label class="col-sm-3 control-label" for="sabeghe">میزان سابقه کار</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="sabeghe" id="sabeghe" />
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="takhasos">تخصص</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="takhasos" id="takhasos" />
              </div>
            </div>
<!--  
            <div class="form-group">
              <label class="col-sm-3 control-label" for="phone_number">شماره تماس</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="phone_number" id="phone_number" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="email">پست الکترونیک</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="email" id="email" required/>
              </div>
            </div>

            <div class="form-group">
              <label class="col-sm-3 control-label" for="HowDidYouMeetUs">نحوه آشنایی با ما</label>
              <div class="col-sm-9">
                <input class="form-control" autocomplete="off" type="text" name="HowDidYouMeetUs" id="HowDidYouMeetUs" />
              </div>
            </div>
-->
            <div class="form-group">
              <label class="col-sm-3 control-label" for="description">توضیحات</label>
              <div class="col-sm-9">
                <textarea class="form-control"rows="10" cols="89" class="redactor" name="description" id="description"></textarea>
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