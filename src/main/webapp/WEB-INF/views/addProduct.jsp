<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/
bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
				<p>Add products</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="newProduct" class="form-horizontal">
			<fieldset>
				<legend>Agregar producto</legend>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">Id</label>
					<div class="col-lg-10">
						<form:input id="productId" path="productId" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="name">Nombre</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitPrice">Precio</label>
					<div class="col-lg-10">
						<form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Descripción</label>
					<div class="col-lg-10"><form:textarea id="description" path="description" rows = "2"/></div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="manufacturer">Fabricante</label>
					<div class="col-lg-10">
						<form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="category">Categoria</label>
					<div class="col-lg-10">
						<form:input id="category" path="category" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitsInStock">Unidades en stock</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="unitsInOrder">Unidades en order</label>
					<div class="col-lg-10">
						<form:input id="unitsInOrder" path="unitsInOrder" type="text" class="form:input-large" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="discontinued">Descontinuado</label>
					<div class="col-lg-10">
						<form:checkbox id="discontinued" path="discontinued" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-lg-2" for="condition">Condition</label>
					<div class="col-lg-10">
						<form:radiobutton path="condition" value="New" />
						Nuevo
						<form:radiobutton path="condition" value="Old" />
						Usado
						<form:radiobutton path="condition" value="Refurbished" />
						Reconstruido
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Agregar" />
					</div>
				</div>
			</fieldset>
		</form:form>
	</section>
</body>
</html>