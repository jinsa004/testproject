package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.intro.Intro;
import site.metacoding.testproject.domain.intro.IntroDao;
import site.metacoding.testproject.web.request.UpdateDto;

@RequiredArgsConstructor
@Service
public class IntroService {

    private final IntroDao introDao;

    public void 기업소개작성(Intro intro) {
        introDao.insert(intro);
    }

    public Intro 기업소개수정(Integer introId, UpdateDto updateDto) {
        // 1. 영속화
        Intro introPS = introDao.findById(introId);

        // 2. 변경
        introPS.update(updateDto);

        // 3. 수행
        introDao.update(introPS);

        return introPS;
    }

    public Intro 기업소개수정화면(Integer introId) {
        Intro intro = introDao.findById(introId);
        return intro;
    }
}
