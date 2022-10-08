package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.service.NoticeService;

@RequiredArgsConstructor
@Controller
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/notice/{employeeId}")
    public String subs(@PathVariable Integer employeeId, Model model) {
        List<Notice> noticeList = noticeService.구독공고(employeeId);
        model.addAttribute("noticeList", noticeList);
        return "notice/subsList";
    }

}
