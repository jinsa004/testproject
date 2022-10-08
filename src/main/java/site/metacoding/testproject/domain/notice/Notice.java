package site.metacoding.testproject.domain.notice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Notice {
	private Integer noticeId;
	private Integer companyId;
	private String noticeTitle;
	private String noticeConame;
	private String noticeImage;
	private String noticePeriod;
	private String noticeDept;
	private String noticePosition;
	private String noticeTask;
    private String noticeSal;
    private String noticeQual;
    private String noticeCareer;
    private String noticeWellfare;
	private Integer jobId;

	public Notice(String noticeTitle, String noticeConame, String noticeImage, String noticePeriod, String noticeDept, String noticePosition, 
	String noticeTask, String noticeSal, String noticeQual, String noticeCareer, String noticeWellfare, Integer jobId) {
		this.noticeTitle = noticeTitle;
		this.noticeConame = noticeConame;
		this.noticeImage = noticeImage;
		this.noticePeriod = noticePeriod;
		this.noticeDept = noticeDept;
		this.noticePosition = noticePosition;
		this.noticeTask = noticeTask;
		this.noticeSal = noticeSal;
		this.noticeQual = noticeQual;
		this.noticeCareer = noticeCareer;
		this.noticeWellfare = noticeWellfare;
		this.jobId = jobId;
	}

	public void update(Notice notice) {
		this.noticeTitle = notice.getNoticeTitle();
		this.noticeConame = notice.getNoticeConame();
		this.noticeImage = notice.getNoticeImage();
		this.noticePeriod = notice.getNoticePeriod();
		this.noticeDept = notice.getNoticeDept();
		this.noticePosition = notice.getNoticePosition();
		this.noticeTask = notice.getNoticeTask();
		this.noticeSal = notice.getNoticeSal();
		this.noticeQual = notice.getNoticeQual();
		this.noticeCareer = notice.getNoticeCareer();
		this.noticeWellfare = notice.getNoticeWellfare();
		this.jobId = notice.getJobId();
    }
}
