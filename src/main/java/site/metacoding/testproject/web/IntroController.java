package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.service.IntroService;

@RequiredArgsConstructor
@Controller
public class IntroController {

    private final IntroService introService;

    @GetMapping("/")
    public String main(){
        return "intro/introForm";
    }

    @PostMapping("/insert")
    public String insertResume(Intro intro){
        introService.기업소개작성(intro);
        return"/intro/introForm";
    }
}