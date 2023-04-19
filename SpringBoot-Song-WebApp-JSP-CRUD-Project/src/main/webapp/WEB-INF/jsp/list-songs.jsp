<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Songs list</title>
</head>
<body>

	<%@ include file="header.jspf"%>
	<%@ include file="navigation.jspf"%>

	<div class="container">


		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 align="center">List of Songs</h3>
			</div>
			<div class="panel-body">
				<table class="table table-striped">
					<thead>
						<tr>
							<th width="25%">Song Name</th>
							<th width="25%">Singer Name</th>
							<th width="25%">Movie Name</th>
							<th width="25%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${songs}" var="songs">
							<tr>
								<td>${songs.songName}</td>
								<td>${songs.singerName}</td>
								<td>${songs.movieName}</td>
								<td><a type="button" class="btn btn-primary"
									href="/update-song?id=${songs.id}">Update</a> <a type="button"
									class="btn btn-danger" href="/delete-song?id=${songs.id}">Delete</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>


			</div>

		</div>

	</div>
	<div align="center">
		<br> <a type="button" class="btn btn-primary btn-lg"
			href="/add-song">Add Song</a>
	</div>
	<%@ include file="footer.jspf"%>
</body>
</html>