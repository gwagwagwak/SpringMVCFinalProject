<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home</title>

<!-- 
<link
	href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

 -->


<!-- 부트스트랩 4 버전 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" 
		integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


<!-- 아이콘 링크 -부트스트랩3에서만 지원됨  -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 

<!--구글 아이콘 링크  -->
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">

<style>
thead {
	background-color: #ADD8E6;
	font-size: 17px;
}
</style>
</head>

<body>


<div class="container mt-3">

  <h2>Q&A</h2>
    <hr>
  <br>
  
 
  <input class="form-control" id="myInput" type="text" placeholder="Search..">
  <br>
   
  <table class="table table-sm ">
    <thead>
      <tr class="table-primary">
        <th style="width:70px">No.</th>
        <th style="width:150px">Division</th>
        <th style="width:670px">Title</th>
        <th style="width:150px">Writer</th>
        <th style="width:180px ">Date</th>
        <th style="width:50px"></th>
      
      </tr>
    </thead>
    <tbody id="myTable">
      <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
       <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
      <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
      <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
       <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
      <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr><tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
       <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
      <tr>
        <td>1</td>
        <td>비밀번호</td>
        <td>비밀번호 관련 질문입니다.</td>
        <td>rmfhwl***</td>
        <td>2019.01.11</td>
        <td><i class="glyphicon glyphicon-remove"></i></td>
      </tr>
      
       
     
    </tbody>
  </table>
 
 
 <ul class="pagination">
  <li class="page-item"><a class="page-link" href="#">Previous</a></li>
  <li class="page-item"><a class="page-link" href="#">1</a></li>
  <li class="page-item active"><a class="page-link" href="#">2</a></li>
  <li class="page-item"><a class="page-link" href="#">3</a></li>
  <li class="page-item"><a class="page-link" href="#">Next</a></li>
</ul>
  

</div>

<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>

</body>
</html>