package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import common.Employee;
import java.util.*;
import common.*;

public class Startup {

    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Nick", "Bob", "111-11-1111");
//      Employee e2 = new Employee(1,"Sam", "Joe", "222-22-2222");
        Employee e2 = new Employee(2, "Sam", "Joe", "222-22-2222");
        Employee e3 = new Employee(4, "Joe", "Tim", "444-44-4444");
        Employee e4 = new Employee(2, "Jim", "James", "333-33-3333");
        Map<String, Employee> map = new HashMap<>();
        map.put("111-11-1111", e1);
        map.put("222-22-2222", e2);
        map.put("444-44-4444", e3);
        map.put("333-33-3333", e4);
//         //now retrieve one by its key
//        Employee e = map.get("111-11-1111");
//        System.out.println("Found emloyee with key 111-11-1111: " + e);

        for (Employee s : map.values()) {
            System.out.println(s.getEmpID() + " " + s.getLastName() + " " + s.getFirstName() + " " + s.getSsn());
        }
        Set<Employee> set = new TreeSet<Employee>();

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        System.out.println("The size of the Sorted set is: " + set.size());
        for (Employee e : set) {
            System.out.println(e);
        }

        // Now let's loop thru the map and retrieve each employee by its key.
        // Notice there is no sorting and the objects retrieve are not
        // guaranteed to come out in the order they were entered...
        System.out.println("\nUsing a keyset, get the employees by key, unsorted, unordered...");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }
        // Let's loop through the keys, retrieving each object
        // stored in the map and print out it's toString value.
        // Keys must be unique so we should use a set. Note
        // that the isertion order is NOT maintained:
        System.out.println("\nUsing a keyset, get the employees sorted by key (ssn)...");
        Map<String, Employee> map2 = new TreeMap<String, Employee>(map);
        Set<String> keys2 = map2.keySet();
        for (String key : keys2) {
            Employee found = map.get(key);
            System.out.println(found.toString());
        }

//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
//        System.out.println(a1);
//        System.out.println(a2);
//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
