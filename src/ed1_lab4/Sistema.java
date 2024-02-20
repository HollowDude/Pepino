/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab4;

/**
 *
 * @author Humbert
 */
public class Sistema {
    protected ListaSE<Persona> solicitudes;
    protected ListaSE<Persona> solapines;
    protected ListaSE<Persona> personalAtendido;

    public Sistema() {
        this.solicitudes = new ListaSE<>();
        this.solapines = new ListaSE<>();
        this.personalAtendido = new ListaSE<>();
    }

    public Sistema(ListaSE<Persona> solicitudes, ListaSE<Persona> solapines, ListaSE<Persona> personalAtendido) {
        this.solicitudes = solicitudes;
        this.solapines = solapines;
        this.personalAtendido = personalAtendido;
    }

    public ListaSE<Persona> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ListaSE<Persona> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ListaSE<Persona> getSolapines() {
        return solapines;
    }

    public void setSolapines(ListaSE<Persona> solapines) {
        this.solapines = solapines;
    }

    public ListaSE<Persona> getPersonalAtendido() {
        return personalAtendido;
    }

    public void setPersonalAtendido(ListaSE<Persona> personalAtendido) {
        this.personalAtendido = personalAtendido;
    }
    
    public void entregarSolapin(Persona p){
        System.out.println("Solapin entregado a " + p.getNombre() + " satisfactoriamente");
    }
    
    public void entregarSolapines(){
        throw new UnsupportedOperationException("Debe implementar el metodo.");
    }
    
    public ListaSE<Persona> personasCumplenAnnos(Fecha f){
        throw new UnsupportedOperationException("Debe implementar el metodo.");
    }
    
    public void llevarFamiliaAlInicio(String ciInicial, String ciFinal){
        throw new UnsupportedOperationException("Debe implementar el metodo.");
    }

    @Override
    public String toString() {
        return "Sistema{" + "solicitudes=" + solicitudes.toString() + "\n" + "solapines=" + solapines.toString() + "\n" + "personalAtendido=" + personalAtendido.toString() + '}';
    }
    
    
}
