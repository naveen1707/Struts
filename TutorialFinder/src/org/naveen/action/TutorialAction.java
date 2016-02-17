package org.naveen.action;

import org.naveen.service.TutorialActionService;

public class TutorialAction {
	
	private String bestTu;
	private String language;
	public String getBestTu() {
		return bestTu;
	}

	public void setBestTu(String bestTu) {
		this.bestTu = bestTu;
	}

	public String execute()
	{
		TutorialActionService tutorialAS= new TutorialActionService();
		setBestTu(tutorialAS.getBestTutorialSite(getLanguage()));
		return "Success";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
