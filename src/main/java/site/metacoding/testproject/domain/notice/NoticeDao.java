package site.metacoding.testproject.domain.notice;

import java.util.List;

public interface NoticeDao {
    public List<Notice> findAll();
	public Notice findById(Integer noticeId);
	public void insert(Notice notice);
	public void update(Notice notice);
	public void deleteById(Integer noticeId);
}
