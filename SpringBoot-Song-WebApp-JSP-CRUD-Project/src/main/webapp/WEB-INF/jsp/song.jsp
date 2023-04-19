<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add song</title>
</head>
<body>
	<%@ include file="header.jspf"%>
	<%@ include file="navigation.jspf"%>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3 ">
				<div class="panel panel-primary">
					<div class="panel-heading">Add Song</div>
					<div class="panel-body">
						<form:form method="post" modelAttribute="song">
							<form:hidden path="id" />
							<fieldset class="form-group">
								<form:label path="songName">Song Name</form:label>
								<form:input path="songName" type="text" class="form-control"
									required="required" />
								<form:errors path="songName" cssClass="text-warning" />
							</fieldset>
							<fieldset class="form-group">
								<form:label path="singerName">Singer Name</form:label>
								<form:input path="singerName" type="text" class="form-control"
									required="required" />
								<form:errors path="singerName" cssClass="text-warning" />
							</fieldset>
							<fieldset class="form-group">
								<form:label path="movieName">Movie Name</form:label>
								<form:input path="movieName" type="text" class="form-control"
									required="required" />
								<form:errors path="movieName" cssClass="text-warning" />
							</fieldset>

							<button type="submit" class="btn btn-success">Save</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jspf"%>
</body>
</html>