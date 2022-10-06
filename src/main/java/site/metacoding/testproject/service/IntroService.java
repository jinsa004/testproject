package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.domain.intro.IntroDao;

@RequiredArgsConstructor
@Service
public class IntroService {

    private final IntroDao introDao;


    public void 기업소개작성(Intro intro){
        introDao.insert(intro);
    }

}