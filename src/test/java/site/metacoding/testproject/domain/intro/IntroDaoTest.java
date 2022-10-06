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
    public void insert_test(){
        //given
        String introTitle = "삼성";
        String introBirth = "1900.1";
        String introTask = "밥먹기";
        Intro intro = new Intro(introTitle, introBirth, introTask);

        //when
        int result = introDao.insert(intro);
        System.out.println(intro.getIntroTask());

        //then
        assertEquals(1, result);
    }
}
