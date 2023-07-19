/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Rayly
 */
public class Customer {
    private String name;
    private int custId;
    private int contactNum;
    private String lotOwned;
    private String lotReserved;
    
    public Customer(String name, int custId, int contactNum){
        this.name = name;
        this.custId = custId;
        this.contactNum = contactNum;
    }
    
}
