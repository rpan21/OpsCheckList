<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.12.0/semantic.min.css" />
<style>
.switch {
  position: relative;
  display: inline-block;
  width: 60px;
  height: 34px;
}

.switch input {display:none;}

.slider {
  position: absolute;
  cursor: pointer;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: #ccc;
  -webkit-transition: .4s;
  transition: .4s;
}

.slider:before {
  position: absolute;
  content: "";
  height: 26px;
  width: 26px;
  left: 4px;
  bottom: 4px;
  background-color: white;
  -webkit-transition: .4s;
  transition: .4s;
} 
input:checked + .slider {
  background-color: #2196F3;
}

input:focus + .slider {
  box-shadow: 0 0 1px #2196F3;
}

input:checked + .slider:before {
  -webkit-transform: translateX(26px);
  -ms-transform: translateX(26px);
  transform: translateX(26px);
}

/* Rounded sliders */
.slider.round {
  border-radius: 34px;
}

.slider.round:before {
  border-radius: 50%;
} 
</style>
<script>
var arr=${message};
var checklist=JSON.stringify(arr.checklist);
var node1=JSON.stringify(arr.checklist["Type Of Functional Scope Being Delivered? "]);
var node2=JSON.stringify(arr.checklist["Infrastructre and Release "]);
var node3=JSON.stringify(arr.checklist["Alerting "]);
var length=JSON.stringify(arr.checklist["Type Of Functional Scope Being Delivered? "].length);
var length1=JSON.stringify(arr.checklist["Infrastructre and Release "].length);
var length2=JSON.stringify(arr.checklist["Alerting "].length);
</script>

</head>
<body>
<div class="ui page grid">
      <div class="wide column">
        <h1 class="ui header aligned center">OPS-Checklist
        </h1>
        <div class="ui divider hidden">
        </div>
      </div>
    </div>

<script type="text/javascript">
function createNewCheckboxt(){
	var x = document.createElement("INPUT");
    x.setAttribute("type", "checkbox");
    x.setAttribute("value", "abc");
    x.setAttribute("name", "xyz");
    document.getElementById("formId").appendChild(x);
}
</script>


<div class="ui segment">
  <div class="ui button aligned center teal" id="create_pdf">Create PDF
  </div>
  <div class="ui divider">
  </div>
  <form class="ui form" id="formId">
 
<script type="text/javascript">
document.write("<h3>Type Of Functional Scope Being Delivered?</h3>");
	for(count=0;count < length; count++){
		createNewCheckboxt();
	document.write(JSON.stringify(arr.checklist["Type Of Functional Scope Being Delivered? "][count]).replace(/['"]+/g, ''));
	document.write("<br />");
	}
	
	document.write("<hr>");
	
	document.write("<h3>Infrastructre and Release</h3>");
			for(count1=0;count1 < length1; count1++){
				createNewCheckboxt();
			     document.write(JSON.stringify(arr.checklist["Infrastructre and Release "][count1]).replace(/['"]+/g, ''));
		         document.write("<br />");    
		 }
		
			document.write("<hr>");
			document.write("<h3>Alerting</h3>");
			for(count2=0;count2 < length2; count2++){
				createNewCheckboxt();
	    		document.write(JSON.stringify(arr.checklist["Alerting "][count2]).replace(/['"]+/g, ''));
	    		
	    		document.write("<br />");
	      }
			document.write("<hr>");
	</script>
</form>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js">
    </script>
    <script type="text/javascript" src="//cdn.rawgit.com/MrRio/jsPDF/master/dist/jspdf.min.js">
    </script>
    <script type="text/javascript" src="//cdn.rawgit.com/niklasvh/html2canvas/0.5.0-alpha2/dist/html2canvas.min.js">
    </script>
    <script type="text/javascript" src="app.js">
    </script>
    
<!-- <h1 class="header">Type Of Functional Scope Being Delivered?</h1>
<label class="switch">
	<input type="checkbox">
	<script type="text/javascript">
	for(count=0;count < length; count++){
	document.write(JSON.stringify(arr.checklist["Type Of Functional Scope Being Delivered? "][count]).replace(/['"]+/g, ''));
    document.write("<br />");
}
	</script>
    <div class="slider round"></div> 
</label>

             -->
              <!-- <script>
              
for(count=0;count < length; count++){
	document.write(JSON.stringify(arr.checklist["Type Of Functional Scope Being Delivered? "][count]).replace(/['"]+/g, ''));
    document.write("<br />");
}

document.write("<hr>");

      for(count1=0;count1 < length1; count1++){
	     document.write(JSON.stringify(arr.checklist["Infrastructre and Release "][count1]).replace(/['"]+/g, ''));
         document.write("<br />");
    
 }
      
      for(count2=0;count2 < length2; count2++){
    		document.write(JSON.stringify(arr.checklist["Alerting "][count2]).replace(/['"]+/g, ''));
    		document.write("<br />");
      }
                </script> -->




 

 
<!-- for(count2=0;count2 < length2; count2++){
	document.write(JSON.stringify(arr.checklist["Alerting "][count2]).replace(/['"]+/g, ''));
    document.write("<br />");
 } -->


</body>
</html>