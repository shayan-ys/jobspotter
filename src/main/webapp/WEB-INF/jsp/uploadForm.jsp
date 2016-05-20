<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
</head>
<body>

<!-- Upload file form -->
<form id="upload-file-form">
	<label for="upload-file-input">Upload your file:</label>
	<input id="upload-file-input" type="file" name="uploadfile" accept="*" />
</form>

<script src="js/jquery-1.12.2.min.js"></script>
<script>
	//bind the on-change event
	$(document).ready(function() {
	  $("#upload-file-input").on("change", uploadFile);
	});
	
	/**
	 * Upload the file sending it via Ajax at the Spring Boot server.
	 */
	function uploadFile() {
	  $.ajax({
	    url: "/uploadFile",
	    type: "POST",
	    data: new FormData($("#upload-file-form")[0]),
	    enctype: 'multipart/form-data',
	    processData: false,
	    contentType: false,
	    cache: false,
	    success: function () {
	      // Handle upload success
	      // ...
	    },
	    error: function () {
	      // Handle upload error
	      // ...
	    }
	  });
	} // function uploadFile
</script>
</body>
</html>
    