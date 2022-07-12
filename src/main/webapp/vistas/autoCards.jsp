<%-- 
    Document   : autoCards
    Created on : 21 jun. 2022, 19:13:13
    Author     : Roberto Fajo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${listaAutos.size() <= 0}">
        <h2>Agrega un auto para empezar..</h2>
    </c:when>
    <c:otherwise>
        <c:forEach items="${listaAutos}" var="auto">  
            <div class="col">
                <div class="card">
                    <div class="row">
                        <div class="col-12 col-md-12">
                            <img src="assets/${auto.foto}" class="card-img" alt="logo-auto" />
                            <h5>${auto.id}<h5>
                                
                        </div>
                        <div class="col-12 col-md-12">
                            <div class="card-body">
                                <h5 class="card-title">${auto.anio} | ${auto.km} km</h5>
                                <p class="card-text m-0">${auto.marca} | ${auto.modelo} | ${auto.version}</p>
                                
                                <div class="d-flex justify-content-around mt-2">
                                    <form action="${pageContext.request.contextPath}/app?accion=edit&id=${auto.id}" method="POST">
                                        <button type="submit" class="btn btn-warning">Actualizar</button>
                                    </form>
                                   
                                    
                                    <form action="${pageContext.request.contextPath}/app?accion=delete&id=${auto.id}" method="POST">
                                        <button type="submit" class="btn btn-danger">Borrar</button>                            
                                    </form>
                                </div>                                              
                            </div>
                        </div>
                    </div>
                </div>
            </div>
                                                 
        </c:forEach >
    </c:otherwise>
</c:choose>
