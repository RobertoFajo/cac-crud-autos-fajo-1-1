
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
@WebServlet(name = "AutosApp", urlPatterns = {"/autos"})
public class AutosApp extends HttpServlet {
    
    private final String URI_LIST = "autos.jsp";
    private ModelHC model = new ModelHC();
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listaAutos", model.getAutos());
        //request.setAttribute("listadoNuevosHeroes", heroesParaAgregar());
        request.getRequestDispatcher(URI_LIST).forward(request, response);
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         Auto h;
        String accion = request.getParameter("accion");
        accion = accion == null ? "" : accion;
        switch (accion) {
            case "add":
                System.out.println(request.getParameterNames());
                System.out.println(request.getParameterValues(accion));
                
                h = new Auto(request.getParameter("fotoAuto"));                
                autoSegunParams(h, request);
                model.addAuto(h);
                //request.setAttribute("listadoNuevoHeroes", heroesParaAgregar());
                break;
            case "update":
                updateAuto(request);                
                break;
            case "delete":
                model.removeAuto(request.getParameter("id"));
                //request.setAttribute("listadoNuevoHeroes", heroesParaAgregar());
                break;
        }       
        doGet(request, response);
    }
    
    private void autoSegunParams(Auto auto, HttpServletRequest request) {
        auto.setAnio(request.getParameter("anioAuto"));
        auto.setFoto(request.getParameter("fotoAuto"));
        auto.setId(request.getParameter("idAuto"));
        auto.setKm(request.getParameter("knAuto"));
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
