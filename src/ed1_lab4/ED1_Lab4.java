/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed1_lab4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author win-dpto-info
 */
public class ED1_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 1;
        Scanner scan = new Scanner(System.in);
        Sistema sistema = Sistema();
        System.out.println(sistema.toString());

        while (numero != 0) {
            System.out.println("0 para salir, 1 para ver estado del sistema, 2 para entregarSolapines, 3 para personasCumplenAnno, 4 para llevarFamiliaAlInicio.");
            numero = scan.nextInt();

           switch (numero) {
                case 0 : {
                    break;
                }
                case 1 : {
                    System.out.println(sistema.toString());
                }
                case 2 : {
                    sistema.entregarSolapines();
                    System.out.println("Solapines entregados");
                    sistema.toString();
                }
                case 3 : {
                    System.out.println("Introduzca la fecha a buscar (dia mes anno): ");
                    ListaSE <Persona> lista = sistema.personasCumplenAnnos(new Fecha(scan.nextInt(), scan.nextInt(), scan.nextInt()));
                    System.out.println("La lista con las personas que cumplen en esa fecha es: " + "\n" + lista.toString());
                }
                case 4 : {
                    System.out.println("Introduzca los carnets de identidad de la 1ra persona de la familia en la lista y el de la última persona, en lineas diferentes: ");
                    sistema.llevarFamiliaAlInicio(scan.nextLine(), scan.nextLine());
                    System.out.println("Familia movida.");
                }
                default :
                    numero = 0;
            }

        }
    }

    private static Sistema Sistema() {
        ListaSE<Persona> listaSolicitudes = new ListaSE<>();
        ListaSE<Persona> listaSolapines = new ListaSE<>();
        ListaSE<Persona> listaAtendidos = new ListaSE<>();

        Persona p1 = new Persona("Adriel de Leon Otero", "84082752459");
        Persona p2 = new Persona("Amanda Heredia Fernández", "84120671321");
        Persona p3 = new Persona("Carlos Alberto Roque Arencibia", "96070227489");
        Persona p4 = new Persona("Daniel Martí Barreda", "92101529216");
        Persona p5 = new Persona("Dayani Alfonso Pérez", "82091761023");
        Persona p6 = new Persona("Harold Tamayo Lahera", "96080237961");
        Persona p7 = new Persona("Helen Maday Rondón Guerra", "94061664645");
        Persona p8 = new Persona("Irisleydis Reyes Hechavarria", "86090273346");
        Persona p9 = new Persona("Javier Zaldivar García", "86112786179");
        Persona p10 = new Persona("José Alejandro Estrada Tassé", "88120674443");
        Persona p11 = new Persona("Liddiana Pérez Castellanos", "92040980285");
        Persona p12 = new Persona("Lizandra Melissa Quesada Leyva", "88120477950");
        Persona p13 = new Persona("Marlon Damián Monterrey Morejón", "82042813470");
        Persona p14 = new Persona("Naomy Cisnero Pérez", "85051193234");
        Persona p15 = new Persona("Osviel Rodríguez Laza", "83051185748");

        listaSolicitudes.adicionar(p1);
        listaSolicitudes.adicionar(p2);
        listaSolicitudes.adicionar(p3);
        listaSolicitudes.adicionar(p4);
        listaSolicitudes.adicionar(p5);
        listaSolicitudes.adicionar(p6);
        listaSolicitudes.adicionar(p7);
        listaSolicitudes.adicionar(p8);
        listaSolicitudes.adicionar(p9);
        listaSolicitudes.adicionar(p10);
        listaSolicitudes.adicionar(p11);
        listaSolicitudes.adicionar(p12);
        listaSolicitudes.adicionar(p13);
        listaSolicitudes.adicionar(p14);
        listaSolicitudes.adicionar(p15);

        //4, 7, 9, 10, 13 estan inicialmente atendidos
        listaAtendidos.adicionar(p4);
        listaAtendidos.adicionar(p7);
        listaAtendidos.adicionar(p9);
        listaAtendidos.adicionar(p10);
        listaAtendidos.adicionar(p13);

        //1, 2, 5, 8, 11, 15 tienen solapin para entregar
        listaSolapines.adicionar(p1);
        listaSolapines.adicionar(p2);
        listaSolapines.adicionar(p5);
        listaSolapines.adicionar(p8);
        listaSolapines.adicionar(p11);
        listaSolapines.adicionar(p15);

        return new Sistema(listaSolicitudes, listaSolapines, listaAtendidos);
    }

}
