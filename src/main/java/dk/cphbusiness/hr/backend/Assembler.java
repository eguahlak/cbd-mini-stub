package dk.cphbusiness.hr.backend;

import dk.cphbusiness.hr.backend.model.Department;
import dk.cphbusiness.hr.contract.dto.DepartmentSummary;
import java.util.ArrayList;
import java.util.Collection;


/**
 * 
 * @author anders
 */
public class Assembler {
  
  public static Collection<DepartmentSummary> createDepartmentSummaries(Collection<Department> departments) {
    Collection<DepartmentSummary> summaries = new ArrayList<>();
    for (Department department : departments) summaries.add(createDepartmentSummary(department));
    return summaries;
    }
  
  public static DepartmentSummary createDepartmentSummary(Department department) {
    return new DepartmentSummary(
        department.getCode(), 
        department.getName()+" - "+department.getDescription()
        );
    }
  
  }
