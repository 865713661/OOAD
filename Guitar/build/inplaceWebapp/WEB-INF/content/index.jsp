<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<div class="container-fluid" align=center>
	<div class="row-fluid">
		<div class="span12">
			<div class="row-fluid">
				<div class="span4">
				</div>
				<div class="span4">
					<form action="GuitarAction_search" method="post" >
						<div class="control-group">
							 <label class="control-label" >编号</label>
							<div class="controls">
								<input name="id" type="text" />
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" >品牌</label>
							<div class="controls">
								<input name="type" type="text" />
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="inputPassword">生产商</label>
							<div class="controls">
								<input name="builder" type="text" />
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="inputPassword">类型</label>
							<div class="controls">
								<input name="Model"  type="text" />
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="inputPassword">价格</label>
							<div class="controls">
								<input name="price"  type="text" />
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn">查找</button>
							</div>
						</div>
					</form>
				</div>
				<div class="span4">
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>