
<html>
<head>
    <%@ include file="./base.jsp" %>
</head>
<body>
    <div class="container">
        <h2 class="text-center my-4">Update Product</h2>

        <!-- Update Product Form -->
        <form action="${pageContext.request.contextPath}/update-product" method="post">
            
            <!-- Hidden field to store Product ID -->
            <input type="hidden" name="id" value="${product.id}">

            <div class="mb-3">
                <label class="form-label">Product Name</label>
                <input type="text" class="form-control" name="name" value="${product.name}" required>
            </div>

            <div class="mb-3">
                <label class="form-label">Product Description</label>
                <textarea class="form-control" name="description" rows="3" required>${product.description}</textarea>
            </div>

            <div class="mb-3">
                <label class="form-label">Product Price</label>
                <input type="number" class="form-control" name="price" value="${product.price}" required>
            </div>

            <div class="text-center">
                <a href="${pageContext.request.contextPath}/" class="btn btn-secondary">Back</a>
                <button type="submit" class="btn btn-primary">Update Product</button>
            </div>

        </form>
    </div>
</body>
</html>