package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.domain.intro.IntroDao;

@RequiredArgsConstructor
@Service
public class IntroService {

    private final IntroDao introDao;

    public void 기업소개작성(Intro intro) {
        introDao.insert(intro);
    }

    public Intro 기업소개한건보기(Integer introId){
        Intro intro = introDao.findById(introId);
        return intro;
    }

    public void 기업소개수정(Integer introId,Intro intro) {
        Intro introPS = introDao.findById(introId);
        introPS.update(introPS);
        introDao.update(intro);
    }
}
