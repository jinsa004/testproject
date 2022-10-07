package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.service.NoticeService;

@Controller
@RequiredArgsConstructor
public class NoticeController {
    
    final NoticeService noticeService;

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/notice/{id}")
    public String myNotice(@PathVariable Integer id, Model model){
        System.out.println("company id : " + id);
        List<Notice> noticeList = noticeService.내공고보기(id);
        System.out.println("=====================실행?");
        model.addAttribute("noticeList", noticeList);
        System.out.println("=====================실행?");
        return "notice/MyNotice";
    }

}
