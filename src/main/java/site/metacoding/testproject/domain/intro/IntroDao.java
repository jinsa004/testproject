package site.metacoding.testproject.domain.intro;

import java.util.List;

public interface IntroDao {
    public List<Intro> findAll();
	public Intro findById(Integer introId);
	public int insert(Intro intro);
	public void update(Integer introId, Intro intro);
	public void deleteById(Integer introId);
}
