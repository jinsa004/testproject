package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@Service
@RequiredArgsConstructor
public class NoticeService {
    final NoticeDao noticeDao;

    public void 내공고삭제(Integer noticeId){
        Notice noticePS = noticeDao.findById(noticeId); // 영속화
        noticeDao.deleteById(noticePS.getNoticeId());
    }
}
