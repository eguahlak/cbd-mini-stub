package dk.cphbusiness.hr.backend.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Department {
  private static final Map<String, Department> items = new HashMap<>();
  
  public static Department find(String code) {
    return items.get(code);
    }
  
  public static Collection<Department> list() {
    return items.values();
    }
  
  private final String code;
  private String name;
  private String description;
  // Please implement supporting code
  private Collection<Employee> employees;
  private Employee manager;

  public Department(String code, String name, String description) {
    this.code = code;
    this.name = name;
    this.description = description;
    items.put(code, this);
    }

  public String getCode() {
    return code;
    }
  
  public String getName() {
    return name;
    }

  public void setName(String name) {
    this.name = name;
    }

  public String getDescription() {
    return description;
    }

  public void setDescription(String description) {
    this.description = description;
    }

  }
