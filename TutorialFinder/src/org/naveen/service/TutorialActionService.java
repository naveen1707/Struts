package org.naveen.service;

public class TutorialActionService {
	
	public String  getBestTutorialSite(String language)
	{
		if(language.equals("java"))
		{
		return "javaBrains";
		}
		else
		{
			return "Not supported";
		}
	}

}
