<html>
<head>
<%@ include file="./base.jsp"%>
</head>
<body>
	<div class="container">
		<h2 class="text-center my-4">Welcome to Product App</h2>

		<table class="table  ">
			<thead class="thead-dark">
				<tr>
					<th>S.No.</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${products}" var="p">
					<tr>
						<td>ABMs${p.id}</td>
						<td>${p.name}</td>
						<td>${p.description}</td>
						<td class="font-weight-bold">&#x20B9;${p.price}</td>
						<td>
						    <a href="delete/${p.id}"><i class="fa-solid fa-trash text-danger"></i></a>
						      &nbsp;
						    <a href="update/${p.id}"><i class="fa-solid fa-pen-to-square text-primary"></i></a>
						</td>
					
						
						
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
	<div class="ontainer text-center">
		<a href="${pageContext.request.contextPath}/add-product"
			class="btn btn-outline-success ">Add Product</a>
	</div>
</body>
</html>