package site.metacoding.testproject.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.employee.Employee;
import site.metacoding.testproject.service.EmployeeService;
import site.metacoding.testproject.web.dto.request.employee.EmployeeJoinDto;
import site.metacoding.testproject.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class loginController {

	private final EmployeeService employeeService;

	@PostMapping("/join")
	public @ResponseBody CMRespDto<?> 회원가입(@RequestBody @Valid Employee employee) {
		employeeService.employeeJoin(employee);
		return new CMRespDto<>(1, "회원가입성공", null);
	}

	@GetMapping("/join")
	public String mainJoin() {
		return "user/header";
	}

	@GetMapping("/")
	public String main() {
		return "user/main";
	}
}
