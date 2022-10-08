package site.metacoding.testproject.domain.notice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import site.metacoding.testproject.config.MyBatisConfig;

@Import(MyBatisConfig.class) // MyBatisTest가 MyBatisConfig를 못읽음
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 실DB사용
@MybatisTest
public class NoticeDaoTest {
    
    @Autowired
    private NoticeDao noticeDao;

    // @Test
    // public void updateNotice() {
    //     //give
    //     Integer noticeId = 1;
    //     String noticeConame = "하늘";
    //     String noticeTitle = "늘 푸른 사원 모집";
    //     String noticeSal = "2400만원";

    //     Notice notice = new Notice(noticeConame, noticeTitle, noticeSal);
    //     //영속 
    //     Notice noticePS = noticeDao.findById(noticeId);
    //     //when
    //     noticePS.update(notice);
    //     //then
    //     assertEquals("하늘", noticePS.getNoticeConame());
    // }
}
