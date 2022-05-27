/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.db;

/**
 *
 * @author 52558
 */
public interface interfazDao {
    public abstract ArrayList obtenerTodo() throws SQLiteException;
    public abstract boolean insertar(Object o)  throws SQLiteException;
    public abstract boolean eliminar(String n)   throws SQLiteException;
    
    
}