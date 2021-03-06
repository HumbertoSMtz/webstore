<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;
charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/
bootstrap.min.css">
<title>Productos</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Productos</h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<strong>Item Code : </strong><span class="label label-warning">${product.productId}</span>
				</p>
				<p>
					<strong>Fabricante</strong> : ${product.manufacturer}
				</p>
				<p>
					<strong>Categoria</strong> : ${product.category}
				</p>
				<p>
					<strong>Cantidad disponible </strong> : ${product.unitsInStock}
				</p>
				<h4>${product.unitPrice}MX</h4>
				<p>
					<a href="<spring:url value="/products" />" class="btn btndefault">
						<span class="glyphicon-hand-left glyphicon"></span> back
					</a> <a href="#" class="btn btn-warning btn-large"> <span
						class="glyphicon-shopping-cart glyphicon"> </span> Pedir ahora
					</a>
				</p>
			</div>
		</div>
	</section>
</body>
</html>