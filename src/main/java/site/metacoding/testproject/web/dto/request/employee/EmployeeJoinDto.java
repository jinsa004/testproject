package site.metacoding.testproject.web.dto.request.employee;

import lombok.Setter;
import site.metacoding.testproject.domain.employee.Employee;
import lombok.Getter;

@Setter
@Getter
public class EmployeeJoinDto {
    private String employeeName;
    private String employeeBirth;
    private String employeeSex;
    private String employeeUsername;
    private String employeePassword;
    private String employeeEmail;
    private String employeeTel;
    private String employeeLocation;

    
}
