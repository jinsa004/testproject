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

    @Test
    public void insert(){
        // given
            String noticeTitle = "사원채용공고";
            String noticeWellfare = "중식 무상제공";
            Integer companyId = 1;
            Notice notice = new Notice(noticeTitle, noticeWellfare, companyId);
        // when
            int result = noticeDao.insert(notice);
            System.out.println(notice.getNoticeWellfare());
        // then
            assertEquals(1, result);
    }
}
