<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp" />
<div class="container">
	<h1 class="pageHeader">پروفایل کارجو</h1><br>
	<div class="row" id="tenant_content">
	<div class="col-sm-3 pull-left">
	   <img id="profileimage" src="assets/img/profileimg.png" alt="your image" style="width:170px;height:187px;" />
	   <br><br>
	   <div class="row">
		   <div class="col-sm-4" style="padding-right: 13px; padding-left: 12px;">
			<input id="ImageUpload" type="file" placeholder="AddLogoPic" style="display: none; width: 100px; height: 47px; padding-top: 6px"/>
			<label for="ImageUpload" class="btn btn-success bt">آپلود عکس</label>
		   </div>
		   <div class="col-sm-4 offset-sm-4" style="padding-right: 10px;">
			<button type="button" name="removeimage" onclick="removeImage()" class="btn btn-success">حذف عکس</button>
		   </div>
	   </div>
	</div>
	<div class="col-md-8 col-sm-8 main-col">
	<div class="content-well">

	<form class="form-job form-horizontal" role="form" id="new_job" action="/profile/employee/edit" accept-charset="UTF-8" method="post">
		<input name="utf8" type="hidden" value="&#x2713;" />
		<div id="a_comment_body_hp_1459844241">
			<style type="text/css" media="screen" scoped="scoped">#a_comment_body_hp_1459844241 { display:none; }</style>
			<label for="a_comment_body">Do not fill in this field</label>
			<input type="text" name="a_comment_body" id="a_comment_body" />
		</div>
		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_fname">نام و نام خانوادگی</label>
			<div class="col-sm-9">
				<input class="form-control" type="text" name="name" id="profile_fname" value="${user.name}" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_major">رشته و مقطع تحصیلی</label>
			<div class="col-sm-9">
				<input class="form-control" type="text" name="reshte" id="profile_major" value="${user.reshte}" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="inlineRadiobuttons">
			جنسیت
			</label>
			<div class="col-sm-9 col-md-6">
				<label class="radio-inline">
					<input type="radio" name="gender" id="profile_gender_male" value="1" checked="checked" />
					مرد&nbsp;&nbsp;
					</label>
					<label class="radio-inline">
					<input type="radio" name="gender" id="profile_gender_female" value="2" />
					زن&nbsp;&nbsp;
					</label>
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_Email">ایمیل</label>
			<div class="col-sm-9">
				<input class="form-control" type="email" name="email" id="profile_Email" value="${user.email}" disabled />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_tel">تلفن همراه</label>
			<div class="col-sm-9">
				<input class="form-control" type="phone" name="phone" id="profile_tel" value="${user.phone}" />
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_location"></label>
			<div class="col-sm-9">
				<div class="row">
					<div class="col-sm-1">
						<label>استان</label>
					</div>
					<div class="col-sm-5">
						<input name="ostan" class="form-control province" value="${user.ostan}" />
					</div>
					<div class="col-sm-1">
						<label>شهر</label>
					</div>
					<div class="col-sm-5">
						<input name="city" class="city form-control" value="${user.city}" />
					</div>
				</div>
			</div>
		</div>



		<div class="form-group">
			<label class="col-sm-3 control-label" for="profile_description">توضیحات</label>
			<div class="col-sm-9">
				<textarea class="form-control" rows="10" cols="89" class="redactor" name="tozihat" id="profile_description">
				${user.tozihat}
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
						<input name="resume" type="file" id="uploadBtn" style="display: none;">
						<label for="uploadBtn" class="btn btn-success">آپلود رزومه</label>
						<div class="row" style="margin-left:1px; margin-top:2px;">
							<input id="uploadFile" placeholder="فایل مورد نظر" disabled="disabled" style="width: 212px; border-radius:5px;" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-3 control-label"></label>
			<div class="col-sm-9">
				<div class="col-md-6" style="margin-top:7px; margin-right: -15px;">
					<label class="control-label" style="text-align: right;">   از کدام آگهی ها می خواهید باخبر شوید؟اخبار مربوطه به ایمیل شما ارسال می گردد.</label>
				</div>
				<div class="col-md-6 left" style="margin-top:15px;">
					<input name="mozooKhabar" class="form-control" placeholder="موضوع خود را انتخاب نمایید..." list="categories" name="categories" value="${user.mozoo_khabar}" multiple>
					<datalist id="categories">
						<option value="تمایل ندارم" selected>
						<option value="مهندسی نرم افزار یا سخت افزار">
						<option value="برنامه نویس">
						<option value="مدیریتی">
						<option value="تحلیل و طراحی">
						<option value="موبایل">
						<option value="شبکه">
						<option value="همه">
					</datalist>
				</div>
			</div>
		</div>
	</div>

	<div class="form-group">
		<label class="col-sm-3 control-label"></label>
		<div class="col-sm-4" style="margin-right: -10px;" >
		  <input type="submit" class="btn btn-success" value="ذخیره">
		</div>
	</div>
</form>
</div>
</div>
</div>
<jsp:include page="footer.jsp" />
    