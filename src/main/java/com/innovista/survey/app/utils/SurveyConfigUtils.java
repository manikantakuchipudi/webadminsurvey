package com.innovista.survey.app.utils;

public class SurveyConfigUtils {
	
	
	public static final String SURVEY_ADMINISTRATION_BASE_PACKAGE = "survey:administration:base-package";
    public static final String SURVEY_ADMINISTRATION_BASE_URL = "survey:administration:base-url";
    public static final String SURVEY_ADMINISTRATION_SECURITY = "SURVEY:administration:security";
    public static final String SURVEY_ADMINISTRATION_SECURITY_LOGOUT_URL = "SURVEY:administration:security-logout-url";
    public static final String SURVEY_ADMINISTRATION_BACK_TO_SITE_URL = "SURVEY:administration:back-to-site-url";
    public static final String SURVEY_ADMINISTRATION_HELP_URL = "SURVEY:administration:help-url";
    public static final String SURVEY_ADMINISTRATION_FILE_STORAGE_PATH = "SURVEY:administration:file-storage";
    public static final String SURVEY_ADMINISTRATION_FILE_STREAMING = "SURVEY:administration:file-streaming";

	public static final String SURVEY_ADMIN_DISPATCHER_NAME = "SURVEYadmin-dispatcher";
    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_SERVLET_NAME = "SURVEYadmin-cusom-resource-servlet";
    public static final String SURVEY_ADMIN_LOGO_RESOURCE_SERVLET_NAME = "SURVEYadmin-logo-resource-servlet";
    public static final String SURVEY_ADMIN_DISPATCHER_REDIRECTOR_NAME = "SURVEYadmin-dispatcher-redirector";

    public static final String SURVEY_ADMIN_SECURITY_LOGOUT_URL_DEFAULT = "/logout";

    public static final String SURVEY_ADMIN_REST_URL_DEFAULT = "/rest";

    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_LOGO = "/images/SURVEYadmin-custom-logo.png";

    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_WEB_INF_LOCATION = "/WEB-INF/SURVEYadmin";
    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_LOGO_WEB_INF_LOCATION = SURVEY_ADMIN_CUSTOM_RESOURCE_WEB_INF_LOCATION + SURVEY_ADMIN_CUSTOM_RESOURCE_LOGO;

    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_FRAGMENT_LOCATION = SURVEY_ADMIN_CUSTOM_RESOURCE_WEB_INF_LOCATION + "/**/*.jsp";

    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_CLASSPATH_LOCATION = "classpath:/META-INF/resources/SURVEYadmin";
    public static final String SURVEY_ADMIN_CUSTOM_RESOURCE_LOGO_CLASSPATH_LOCATION = SURVEY_ADMIN_CUSTOM_RESOURCE_CLASSPATH_LOCATION + SURVEY_ADMIN_CUSTOM_RESOURCE_LOGO;

    public static final String SURVEY_ADMIN_DEFAULT_LOGO_LOCATION = "/images/SURVEYadmin-logo.png";

    public static final String SURVEY_ADMIN_CUSTOM_FRAGMENT_SERVLET_URL = "/dynamic/custom";
    public static final String SURVEY_ADMIN_LOGO_SERVLET_URL = "/dynamic/logo";

    public static final String SURVEY_ADMINISTRATION_BACK_TO_SITE_DEFAULT_URL = "http://SURVEYadmin.org";
    public static final String SURVEY_ADMINISTRATION_HELP_DEFAULT_URL = "http://SURVEYadmin.org/getting-started/";

    public static final String SURVEY_ADMINISTRATION_DEMO_MODE = "SURVEY:administration:demo-mode";


}
