package site.metacoding.testproject.domain.intro;

import java.util.List;

public interface IntroDao {
	public List<Intro> findAll();

	public Intro findById(Integer introId);

	public int insert(Intro intro);

	public int update(Intro intro);

	public int deleteById(Integer introId);
}
