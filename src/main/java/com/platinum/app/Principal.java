package com.platinum.app;

/*import java.sql.SQLException;
import java.util.Scanner;

import com.amazonaws.services.gluedatabrew.model.Input;
import com.platinum.app.controllers.*;
import com.platinum.dao.ConnectionBD;


*/
/*public class Principal 
{
    public Principal() {
    	menus();
    }

    public static void main( String[] args )
    {
            Principal app = new Principal();
    	System.out.println("Termino");	
    }
	/**
	 * Metodo que proporciona el menu de la aplicacion
	 */
  /*  private void menus() {
    	Scanner menu;
    	menu=Input.getInstance();
    	Control pc = new Control();
        byte op=0;
        do {
            System.out.println( "-- Persistencia con SQLite --" );
            System.out.println( "1. Ingresar" );
            System.out.println( "2. Listar" );
            System.out.println( "3. Borrar" );
            System.out.println( "4. Editar" );
            System.out.println( "0. Salir de la aplicacion" );
            op=menu.nextByte();
            switch (op) {
                case 0:
                    System.out.println( "Saliendo del sistema" );
                    break;
                case 1:
                    pc.addRegister();
                    break;
                case 2:
                    pc.getRegisters();	
                    break;
                case 3:
                    pc.deleteRegister();	
                    break;
                case 4:
                    pc.editRegister();	
                    break;
                default:
                   System.out.println( "Solo puede eligir una de las opciones del menu" );
                    break;
            }
        }while(op!=0);
        menu.close();
   	try {
            ConnectionBD.getConnection().close(); 
	 }catch( SQLException e){
	    System.err.println(e);
	 }		   
    }

}*/