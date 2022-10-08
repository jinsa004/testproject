package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.service.NoticeService;
import site.metacoding.testproject.web.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class NoticeController {

    private final NoticeService noticeService;

    @GetMapping("/notice")
	public String noticeDetail(){
        return "notice/noticeSaveForm";
    }

    @PutMapping("/noticeSave")
    public @ResponseBody CMRespDto<?> noticeSave(@RequestBody Notice notice){
        noticeService.공고수정(notice);
        return new CMRespDto<>(1,"수정성공",null);
    }
}