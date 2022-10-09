package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.service.IntroService;

@RequiredArgsConstructor
@Controller
public class IntroController {

    private final IntroService introService;

    @GetMapping("/intro/{id}")
    public String getIntroDetail(@PathVariable Integer id,Model model){
        model.addAttribute("intro",introService.기업소개상세보기(id));
        return "intro/detail";
    }
}
