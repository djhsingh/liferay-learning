<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<portlet:actionURL var="uplaodURL" name="uploadDocument"></portlet:actionURL>
<portlet:actionURL var="downloadURL" name="downloadFiles"></portlet:actionURL>

<b>Please Upload a Document</b>

<form action="<%=uplaodURL%>" method="post" enctype="multipart/form-data" >
	<input type="file" name="uploadedFile" id="file-upload" >
	<input type="Submit" name="Submit">
</form>

<a href="<%=downloadURL%>">Download Files</a>

<script>

	/* this function will call when page loaded successfully */
	$(document).ready(function(){

		/* this function will call when onchange event fired */
		$("#file-upload").on("change",function(){

			/* current this object refer to input element */
			var $input = $(this);

			/* collect list of files choosen */
			var files = $input[0].files;

			var filename = files[0].name;

			/* getting file extenstion eg- .jpg,.png, etc */
			var extension = filename.substr(filename.lastIndexOf("."));

			/* define allowed file types */
			var allowedExtensionsRegx = /(\.jpg|\.jpeg|\.png|\.gif)$/i;

			/* testing extension with regular expression */
			var isAllowed = allowedExtensionsRegx.test(extension);

			if(isAllowed){
				alert("File type is valid for the upload");
				/* file upload logic goes here... */
			}else{
				alert("Invalid File Type.");
				return false;
			}
		});
	});

</script>