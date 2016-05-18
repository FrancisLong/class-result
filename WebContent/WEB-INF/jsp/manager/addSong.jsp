<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jquery  jquery.form 异步提交 -->
<script>
$(function(){
	$("#addSongForm").off();
	$("#addSongForm").on("submit",function(){
		$("#addSongForm").ajaxSubmit(function(){
			$("#addSongForm input").not(":submit").val("");
			alert("添加成功！");
		});
		
		return false;
	});
});

</script>
<h1>添加歌曲页面</h1>
<hr>
<form action="addSong.action" method="post" id="addSongForm">
	歌曲名称:<input type="text" name="name"/><br/>
	歌曲作者:<input type="text" name="author"/><br/>
	<input type="submit" value="添加"/><br/>
</form>