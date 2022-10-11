package site.metacoding.testproject.service.notice;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@Service
@RequiredArgsConstructor
public class NoticeService {
    final NoticeDao noticeDao;
    
    public void 공고등록(Notice notice){
        noticeDao.insert(notice);
    }
}
