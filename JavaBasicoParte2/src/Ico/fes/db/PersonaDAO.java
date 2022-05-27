/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.db;

/**
 *
 * @author 52558
 */
public class PersonaDAO implements interfazDao{

    public PersonaDAO() {
    }

    @Override
    public ArrayList obtenerTodo() throws SQLiteException {
        ArrayList<Persona> info = new ArrayList<Persona>();
        try{
        Statement stm = (Statement) BaseDeDatos.getInstance().getConexion().createStatement();
        ResultSet rst=stm.executeQuery("SELECT * FROM persona;");
        while(rst.next()){
                System.out.println("Nombre: " + rst.getString(1));
                System.out.println("Telefono: " + rst.getString(2));
            
            }

        }catch(SQLException ex){
            ex.printStackTrace();
        }

        
        return info;
    }

    @Override
    public boolean insertar(Object o) throws SQLiteException {
        boolean respuesta = false;
        Persona p=(Persona)o;
        String sql ="INSERT INTO persona VALUES(?,?)";
        
        try {
            PreparedStatement pstm=BaseDeDatos.getInstance().getConexion().prepareStatement(sql);
            pstm.setString(1, p.getNombre());
            pstm.setInt(2, p.getEdad());
            int rowCount= pstm.executeUpdate();
            respuesta= rowCount == 1? true:false;
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        
        return true;

    }

    @Override
    public boolean eliminar(String n) throws SQLiteException {
        return true;

    }


    
    
    
}
