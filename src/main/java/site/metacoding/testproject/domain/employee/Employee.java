package site.metacoding.testproject.domain.employee;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private Integer employeeId;
	private String employeeName;
	private String employeeBirth;
	private String employeeSex;
	private String employeeUsername;
	private String employeePassword;
	private String employeeEmail;
	private String employeeLocation;
	private String employeeTel;
	private Integer jobId;
}
