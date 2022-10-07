package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.service.NoticeService;

@Controller
@RequiredArgsConstructor
public class NoticeController {
    
    final NoticeService noticeService;

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @DeleteMapping("/notice/{noticeId}")
    public String deleteNotice(@PathVariable Integer noticeId){
        noticeService.내공고삭제(noticeId);
        return "redirect:/";
    }
}
