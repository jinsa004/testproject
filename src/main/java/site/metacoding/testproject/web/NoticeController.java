
package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.service.notice.NoticeService;

@Controller
@RequiredArgsConstructor
public class NoticeController {

    final NoticeService noticeService;

    @GetMapping("/")
    public String main(){
        return "notice/noticeForm";
    }

    @PostMapping("/insert")
    public String insert(Notice notice){
        noticeService.공고등록(notice);
        return "index";
    }
}

