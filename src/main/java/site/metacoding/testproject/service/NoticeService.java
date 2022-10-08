package site.metacoding.testproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.notice.Notice;
import site.metacoding.testproject.domain.notice.NoticeDao;

@RequiredArgsConstructor
@Service
public class NoticeService {
    
    private final NoticeDao noticeDao;
    
    public List<Notice> 구독공고(Integer employeeId){
        return noticeDao.findSubsByEmployeeId(employeeId);
    }
}
