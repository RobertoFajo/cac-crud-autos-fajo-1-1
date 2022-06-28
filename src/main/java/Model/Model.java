/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author Roberto Fajo
 */
public interface Model {
    /**
     * Devuelve la lista de autos existentes
     * @return 
     */
    public List<Auto> getAutos();
    
    /**
     * Retorna un auto por ID
     * @param id el id del auto a retornar
     * @return El auto encontrado por ID o null si no existe
     */
    public Auto getAuto(String id);
    
    /**
     * Agrega un auto al modelo
     * @param auto El auto a agregar
     * @return La cantidad de registros modificados
     */
    public int addAuto(Auto auto);
    
    /**
     * Modifica un auto del modelo
     * @param auto El auto que contiene los datos para modificar
     * @return La cantidad de registros modificados
     */
    public int updateAuto(Auto auto);
    
    /**
     * Borra un auto por ID
     * @param id el id del auto a borrar
     * @return La cantidad de registros modificados
     */
    public int removeAuto(String id);
   
}
