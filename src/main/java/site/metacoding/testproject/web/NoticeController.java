package site.metacoding.testproject.web;

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
    
    private final NoticeService noticeService;

    @GetMapping("/notice/{id}")
    public String detail(@PathVariable Integer id, Model model){
        Notice noticePS = noticeService.공고상세보기(id);
        model.addAttribute("notice",noticePS);
        return "notice/noticeDetail";
    }
}
