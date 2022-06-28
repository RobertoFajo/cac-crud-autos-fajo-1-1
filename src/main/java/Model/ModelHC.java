/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseg
 */
public class ModelHC implements Model {

    private List<Auto> listaAutos;
    

    public ModelHC() {
        this.listaAutos = new ArrayList<>();
        crearAutos();
        
    }

    @Override
    public List<Auto> getAutos() {
        return new ArrayList(this.listaAutos); // Copia de la lista original
    }

    @Override
    public Auto getAuto(String id) {
        int i = 0;
        Auto encontrado = null;
        while (i < this.listaAutos.size() && encontrado == null) {
            Auto a = this.listaAutos.get(i);
            if (a.getId().equals(id)) {
                encontrado = a;
            } else {
                i++;
            }
        }
        if (encontrado == null) {
            throw new RuntimeException("No se encontró heroe con ID " + id);
        }
        return encontrado;
    }

    @Override
    public int addAuto(Auto auto) {        
        this.listaAutos.add(auto);
       
        return 0;
    }

    @Override
    public int updateAuto(Auto auto) {
        Auto target = getAuto(auto.getId());
        int idx = this.listaAutos.indexOf(target);
        this.listaAutos.set(idx, auto);
        
        return 0;
    }

    @Override
    public int removeAuto(String id) {
        Auto target = getAuto(id);
        this.listaAutos.remove(target);
        return 0;
    }
    
    

    private void crearAutos() {

        this.listaAutos.add(new Auto("toyotaCorolla2017", "2017", "15.000", "Toyota", "Corolla", "seg"));
        this.listaAutos.add(new Auto("citroenC420Sx", "2010", "124.000", "Citroen", "C4", "2.0 Sx"));
        this.listaAutos.add(new Auto("fiatSiena13Fire", "2004", "150.000", "Fiat", "Siena", "1.3 Fire"));
        this.listaAutos.add(new Auto("fordEscort18GhiaS", "1994", "115.000", "Ford", "Escort", "1.8 Ghia S"));
        this.listaAutos.add(new Auto("fordFalconRural20", "1986", "111.111", "Ford", "Falcon", "Rural 2.0 GNC"));
        this.listaAutos.add(new Auto("fordEscort18GhiaS", "1994", "115.000", "Ford", "Escort", "1.8 Ghia S"));
        this.listaAutos.add(new Auto("fordEscort18GhiaS", "1994", "115.000", "Ford", "Escort", "1.8 Ghia S"));
        this.listaAutos.add(new Auto("fordEscort18GhiaS", "1994", "115.000", "Ford", "Escort", "1.8 Ghia S"));
        this.listaAutos.add(new Auto("fordEscort18GhiaS", "1994", "115.000", "Ford", "Escort", "1.8 Ghia S"));
        
    }
    
    
}
