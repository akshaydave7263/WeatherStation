<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
</head>
<body>
welcome ${name} 
<center>
Weather Station Center

</form>
<div id="dispData">
	<span>ID:</span> <input class="val" type = "text" />
	<button class="btn">submit</button> <br/><br/>
	<p class="disp"></p>
	
	
</div>

</body>
<script>


/*$( "#sub" ).click(function() {
	 $.ajax({
		  type: "GET",
		  dataType: "xml",
		  url:"http://localhost:8080/web/messages",
		  success: function(){
			
		     alert("success");
		     
		  }
		 });
	}); */
$(".btn").click(function() {

	
	var x = new XMLHttpRequest();
	x.open("GET", "http://localhost:8080/web/messages", true);
	x.onreadystatechange = function () {
	  if (x.readyState == 4 && x.status == 200)
	  {
	    var doc = x.responseXML;
	    console.log(doc);
	  //  console.log(doc.getElementsByTagName("messages")[0].childNodes[0].childNodes[0]);
	    //alert(doc.getElementsByTagName("messages")[0].childNodes[0]);
	    if($(".val").val() == 1){
			$("p").html(doc.getElementsByTagName("messages")[0].childNodes[0].childNodes[0]);
			$("p").append("<br/>");
			$("p").append(doc.getElementsByTagName("messages")[0].childNodes[0].childNodes[1]);
			$("p").append("<br/>");
			$("p").append(doc.getElementsByTagName("messages")[0].childNodes[0].childNodes[2]);
		
		}
	    else if($(".val").val() == 2){
			$("p").html(doc.getElementsByTagName("messages")[0].childNodes[1].childNodes[0]);
			$("p").append("<br/>");
			$("p").append(doc.getElementsByTagName("messages")[0].childNodes[1].childNodes[1]);
			$("p").append("<br/>");
			$("p").append(doc.getElementsByTagName("messages")[0].childNodes[1].childNodes[2]);
		}
		    
	  }
	  
	};
	x.send(null);

});
	

</script>
</html>
