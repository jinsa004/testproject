package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@Service
@RequiredArgsConstructor
public class NoticeService {
    
    private final NoticeDao noticeDao;
    
    public Notice 공고상세보기(Integer noticeId){
        return noticeDao.findById(noticeId);
    }
}
