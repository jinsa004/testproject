package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.employee.Employee;
import site.metacoding.testproject.domain.employee.EmployeeDao;
import site.metacoding.testproject.web.dto.request.employee.EmployeeJoinDto;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    public void employeeJoin(Employee employee) {
        employeeDao.insert(employee);
    }
}
