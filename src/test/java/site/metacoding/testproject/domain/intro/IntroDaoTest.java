package site.metacoding.testproject.domain.intro;

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
public class IntroDaoTest {
    
    @Autowired
    private IntroDao introDao;

    @Test
    public void findById_test() {
        // given
        Integer id = 1;
        // when
        Intro intro = introDao.findById(id);
        // then
        assertEquals("19980224", intro.getIntroBirth());
    }
}
