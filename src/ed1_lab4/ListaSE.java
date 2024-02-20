/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed1_lab4;

/**
 *
 * @author win-dpto-info
 */
public class ListaSE<T> implements Lista<T> {

    private int longitud;
    private NodoSE cabeza;

    public ListaSE() {
        longitud = 0;
        cabeza = null;
    }

    public ListaSE(T elemCabeza) {
        cabeza = new NodoSE(elemCabeza);
        longitud = 1;
    }

    @Override
    public int longitud() {
        return longitud;
    }

    @Override
    public T obtener(int pos) {
        NodoSE<T> cursor = cabeza;
        int contador = 0;
        while (contador != pos) {
            contador++;
            cursor = cursor.getSiguiente();

        }
        return cursor.getDato();
    }

    @Override
    public void adicionar(T a) {
        if (cabeza == null) {
            cabeza = new NodoSE<>(a);
        } else {
            NodoSE<T> cursor = cabeza;
            while (cursor.getSiguiente() != null) {
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(new NodoSE<>(a));
        }
        longitud++;
    }

    @Override
    public void eliminar(int a) {
        NodoSE<T> cursor = cabeza;
        int contador = 0;
        if (a == 0) {
            cabeza = cabeza.getSiguiente();
        }
        posNoValida(a);
        while (cursor.getSiguiente() != null) {
            contador++;

            if (contador == a) {
                cursor.setSiguiente(cursor.getSiguiente().getSiguiente());
                break;
            }
            cursor = cursor.getSiguiente();
        }
        longitud--;
    }

    @Override
    public void insertar(T a, int b) {
        NodoSE<T> cursor = cabeza;
        int contador = 0;
        if (b == 0) {
            NodoSE<T> nuevo = new NodoSE<>(a);
            nuevo.setSiguiente(cursor);
            cabeza = nuevo;
        }
        posNoValida(b);
        while (cursor.getSiguiente() != null && contador != b) {
            contador++;
            if (contador == b) {
                NodoSE<T> nuevo = new NodoSE<>(a);
                nuevo.setSiguiente(cursor.getSiguiente());
                cursor.setSiguiente(nuevo);
            }
            cursor = cursor.getSiguiente();
        }
        longitud++;
    }

    public void posNoValida(int pos) {
        if (pos < 0 || pos > longitud) {
            throw new RuntimeException("Fuera de rango");
        }
    }

    public int indexOf(T elem) {
        NodoSE puntero = cabeza;
        int cont = 0;
        for (int i = 0; i < longitud; i++) {
            if (puntero.getDato().equals(elem)) {
                return i;
            }
            puntero = puntero.getSiguiente();
        }
        return -1;
    }

    public void moverRangoAPos(int iniRango, int finRango, int pos) {
        posNoValida(iniRango);
        posNoValida(finRango);
        posNoValida(pos);
        if (pos >= iniRango && pos <= finRango) {
            throw new RuntimeException("La pos no puede pertenecer al rango");
        }
        NodoSE<T> cursorIni, cursorAnteriorIni, cursorFin, cursorSiguienteFin, cursorPos, cursorAnteriorPos, cursor;
        cursorIni = cursorAnteriorIni = cursorFin = cursorSiguienteFin = cursorPos = cursorAnteriorPos = cursor = cabeza;
        int cont = 0;
        while (cursor != null) {
            if (cont == iniRango - 1) {
                cursorAnteriorIni = cursor;
                cursorIni = cursor.getSiguiente();
            }
            if (cont == finRango) {
                cursorFin = cursor;
                cursorSiguienteFin = cursor.getSiguiente();
            }
            if (cont == pos - 1) {
                cursorPos = cursor.getSiguiente();
                cursorAnteriorPos = cursor;
            }

            cursor = cursor.getSiguiente();
            cont++;
        }
        if (!(iniRango == 0 && pos == 0) && !(finRango == longitud - 1 && pos == longitud - 1)) {
            if (iniRango == 0) {
                cabeza = cursorSiguienteFin;
            } else if (finRango == longitud - 1) {
                cursorAnteriorIni.setSiguiente(null);
            } else {
                cursorAnteriorIni.setSiguiente(cursorSiguienteFin);
            }
            if (pos == 0) {
                cursorFin.setSiguiente(cabeza);
                cabeza = cursorIni;
            } else if (pos == longitud) {
                cursorAnteriorPos.setSiguiente(cursorIni);
                cursorFin.setSiguiente(null);
            } else if (pos == finRango + 1) {
                cursorFin.setSiguiente(cursorPos);
                cursorAnteriorIni.setSiguiente(cursorIni);
            } else {
                cursorFin.setSiguiente(cursorPos);
                cursorAnteriorPos.setSiguiente(cursorIni);
            }
        }
    }

    @Override
    public String toString() {
        String lista = "{" + "\n";
        NodoSE cursor = cabeza;
        while (cursor.getSiguiente() != null) {
            lista = lista.concat(cursor.getDato().toString() + "\n");
            cursor = cursor.getSiguiente();
        }
        lista.concat(cursor.getDato().toString() + "}");
        return lista;
    }

}
