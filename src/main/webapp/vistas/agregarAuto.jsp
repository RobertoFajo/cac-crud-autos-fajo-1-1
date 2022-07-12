<%-- 
    Document   : agregarAuto
    Created on : 24 jun. 2022, 15:49:10
    Author     : Roberto Fajo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="modal fade" id="addAuto" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Agrega un Auto</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form id="formEditarAuto" action="${pageContext.request.contextPath}/autos?accion=add"
                  method="post" class="was-validated border p-4 rounded-3 bg-light">
                <div class="modal-body">


                    <div class="row">
                        
                        <div class="col-12 mb-3">
                            <label for="idAuto" class="form-label">ID del Auto</label>
                            <input type="text"  class="form-control" id="idAuto" name="idAuto" placeholder="ID del auto" required>
                        </div>
                            <div class="col-12 mb-3">
                            <label for="fotoAuto" class="form-label">Cargar foto</label>
                            <input type="file" class="form-control" id="foto" name="foto">
                            <%--<input type="hidden" id="fotoBase64" name="fotoBase64">--%>
                        </div>
                        <%--<div class="col-12 mb-3">
                            <label for="fotoAuto" class="form-label">Foto del Auto</label>
                            <input type="text" class="form-control" id="fotoAuto" name="fotoAuto" placeholder="Nombre del archivo de la foto" required>
                        </div>--%>
                        <div class="col-12 mb-3">
                            <label for="marcaAuto" class="form-label">Marca</label>
                            <input type="text" class="form-control" id="marcaAuto" name="marcaAuto" placeholder="Marca del Auto" required>
                        </div>
                        <div class="col-12 mb-3">
                            <label for="modeloAuto" class="form-label">Modelo</label>
                            <input type="text" class="form-control" id="modeloAuto" name="modeloAuto" placeholder="Modelo del Auto" required>
                        </div>
                        <div class="col-12 mb-3">
                            <label for="versionAuto" class="form-label">Versión</label>
                            <input type="text" class="form-control" id="versionAuto" name="versionAuto" placeholder="Versión del Auto" required>
                        </div>
                        <div class="col-12 mb-3">
                            <label for="kmAuto" class="form-label">Kilómetros recorridos</label>
                            <input type="text" class="form-control" id="kmAuto" name="kmAuto" placeholder="Kilómetros recorridos" required>
                        </div>
                        <div class="col-12 mb-3">
                            <label for="anioAuto" class="form-label">Año de fabricación</label>
                            <input type="text" class="form-control" id="anioAuto" name="anioAuto" placeholder="Año de fabricación" required>
                        </div>
                        
                    </div>


                </div>                    
                <div class="modal-footer">
                    <button class="btn btn-warning" type="submit" data-bs-dismiss="modal">Agregar</button>
                </div>
            </form>

        </div>
    </div>
</div>
                        
                       