package com.platinum.app.controllers;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.platinum.dao.ConnectionBD;
import com.platinum.models.entity.Persona;*/


/* public class Controll {
	private final String SQLINSERT="INSERT INTO PERSONA VALUES(NULL,?,?,?)";
	private final String SQLQUERY="SELECT Id,Nombre,Apellido,Sexo FROM PERSONA";
	private final String SQLQUERYONE=SQLQUERY+" WHERE Id=?";
	private final String SQLDELETE="DELETE FROM PERSONA WHERE Id=?";
	private final String SQLUPDATE="UPDATE PERSONA SET Nombre=?, Apellido=?,Sexo=? WHERE Id=?";
	private Connection conn;

	public Controll() {
		initController();
	}

	
	private void initController() {
		conn=ConnectionBD.getConnection();
		PreparedStatement pst=null;
		String sqlCreate="CREATE TABLE IF NOT EXISTS PERSONA (" + 
				"	Id	integer PRIMARY KEY autoincrement," + 
				"	Nombre	 varchar ( 25 ) NOT NULL," + 
				"	Apellido varchar ( 25 ) NOT NULL," + 
				"	Sexo char  NOT NULL" + 
				"	)";
		try {
			pst=conn.prepareStatement(sqlCreate);
			pst.execute();
	    }catch( SQLException e){
	        System.err.println(e);
	    }finally {
	    	try {
	    		if(pst!=null)
	    			pst.close();
		    }catch( SQLException e){
		        System.err.println(e);
		    }
	    }		   
	}
	

	public void addRegister() {
		Persona persona=new Persona();
		Object view;
		view.setRegister();
		PreparedStatement pst=null;
		try {
			pst=conn.prepareStatement(SQLINSERT);
			pst.setString(1, persona.getNombre());
			pst.setString(2, persona.getApellido());
			pst.setString(3, persona.getSexo());
			pst.executeUpdate();
	    }catch( SQLException e){
	        System.err.println(e);
	    }finally {
	    	try {
	    		if(pst!=null)
	    			pst.close();
		    }catch( SQLException e){
		        System.err.println(e);
		    }
	    }		   
	}*/
/**
 * Extrae los registro de la tabla y los visualiza en pantalla por medio de la vista
 * ListPersona
 */
/*	public void getRegisters() {
		List personas=new ArrayList<>();
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=conn.prepareStatement(SQLQUERY);
			rs=pst.executeQuery();
			while(rs.next()) {
				personas.add(new Persona( rs.getInt("Id"),
						rs.getString("Nombre"),
						rs.getString("Apellido"),
						rs.getString("Sexo")
						));
			}
	    }catch( SQLException e){
	        System.err.println(e);
	    }finally {
	    	try {
	    		if(pst!=null)
	    			pst.close();
	    		if(rs!=null)
	    			rs.close();
		    }catch( SQLException e){
		        System.err.println(e);
		    }
	    }		   
		ListPersona view =new ListPersona();
		view.sayRegisters(personas);
	}	
	
	private Persona getRegister(int a) {
		PreparedStatement pst=null;
		ResultSet rs=null;
		Persona persona=null;
		try {
			pst=conn.prepareStatement(SQLQUERYONE);
			pst.setInt(1, a);
			rs=pst.executeQuery();
			if(rs.next()) {
				persona=new Persona( rs.getInt("Id"),
					rs.getString("Nombre"),
					rs.getString("Apellido"),
					rs.getString("Sexo")
				);
			}
	    }catch( SQLException e){
	        System.err.println(e);
	    }finally {		//Nos aseguramos que se cierre el PreparedStatement y ResultSet al finalizar el metodo

	    	try {
	    		if(pst!=null)
	    			pst.close();
	    		if(rs!=null)
	    			rs.close();
		    }catch( SQLException e){
		        System.err.println(e);
		    }
	    }		   
		
		return persona;
	}

	
  /*  public void deleteRegister() {
	DeletePersona dp=new DeletePersona();
	Persona persona=null;
        int reg;
	PreparedStatement pst=null;
        do {
                reg=dp.getRegister();
                persona=getRegister(reg);
                if(persona.getId()!=reg) {
                        System.out.println("Registro no encontrado!!!");
                }
        }while(persona.getId()!=reg);
	if(dp.postRegister(persona)) {
            try {
		pst=conn.prepareStatement(SQLDELETE);
		pst.setInt(1, persona.getId());
		pst.execute();
            }catch( SQLException e){
	        System.err.println(e);
	    }
            finally {		//Nos aseguramos que se cierre el PreparedStatement al finalizar el metodo
           	try {
                    if(pst!=null)
		    	pst.close();
		}catch( SQLException e){
		        System.err.println(e);
                }
            }		   
	}
    }
	
    public void editRegister() {
        EditPersona edit =new EditPersona();
        Persona persona=null;
        int reg;
        PreparedStatement pst=null;
        do {
                reg=edit.getRegister();
                persona=getRegister(reg);
                if(persona.getId()!=reg) {
                        System.out.println("Registro no encontrado!!!");
                }
        }while(persona.getId()!=reg);
        //Envia el registro para ser modificado 
        edit.postRegister(persona);
        try {
                pst=conn.prepareStatement(SQLUPDATE);
                pst.setString(1, persona.getNombre());
                pst.setString(2, persona.getApellido());
                pst.setString(3, persona.getSexo());
                pst.setInt(4, persona.getId());
                pst.executeUpdate();
        }catch( SQLException e){
            System.err.println(e);
        }
            //Nos aseguramos que se cierre el PreparedStatement al finalizar el metodo
        finally {
            try {
                   if(pst!=null)
                            pst.close();
                }catch( SQLException e){
                    System.err.println(e);
            }
        }		   
    }
}*/

