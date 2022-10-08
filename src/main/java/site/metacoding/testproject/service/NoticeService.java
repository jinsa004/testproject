package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@RequiredArgsConstructor
@Service
public class NoticeService {
    
    private final NoticeDao noticeDao;
    
    public void 공고수정(Notice notice){
        noticeDao.update(notice);
    }
}
