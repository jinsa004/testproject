package site.metacoding.testproject.domain.notice;

import java.util.List;

public interface NoticeDao {
    public List<Notice> findAll();
	public Notice findById(Integer noticeId);
	public Notice insert(Notice notice);
	public void update(Integer noticeId, Notice notice);
	public void deleteById(Integer noticeId);
}
