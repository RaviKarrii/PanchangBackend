package com.ravikarri.panchang.swisseph;

public class EphContext {
	private static EphContext instance = null;
	private String language = "ENG";
	
	
	public static EphContext getInstance() {
        if (instance == null) {
            instance = new EphContext();
        }
        return instance;
    }

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	

}
