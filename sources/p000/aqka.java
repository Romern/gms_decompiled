package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: aqka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqka {
    TERMS_OF_SERVICE(C0126R.string.setupservices_google_terms_of_service_title, "setup_google_tos_url", "https://www.google.com/intl/%s/policies/terms/embedded", "file:///android_asset/html/en_us/google-tos.html"),
    TERMS_OF_SERVICE_AUTO(C0126R.string.setupservices_google_terms_of_service_title, "setup_google_tos_url", "https://policies.google.com/terms/embedded?color_scheme=dark", null),
    TERMS_OF_SERVICE_GERMANY(C0126R.string.setupservices_google_terms_of_service_title, "setup_google_tos_url_germany", "https://accounts.google.com/TOS?loc=DE&hl=de", null),
    PRIVACY_POLICY(C0126R.string.setupservices_google_privacy_policy_title, "setup_google_privacy_url", "https://www.google.com/intl/%s/policies/privacy/embedded", "file:///android_asset/html/en_us/google-privacy.html"),
    PRIVACY_POLICY_AUTO(C0126R.string.setupservices_google_privacy_policy_title, "setup_google_privacy_url", "https://policies.google.com/privacy/embedded?color_scheme=dark", null),
    PRIVACY_POLICY_GERMANY(C0126R.string.setupservices_google_privacy_policy_title, "setup_google_privacy_url_germany", "https://accounts.google.com/TOS?loc=DE&privacy=true", null),
    PRIVACY_POLICY_KIDS(C0126R.string.setupservices_google_privacy_policy_title, "setup_google_privacy_url_kids", "https://support.google.com/families?p=accountpolicies", null),
    ADDITIONAL_PRIVACY_KOREA(C0126R.string.setupservices_additional_privacy_title, "personal_info_url_korea", "https://www.google.co.kr/intl/ko/policies/privacy/additional/", null),
    LOCATION_TOS_KOREA(C0126R.string.setupservices_location_tos_title, "location_tos_url_korea", "https://www.google.co.kr/intl/ko/policies/terms/location/", null),
    APP_PERMISSIONS_KOREA(C0126R.string.setupservices_google_app_permissions_title, "auth_google_app_permissions_url", "https://support.google.com/googleplay/?p=core_app_permissions", null),
    AUTOMOTIVE_MAPS_TOS(C0126R.string.setupservices_auto_maps_tos_title, null, "https://www.google.com/help/terms_maps/", null);
    

    /* renamed from: l */
    public final int f86265l;

    /* renamed from: m */
    public final String f86266m;

    /* renamed from: n */
    public final String f86267n;

    /* renamed from: o */
    public final String f86268o;

    private aqka(int i, String str, String str2, String str3) {
        this.f86265l = i;
        this.f86266m = str;
        this.f86267n = str2;
        this.f86268o = str3;
    }
}
