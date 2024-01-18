/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;


/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa; 
        String direccion; 
        String acumulador = "";
        
        double[] misNotas; 
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        empresa = DatoTrabajo.obtenerEmpresa();
        direccion = DatoTrabajo.obtenerDireccion();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        
        for (int i = 0; i < misNotas.length; i++ ){
            acumulador = String.format("%s\nNotas %s: %.2f,  ", 
                    acumulador, i +1,  misNotas[i]);
        }
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n"
                + "Nombre de la empresa: %s\n"
                + "Direccion: %s\n",
                nombre,
                apellidoRetornado,
                ciudad,
                misNotas,
                empresa,
                direccion,
                promedio);
        System.out.printf("%s\n", acumulador);
    }
    
}
