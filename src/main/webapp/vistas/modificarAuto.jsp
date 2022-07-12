<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../comunes/inicioHTML.jsp" />
<jsp:include page="../comunes/inicioHEAD.jsp" />
<%--<title>Editando a ${autoAEditar.descripcionAuto}</title>--%>
<title>Editando a</title>
<jsp:include page="../comunes/finHEAD.jsp" />
<jsp:include page="navbar.jsp" />

<section class="py-3">
    <div class="container">
        <div class="row">
            <p class="lead">Estás a punto de editar a ${autoAEditar.marca} | ${autoAEditar.modelo} | ${autoAEditar.version}. Asegurate de hacer click en "Confirmar cambios".</p>
        </div>
    </div>   
</section>
<div class="container px-4 mt-3">
    <div class="row align-items-center">
        <div class="col-md-5 col-lg-4" >
            <div class="card border p-4 rounded-3 bg-light">
                
                <img class="card-img-top" src="assets/${autoAEditar.foto}"" alt="Foto de ${autoAEditar.marca} | ${autoAEditar.modelo} | ${autoAEditar.version}" />
                <div class="card-body pb-0">
                    <div class="text-center">
                        <h5 class="fw-bolder">${autoAEditar.marca} | ${autoAEditar.modelo} | ${autoAEditar.version}</h5>
                        <p class="mb-1">${autoAEditar.anio} (${autoAEditar.km} kilómetros)</p>                          
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-7 col-lg-8" >
            
            <form id="formAgregarAuto" action="${pageContext.request.contextPath}/app?accion=edit&id=${autoAEditar.id}"
                method="post" class="was-validated border p-4 rounded-3 bg-light">
                <div class="row">
                    <div class="col-sm-6 mb-3">
                        <label for="nombre" class="form-label">Marca</label>
                        <input type="text" class="form-control" id="marcaAuto" name="marca" value="${autoAEditar.marca}" required>
                    </div>
                    <div class="col-sm-6 mb-3">
                        <label for="modelo" class="form-label">Modelo</label>
                        <input type="text" class="form-control" id="modeloAuto" name="modelo" value="${autoAEditar.modelo}" required>
                    </div>
                    <div class="col-sm-6 mb-3">
                        <label for="version" class="form-label">Versión</label>
                        <input type="text" class="form-control" id="versionAuto" name="version" value="${autoAEditar.version}" required>
                    </div>
                    <div class="col-sm-6 mb-3">
                        <label for="anio" class="form-label">Año</label>
                        <input type="text" class="form-control" id="anioAuto" name="anio" value="${autoAEditar.anio}" required>
                    </div>
                    <div class="col-sm-6 mb-3">
                        <label for="km" class="form-label">Km recorridos</label>
                        <input type="text" class="form-control" id="kmAuto" name="km" value="${autoAEditar.km}" required>
                    </div>
                    <div class="col-12 mb-3">
                        <label for="foto" class="form-label">
                            <c:choose>
                                <c:when test="${yaTieneFoto}">Modificar</c:when>
                                <c:otherwise>Agregar</c:otherwise>
                            </c:choose>
                            foto
                        </label>
                        <input type="file" class="form-control" id="inputFoto" name="foto">
                        <%--<input type="hidden" id="fotoBase64" name="fotoBase64" value="${alumnoAEditar.foto}}">--%>
                    </div>
                </div>
                <div class="row justify-content-end mt-2">
                    <div class="col-12">
                       <div class="float-end">
                            <a href="${pageContext.request.contextPath}/app" class="btn btn-secondary">Volver atrás</a>
                            <button type="submit" class="btn btn-warning">Confirmar cambios</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        
    </div>
    
</div>

<%--<section class="py-3">
    <div class="container">
        <div class="row">
            <h1 class="h3">Editando alumno</h1>
            <p class="lead">Estás a punto de editar a ${alumnoAEditar.nombreCompleto}. Asegurate de hacer click en "Confirmar cambios".</p>
        </div>
    </div>
    <div class="container px-4 mt-3">
        <div class="row align-items-center">
            <div class="col-md-5 col-lg-4" >
                <div class="card border p-4 rounded-3 bg-light">
                    <img class="card-img-top" src="${alumnoAEditar.foto}" alt="Foto de ${alumnoAEditar.nombreCompleto}" />
                    <div class="card-body pb-0">
                        <div class="text-center">
                            <h5 class="fw-bolder">${alumnoAEditar.nombreCompleto}</h5>
                            <p class="mb-1">${alumnoAEditar.fechaNacimiento} (${alumnoAEditar.edad} años)</p>
                            <ins>${alumnoAEditar.mail}</ins>                           
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-7 col-lg-8" >
                <form id="formAgregarAlumno" action="${pageContext.request.contextPath}/app?accion=update&id=${alumnoAEditar.id}"
                      method="post" class="was-validated border p-4 rounded-3 bg-light">
                    <div class="row">
                        <div class="col-sm-6 mb-3">
                            <label for="nombre" class="form-label">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" value="${alumnoAEditar.nombre}" required>
                        </div>
                        <div class="col-sm-6 mb-3">
                            <label for="apellido" class="form-label">Apellido</label>
                            <input type="text" class="form-control" id="apellido" name="apellido" value="${alumnoAEditar.apellido}" required>
                        </div>
                        <div class="col-sm-6 mb-3">
                            <label for="mail" class="form-label">Mail</label>
                            <input type="text" class="form-control" id="mail" name="mail" value="${alumnoAEditar.mail}" required>
                        </div>
                        <div class="col-sm-6 mb-3">
                            <label for="fechaNac" class="form-label">Fecha de nacimiento</label>
                            <input type="date" class="form-control" id="fechaNac" name="fechaNac" value="${alumnoAEditar.fechaNacimiento}" required>
                        </div>

                        <div class="col-12 mb-3">
                            <label for="foto" class="form-label">
                                <c:choose>
                                    <c:when test="${yaTieneFoto}">Modificar</c:when>
                                    <c:otherwise>Agregar</c:otherwise>
                                </c:choose>
                                foto
                            </label>
                            <input type="file" class="form-control" id="inputFoto" name="foto">
                            <input type="hidden" id="fotoBase64" name="fotoBase64" value="${alumnoAEditar.foto}}">
                        </div>
                    </div>
                    <div class="row justify-content-end mt-2">
                        <div class="col-12">
                            <div class="float-end">
                                <a href="${pageContext.request.contextPath}/app" class="btn btn-secondary">Volver atrás</a>
                                <button type="submit" class="btn btn-warning">Confirmar cambios</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>--%>
<jsp:include page="footer.jsp" />
<jsp:include page="../comunes/finHTML.jsp" />
