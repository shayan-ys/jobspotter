<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div class="container">
    <div class="row" id="tenant_content">
		<div class="col-md-8 col-sm-8 main-col">
			<div class="content-well">
				<ul class="breadcrumb">
					<li class="active">خدمات کارفرمایان</li>
					<span class="divider"> > </span>
					<li>درج آگهی برون‌سپاری</li>
				</ul>
				<form class="form-job form-horizontal" role="form" id="new_job" enctype="multipart/form-data" action="/employersOutsourceAdverts" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="uVDUUAo13Ms1qadbA8IXvd099SZgtjxMtHhkgYuc0DsrSrRvQ6byO8fLWfISChumtbqxNlFB2+PyAjb/eFd/lA==" /><div id="a_comment_body_hp_1459844241"><style type="text/css" media="screen" scoped="scoped">#a_comment_body_hp_1459844241 { display:none; }</style><label for="a_comment_body">Do not fill in this field</label><input type="text" name="a_comment_body" id="a_comment_body" /></div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_project_title">عنوان پروژه</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" name="outsource[project_title]" id="outsource_project_title" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="inlineRadiobuttons">
						دسته بندی
					</label>
					<div class="col-sm-9 col-md-6">
						<input class="form-control" placeholder="دسته بندی کار را انتخاب کنید..." list="categories" name="categories">
						<datalist id="categories">
							<option value="برنامه نویسی وب">
							<option value="برنامه نویسی اندروید">
							<option value="سخت افزاری">
							<option value="شبکه">
							<option value="تحلیل و طراحی">
							<option value="سایر">
						</datalist>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_proficiency">تخصص لازم</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" name="outsource[proficiency]" id="outsource_proficiency" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_deadline">زمان تحویل پروژه به شرکت</label>
					<div class="col-sm-9">
						<input class="form-control" type="date" name="outsource[deadline]" id="outsource_deadline" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-3 control-label" for="job_description">شرح آگهی</label>
					<div class="col-sm-9">
						<textarea class="form-control" rows="10" cols="89" class="redactor" name="job[description]" id="job_description"></textarea>
					</div>
				</div>
<!--  
				<div class="form-group">
					<label class="col-sm-3 control-label" for="job_company">نام شرکت</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" name="job[company]" id="job_company" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="job_company_url">سایت شرکت</label>
					<div class="col-sm-9">
						<input class="form-control" type="text" name="job[company_url]" id="job_company_url" />
					</div>
				</div>

				<div class="form-group optional">
					<label class="col-sm-3 control-label" for="outsource_company_logo">لوگوی شرکت</label>
					<div class="col-sm-9">
						<div class="row">
							<div class="col-sm-6" style="width: 310px;">
								<input type="file" id="uploadBtn" style="display: none;">
								<label for="uploadBtn" class="btn btn-success">آپلود لوگو</label>
								<div style="margin-top:3px;">
									<input id="uploadFile" placeholder="فایل مورد نظر" disabled="disabled" style="width: 212px; border-radius:5px;" />
								</div>
							</div>
							<div class="col-sm-3" >
								<img id="image_upload_preview" src="assets/img/choosefile.png" alt="your image" style="width:79px;height:73px;" />
							</div>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_apply_email">ایمیل برای دریافت درخواست ها</label>
					<div class="col-sm-9">
						<div class="form-group optional apply-email">
							<div class="col-sm-12">
								<input class="form-control" placeholder="you@example.com" type="text" name="outsource[apply_email]" id="outsource_apply_email" />
								<span id="helpBlock" class="help-block"><small>درخواست های کارجویان به این ایمیل ارسال می گردد.</small></span>
							</div>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_company_address">آدرس شرکت</label>
					<div class="col-sm-9">
						<div class="form-group optional company_address">
							<div class="col-sm-12">
								<input class="form-control" type="text" name="outsource[company_address]" id="outsource_company_address" />
							</div>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_company_phone">تلفن تماس</label>
					<div class="col-sm-9">
						<div class="form-group optional company_phone">
							<div class="col-sm-12">
								<input class="form-control" placeholder="021-44444444" type="text" name="outsource[company_phone]" id="outsource_company_phone" />
							</div>
						</div>
					</div>
				</div>
-->
				<div class="form-group">
					<label class="col-sm-3 control-label" for="outsource_salary">حقوق پیشنهادی به تومان</label>
					<div class="col-sm-9">
						<div class="form-group optional salary">
							<div class="col-sm-12">
								<input class="form-control" type="text" name="outsource[salary]" id="outsource_salary" />
							</div>
						</div>
					</div>
				</div>
			</div>

		<div class="form-group">
			<label class="col-sm-3 control-label"></label>
			<div class="col-sm-4" style="margin-right: -10px;" >
				<input type="submit" class="btn btn-success" value="ثبت آگهی">
			</div>
		</div>
</div>
</div>
</div>
<jsp:include page="footer.jsp" />