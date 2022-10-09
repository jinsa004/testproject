package site.metacoding.testproject.domain.intro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Intro {
	private Integer introId;
	private Integer companyId;
	private String introTitle;
	private String introBirth;
	private String introTask;
	private String introSal;
	private String introWellfare;
	private String introContent;
	private String introLocation;
	private Integer jobId;
	private String introImage;

	public Intro(String introTitle, String introBirth, String introTask) {
		this.introTitle = introTitle;
		this.introBirth = introBirth;
		this.introTask = introTask;
	}



	public void update(Intro intro) {
		this.introTitle = intro.getIntroTitle();
		this.introBirth = intro.getIntroBirth();
		this.introTask = intro.getIntroTask();
	}

}
