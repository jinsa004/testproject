package site.metacoding.testproject.domain.notice;

import lombok.Getter;
import lombok.Setter;

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

	public Notice(String noticeTitle, String noticeConame){
		this.noticeTitle = noticeTitle;
		this.noticeConame = noticeConame;
	}
}
