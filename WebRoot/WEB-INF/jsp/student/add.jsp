<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <link href="<%=basePath%>css/style.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="<%=basePath%>js/jquery.js">
	</script>
	<style type="text/css">
		.table0{
			
			margin:50px 100px;
		}
		.ftTd{
			font-size:15px;
			text-align:center;
			padding:8px 15px;
		}
	</style>
  </head>
  
  <body>
  	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="<%=basePath%>public/toWelcome.do">首页</a></li>
			<li><a href="<%=basePath%>goods/toList.do">学生信息管理</a></li>
			<li><a href="<%=basePath%>goods/toAdd.do">添加学生</a></li>
		</ul>
	</div>
	<form action="<%=basePath%>goods/add.do" method="post">
		<table border="0" class="table0">
			<tr>
				<td class="ftTd" align="left">学生姓名</td>
				<td width="50%">
					<input type="text" name="name" id="name" class="dfinput" />
				</td>
			</tr>
			
			<tr>
				<td class="ftTd" align="left">学生性别</td>
				<td width="50%">
					<input type="text" name="sex" id="sex" class="dfinput" />
				</td>
			</tr>
			<tr>
				<td class="ftTd" align="left">民族</td>
				<td width="50%">
					<input type="text" name="nation" id="nation" class="dfinput" />
				</td>
			</tr>
			<tr>
				<td class="ftTd" align="left">出生年月</td>
				<td width="50%">
					<input type="text" name="birthDate" id="birthDate" class="dfinput" />
				</td>
			</tr>
			<tr>
				<td class="ftTd" align="left">家庭住址</td>
				<td width="50%">
					<input type="text" name="homeAddress" id="homeAddress" class="dfinput" />
				</td>
			</tr>
			<tr>
				<td class="ftTd" align="left">入学时间</td>
				<td width="50%">
					<input type="text" name="entranceDate" id="entranceDate" class="dfinput" />
				</td>
			</tr>
			<tr>
				<td class="ftTd">所在班级</td>
				<td>
					<select name="classId" id="classId" class="dfinput">
						<option>---请选择---</option>
						<c:forEach items="${codeList}" var="c">
							<option value="${c.key}">${c.value}</option>
						</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td class="ftTd">所属专业</td>
				<td>
					<select name="major" id="major" class="dfinput">
						<option>--请选择--</option>
						<c:forEach items="${EWList}" var="ew">
							<option value="${ew.warehouse_id}">${ew.name}</option>
						</c:forEach>
					</select>	
				</td>
			</tr>	
			<tr>
				<td height="50px" align="right"></td>
				<td><input  type="submit" class="btn" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>