/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ed1_lab4;

/**
 *
 * @author win-dpto-info
 */
public interface Lista <T>{

    public int longitud();
    public T obtener(int pos);
    public void adicionar(T a);
    public void eliminar(int a);
    public void insertar(T a, int b);
}
