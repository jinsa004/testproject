package site.metacoding.testproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@RequiredArgsConstructor
@Service
public class NoticeService {
    final NoticeDao noticeDao;

    public List<Notice> 내공고보기(Integer id){
        return noticeDao.findByCompanyId(id);
    }
}
