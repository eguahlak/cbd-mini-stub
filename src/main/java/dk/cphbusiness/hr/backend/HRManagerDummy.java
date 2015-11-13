package dk.cphbusiness.hr.backend;

import dk.cphbusiness.hr.backend.model.Department;
import dk.cphbusiness.hr.contract.HRManager;
import dk.cphbusiness.hr.contract.dto.DepartmentIdentifier;
import dk.cphbusiness.hr.contract.dto.DepartmentSummary;
import dk.cphbusiness.hr.contract.dto.EmployeeDetail;
import dk.cphbusiness.hr.contract.eto.IllegalEmployeeException;
import java.util.ArrayList;
import java.util.Collection;
import static dk.cphbusiness.hr.backend.Assembler.*;

public class HRManagerDummy implements HRManager {

  public HRManagerDummy() {
    new Department("ADM", "Administration", "overall department for ...");
    new Department("IT", "IT", "Development and support department");
    }
  
  @Override
  public Collection<DepartmentSummary> listDepartments() {
    return createDepartmentSummaries(Department.list());
//    Collection<DepartmentSummary> departments = new ArrayList<>();
//    departments.add(new DepartmentSummary("ADM", "Administration - Overall ..."));
//    departments.add(new DepartmentSummary("IT", "IT - is the common department for ..."));
//    return departments;
    }

  @Override
  public void createEmployee(DepartmentIdentifier department, EmployeeDetail employee) throws IllegalEmployeeException {
    // Department d = Department.find(department.getCode());
    
    throw new UnsupportedOperationException("HRManagerDummy.createEmployee(...) Not supported yet.");
    }
  
  }
