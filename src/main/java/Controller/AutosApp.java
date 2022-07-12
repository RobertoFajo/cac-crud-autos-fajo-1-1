
package Controller;

import Model.Auto;
import Model.ModelHC;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author Roberto Fajo
 */
@WebServlet(name = "AutosApp", urlPatterns = {"/app"})
public class AutosApp extends HttpServlet {
    
    private final String URI_LIST = "autos.jsp";
    private ModelHC model = new ModelHC();
    private final String URI_EDIT = "vistas/modificarAuto.jsp";
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listaAutos", model.getAutos());
        request.getRequestDispatcher(URI_LIST).forward(request, response);
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println(accion);
        String reqId;
        Auto aut;
        accion = accion == null ? "" : accion;
        switch(accion) {
            case "edit":
                System.out.println("CASE EDIT");
                reqId = request.getParameter("id");
                aut = model.getAuto(reqId);
                System.out.println("CASE EDIT");
                System.out.println(aut);
                System.out.println(URI_EDIT);
                request.setAttribute("autoAEditar", aut);
                request.setAttribute("yaTieneFoto", !aut.getFoto().contains("sinFoto"));
                request.getRequestDispatcher(URI_EDIT).forward(request, response);
                System.out.println("VOLVI");
                break;
            case "remove":
                //elId = Integer.parseInt(request.getParameter("id"));
                //alu = model.getAlumno(elId);
                //request.setAttribute("alumnoABorrar", alu);
                //request.getRequestDispatcher(URI_REMOVE).forward(request, response);
                break;
            default:
                System.out.println("ESTOY EN DEFAULT");
                request.setAttribute("listaAutos", model.getAutos());
                request.getRequestDispatcher(URI_LIST).forward(request, response);
                //doGet(request, response);
                //response.sendRedirect(URI_LIST);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Auto h;
        String accion = request.getParameter("accion");
        accion = accion == null ? "" : accion;
        System.out.println(accion);
        switch (accion) {
            case "add":
                System.out.println("Parametros");
                System.out.println(request.getParameterNames());
                System.out.println("Valores");
                System.out.println(request.getParameterValues(accion));
                System.out.println("FOTO");
                System.out.println(request.getParameter("foto"));
                
                h = new Auto(request.getParameter("idAuto"));                
                autoSegunParams(h, request);
                
                model.addAuto(h);
                
                break;
            case "update":
                System.out.println("LEI CASE UPDATE");
                h = model.getAuto(request.getParameter("id"));
                System.out.println(h);
                //autoSegunParams(h, request);
                System.out.println("AUTOS EN AUTOS.JAVA");
                System.out.println(h);
                model.updateAuto(h);                
                break;
            case "delete":
                System.out.println("En AutosApp delete");
                System.out.println(request.getParameter("id"));
                model.removeAuto(request.getParameter("id"));
               
                break;
        }       
        doGet(request, response);
    }
    
    private void autoSegunParams(Auto auto, HttpServletRequest request) {
        System.out.println("Auto en autoSegunParams: ");
        System.out.println(request.getParameter("idAuto"));
        auto.setAnio(request.getParameter("anioAuto"));
        auto.setFoto(request.getParameter("foto"));
        auto.setId(request.getParameter("idAuto"));
        auto.setKm(request.getParameter("kmAuto"));
        auto.setMarca(request.getParameter("marcaAuto"));
        auto.setModelo(request.getParameter("modeloAuto"));
        auto.setVersion(request.getParameter("versionAuto"));
        
    }
    
    private void updateAuto(HttpServletRequest request){
        Auto h = model.getAuto(request.getParameter("id"));
        autoSegunParams(h, request);
        model.updateAuto(h);
        
    }
    
    private void deleteAuto(HttpServletRequest request){
        model.removeAuto(request.getParameter("id"));
    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
