package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.service.IntroService;
import site.metacoding.testproject.web.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class IntroController {

    private final IntroService introService;

    @GetMapping("/")
    public String main(){
        return "intro/introForm";
    }

    @PostMapping("/insert")
    public @ResponseBody CMRespDto<?> insertResume(@RequestBody Intro intro){
        introService.기업소개작성(intro);
        return new CMRespDto<>(1,"등록성공",null);
    }
}