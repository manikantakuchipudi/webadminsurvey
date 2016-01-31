package com.innovista.survey.app.config;

import java.io.File;
import java.net.URI;

public interface SurveyAppConfiguration {
	
	
	 String getBasePackage();

	    String getApplicationBaseUrl();

	    String getApplicationUrl(String path);

	    URI getApplicationRestBaseUrl();

	    boolean isSecurityEnabled();

	    boolean isDemoMode();

	    String getSecurityLogoutUrl();

	    String getBackToSiteUrl();

	    String getHelpUrl();

	    File getFileStorageDirectory();

	    boolean isFileStreamingEnabled();

}
