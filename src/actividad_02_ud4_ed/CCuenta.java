/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud4_ed;

/**
 * Clase que representa una cuenta
*/

public class CCuenta {

    /** Definición de atributos de la clase CCuenta
     * 
     */
  
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

   /** Contructor sin argumentos
    */
    public CCuenta ()
    {
    }
   
    /**
     * Constructor con parametros
     * @param nom nombre del poseedor de la cuenta
     * @param cue numero de la cuenta
     * @param sal numero de dinero en la cuenta
     * @param tipo interes de las operaciones
    */
    
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  
    /**
    * metodo que asigna el nombre del titular
    * @param nom Nombre del titular
    */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    
    /**
     * metodo que devuelve el nombre del titular
     * @return <code>nombre</code> Nombre del titular
     */

    public String obtenerNombre()
    {
        return nombre;
    }

     /**
     * metodo que devuelve el saldo disponible
     * @return <code>saldo</code> Saldo disponible
     */
     public double estado ()
    {
        return saldo;
    }

     /**
     * metodo que ingresa la cantidad
     * @param cantidad Dinero a ingresar
     * @throws Exception controlamos que no se introduzcan cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   
     /**
     * metodo que retira la cantidad
     * @param cantidad cantidad a retirar
     * @throws Exception Controlamos que no se retiren cantidades erróneas
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    
     /**
     * metodo que devuelve el numero de cuenta
     * @return <code>cuenta</code> Saldo disponible
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * asignamos el numero de la cuenta
   * @param cuenta numero de la cuenta
  */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * asignamos el numero de saldo
   * @param saldo numero de saldo
  */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * devuelve el tipo de interés
   * @return <code>tipoInterés</code> Porcentaje a aplicar
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * asiganmos el tipo de interés
   * @param tipoInterés Porcentaje a aplicar
  */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
