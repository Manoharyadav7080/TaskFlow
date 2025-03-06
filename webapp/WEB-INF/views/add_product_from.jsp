<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>


<!-- Internal Bootstrap CSS -->
<style>
body {
	font-family: Arial, sans-serif;
	margin: 40px;
	text-align: center;
}

.container {
	max-width: 600px;
	margin: auto;
	padding: 20px;
}

.btn-back {
	background-color: orange;
	border: none;
	padding: 8px 16px;
	color: white;
	font-size: 16px;
	border-radius: 5px;
}

.btn-add {
	background-color: blue;
	border: none;
	padding: 8px 16px;
	color: white;
	font-size: 16px;
	border-radius: 5px;
}

.btn-back:hover {
	background-color: darkorange;
}

.btn-add:hover {
	background-color: darkblue;
}
</style>
</head>
<body>

	<div class="container">
		<h2>
			<b>Fill the product detail</b>
		</h2>

		<form action="handle-product" method="post">
			<div class="mb-3">
				<label class="form-label"><b>Product Name</b></label> <input
					type="text" class="form-control" name="name"
					placeholder="Enter the product name here" required>
			</div>

			<div class="mb-3">
				<label class="form-label"><b>Product Description</b></label>
				<textarea class="form-control" name="description"
					placeholder="Enter the product description" rows="3" required></textarea>
			</div>

			<div class="mb-3">
				<label class="form-label"><b>Product Price</b></label> <input
					type="number" class="form-control" name="price"
					placeholder="Enter Product Price" required>
			</div>

			<!-- Buttons -->
			<div class="container text-center">
				<a href="${pageContext.request.contextPath}/" class="btn btn-back">Back</a>
				<button type="submit" class="btn btn-add">Add</button>
			</div>

		</form>
	</div>
</body>
</html>