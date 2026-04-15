/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacualquiera;

/**
 *
 * @author umg
 */
public class ProgramaCualquiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Empleado emp1 = new Empleado(1,"Jose","Marin","hola");
        
        System.out.println("Nombre:" +emp1.getNombre()+"Apellido"+emp1.getApellido()+"Direccion"+emp1.getDireccion());
        emp1.CalcularSalario();
    }
    
}
