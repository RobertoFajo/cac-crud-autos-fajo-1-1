4<!DOCTYPE html>
<jsp:include page="comunes/inicioHTML.jsp" />
<jsp:include page="comunes/inicioHEAD.jsp" />
<jsp:include page="comunes/finHEAD.jsp" />
    <body>
        <jsp:include page="vistas/navbar.jsp" />
        <div class="container-fluid p-4">
            <h1 class="text-center">Coleccion de Autos</h1>
            <p class="text-center fs-5">
                Esta aplicación fur desarrollada para un coleccionista de Autos.  
            </p>
            <p class="fw-bold text-center">¡Veamos de que se trata!</p>
            <div class="d-flex justify-content-center">
                <a class="btn btn-secondary" href="${pageContext.request.contextPath}/autos">Ir a la app</a>
            </div>
        </div>
        <div class="position-fixed bottom-0 w-100 bg-dark d-flex justify-content-center align-items-center text-white" style="height: 45px; ">
            <i class="fa-solid fa-copyright"></i>
            <h5 class="mx-2 my-0">Creado por Roberto Fajo en Junio de 2022 para el programa de Codo a Codo
               
            </h5>
        </div>
    </body>
<jsp:include page="comunes/finHTML.jsp" />
