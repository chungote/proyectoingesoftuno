package Control;

import DAO.EvaluacionesJpaController;
import DAO.ProveedoresJpaController;
import Entidad.Evaluaciones;
import Entidad.Proveedores;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControlEvaluadorProveedor {
    
    public static EntityManagerFactory emf;
    public static EntityManager em;
    public ControlEvaluadorProveedor(){
        emf = Persistence.createEntityManagerFactory("EvaluacionProveedoresPU", System.getProperties());
        em = emf.createEntityManager();
    }
    public String compararProveedor(int nit){
        Proveedores v = buscarProveedor(nit);
        if(v == null){
            return "Proveedor no encontrado";
        }
        return "Proveedor encontrado";
    }

    public Proveedores buscarProveedor(int nit){
        ProveedoresJpaController jpaProveedor = new ProveedoresJpaController();
        return jpaProveedor.getProveedorNit(nit, em);
    }
    public String validarDatos(String calidad, String fiabilidad, String adaptabilidad, String comentarios){
        if(Float.parseFloat(calidad)>= 0 && Float.parseFloat(calidad) <= 100){
                if(Float.parseFloat(fiabilidad)>=0 && Float.parseFloat(fiabilidad)<=100){
                            return "Succes";
                }else{
                    return "Error Fiabilidad";
                }
        }else{
            return "Error Calidad";
        }
    }
      public void ingresarEvaluacionProveedor(Proveedores proveedor, Evaluaciones evaluacion){
            evaluacion.setProveedor(proveedor);
            proveedor.getEvaluaciones().add(evaluacion);
            proveedor.setEvaluacionRealizada(true);
            EvaluacionesJpaController evaluacionjpa = new EvaluacionesJpaController();
            evaluacionjpa.create(evaluacion, em);
    }
}