package p000;

/* renamed from: btuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btuh implements bxvp {
    PARENT_CONSENT_NOTIFICATION_EVENT_TYPE_UNSPECIFIED(0),
    TEST_NOTIFICATION(1),
    LOCATION_HISTORY_SETTING_TURNED_ON(2),
    LOCATION_HISTORY_SETTING_TURNED_OFF(3),
    LOCATION_REPORTING_SETTING_TURNED_ON(4),
    LOCATION_REPORTING_SETTING_TURNED_OFF(5),
    PHOTOS_AUTOBACKUP_TURNED_ON(6),
    PHOTOS_SHARED_LIBRARY_PROPOSAL(7),
    PHOTOS_SHARED_LIBRARY_SETTINGS_CHANGED(8),
    ANDROID_BACKUP_SETTING_TURNED_ON(9),
    ANDROID_BACKUP_SETTING_TURNED_OFF(10),
    ANDROID_BACKUP_SET_ACCOUNT(11),
    DRIVE_IOS_BACKUP(12),
    PLAY_GAMES_SERVICES_CREATED_ACCOUNT(13),
    PLAY_GAMES_SERVICES_ENABLED_AUTO_SIGNIN(14),
    PLAY_GAMES_SERVICES_ENABLED_DISCOVERABILITY(15),
    PLAY_GAMES_SERVICES_MADE_PROFILE_PUBLIC(16),
    GOOGLE_HOME_UMA_CONSENT(17),
    GOOGLE_HOME_THIRD_PARTY_MEDIA_LINKING_CONSENT(18),
    GOOGLE_WIFI_AP_UMA_CONSENT(19),
    GOOGLE_WIFI_APP_UMA_CONSENT(20),
    GOOGLE_WIFI_CLOUD_SERVICES_CONSENT(21),
    CHROME_SYNC_CONSENT(22),
    GOOGLE_PAY_TERMS_OF_SERVICE_CONSENT(23);
    

    /* renamed from: y */
    public final int f150490y;

    private btuh(int i) {
        this.f150490y = i;
    }

    /* renamed from: a */
    public static btuh m117151a(int i) {
        switch (i) {
            case 0:
                return PARENT_CONSENT_NOTIFICATION_EVENT_TYPE_UNSPECIFIED;
            case 1:
                return TEST_NOTIFICATION;
            case 2:
                return LOCATION_HISTORY_SETTING_TURNED_ON;
            case 3:
                return LOCATION_HISTORY_SETTING_TURNED_OFF;
            case 4:
                return LOCATION_REPORTING_SETTING_TURNED_ON;
            case 5:
                return LOCATION_REPORTING_SETTING_TURNED_OFF;
            case 6:
                return PHOTOS_AUTOBACKUP_TURNED_ON;
            case 7:
                return PHOTOS_SHARED_LIBRARY_PROPOSAL;
            case 8:
                return PHOTOS_SHARED_LIBRARY_SETTINGS_CHANGED;
            case 9:
                return ANDROID_BACKUP_SETTING_TURNED_ON;
            case 10:
                return ANDROID_BACKUP_SETTING_TURNED_OFF;
            case 11:
                return ANDROID_BACKUP_SET_ACCOUNT;
            case 12:
                return DRIVE_IOS_BACKUP;
            case 13:
                return PLAY_GAMES_SERVICES_CREATED_ACCOUNT;
            case 14:
                return PLAY_GAMES_SERVICES_ENABLED_AUTO_SIGNIN;
            case 15:
                return PLAY_GAMES_SERVICES_ENABLED_DISCOVERABILITY;
            case 16:
                return PLAY_GAMES_SERVICES_MADE_PROFILE_PUBLIC;
            case 17:
                return GOOGLE_HOME_UMA_CONSENT;
            case 18:
                return GOOGLE_HOME_THIRD_PARTY_MEDIA_LINKING_CONSENT;
            case 19:
                return GOOGLE_WIFI_AP_UMA_CONSENT;
            case 20:
                return GOOGLE_WIFI_APP_UMA_CONSENT;
            case 21:
                return GOOGLE_WIFI_CLOUD_SERVICES_CONSENT;
            case 22:
                return CHROME_SYNC_CONSENT;
            case 23:
                return GOOGLE_PAY_TERMS_OF_SERVICE_CONSENT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m117152b() {
        return btug.f150464a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f150490y;
    }

    public final String toString() {
        return Integer.toString(this.f150490y);
    }
}
