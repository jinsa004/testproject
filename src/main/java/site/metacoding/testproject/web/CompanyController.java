package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.company.Company;
import site.metacoding.testproject.service.CompanyService;

@RequiredArgsConstructor
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/")
    public String list(Model model) {
        List<Company> companyList = companyService.목록보기();
        model.addAttribute("companyList", companyList);
        return "index";
    }
}
