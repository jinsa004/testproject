package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.service.NoticeService;
import site.metacoding.testproject.web.dto.response.CMRespDto;

@Controller
@RequiredArgsConstructor
public class NoticeController {
    
    final NoticeService noticeService;

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/noticeForm")
    public String deleteForm(){
        return "notice/noticeForm";
    }

    @DeleteMapping("/notice/{noticeId}")
    public @ResponseBody CMRespDto<?> deleteNotice(@PathVariable Integer noticeId){
        noticeService.내공고삭제(noticeId);
        return new CMRespDto<>(1,"삭제성공",null);
    }
}
