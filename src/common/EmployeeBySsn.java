/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 * This Comparator implementation offers an alternate way to sort
 * Employee entities -- by Ssn
 *
 * @author Gladwin
 */

 
public class EmployeeBySsn implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.getSsn().compareTo(e2.getSsn());
    }
}

