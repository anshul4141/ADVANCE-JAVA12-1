<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Web Application</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file="header.jsp"%>

	<div class="jumbotron text-center">
		<h1 class="display-4">Welcome To Online Result System</h1>
		<p class="lead">This is a simple hero unit, a simple
			jumbotron-style component for calling extra attention to featured
			content or information.</p>
		<hr class="my-4">
		<p>It uses utility classes for typography and spacing to space
			content out within the larger container.</p>
		<a class="btn btn-primary btn-lg" href="#" role="button">Learn
			more</a>
	</div>

	<div class="container my-5">
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<img src="https://via.placeholder.com/150" class="card-img-top"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card Title 1</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<img src="https://via.placeholder.com/150" class="card-img-top"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card Title 2</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<img src="https://via.placeholder.com/150" class="card-img-top"
						alt="...">
					<div class="card-body">
						<h5 class="card-title">Card Title 3</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn btn-primary">Go somewhere</a>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>
