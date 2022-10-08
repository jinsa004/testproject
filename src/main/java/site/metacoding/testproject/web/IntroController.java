package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.service.IntroService;

@RequiredArgsConstructor
@Controller
public class IntroController {

    @Autowired
    private IntroService introService;

    @GetMapping("/")
    public String list(Model model) {
        List<Intro> introList = introService.목록보기();
        model.addAttribute("introList", introList);
        return "index";
    }
}
