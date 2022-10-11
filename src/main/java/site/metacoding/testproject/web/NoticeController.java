
package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.service.notice.NoticeService;
import site.metacoding.testproject.web.dto.response.CMRespDto;

@Controller
@RequiredArgsConstructor
public class NoticeController {

    final NoticeService noticeService;

    @PostMapping("/insert")
    public @ResponseBody CMRespDto<?> insert(@RequestBody Notice notice){
        noticeService.공고등록(notice);
        return new CMRespDto<>(1,"등록성공",null);
    }

    @GetMapping("/")
    public String main(){
        return "notice/noticeForm";
    }
}

