package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/saveForm")
    public String saveForm() {
        return "intro/saveForm";
    }

    @PostMapping("/insert")
    public @ResponseBody CMRespDto<?> insertIntro(@RequestBody Intro intro) {
        introService.기업소개작성(intro);
        return new CMRespDto<>(1, "등록성공", null);
    }

    @GetMapping("/updateForm/{introId}")
	public String introDetail(@PathVariable Integer introId, Model model){
        Intro introPS = introService.기업소개한건보기(introId);
        model.addAttribute("introPS", introPS);
        return "intro/updateForm";
    }

    @PutMapping("/update/{introId}")
    public @ResponseBody CMRespDto<?> noticeSave(@PathVariable Integer introId ,@RequestBody Intro intro){
        introService.기업소개수정(introId, intro);
        return new CMRespDto<>(1,"수정성공",null);
    }

}