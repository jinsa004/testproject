package site.metacoding.testproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.company.Company;
import site.metacoding.testproject.domain.company.CompanyDao;

@RequiredArgsConstructor
@Service
public class CompanyService {

    private final CompanyDao companyDao;

    public List<Company> 목록보기() {
        return companyDao.findAll();
    }
}