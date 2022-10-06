package site.metacoding.testproject.domain.notice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import site.metacoding.testproject.config.MyBatisConfig;

@Import(MyBatisConfig.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
public class NoticeDaoTest {
    
    @Autowired
    private NoticeDao noticeDao;

    @Test
    public void Test(){
        //given
        int companyId = 1;
        //when
        List<Notice> noticePS = noticeDao.findByCompanyId(companyId);
        //then
        assertEquals(1, noticePS.size());
    }
}
