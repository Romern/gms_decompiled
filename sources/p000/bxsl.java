package p000;

/* renamed from: bxsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxsl implements bxvp {
    UNKNOWN_ID(0),
    DEVICE_INFO(7),
    DEVICE_INFO_DEVICE_LEVEL(9),
    LOCATION_HISTORY(2),
    LOCATION_REPORTING(15),
    VOICE_AND_AUDIO(5),
    WEB_AND_APP(1),
    SUPPL_WEB_AND_APP(8),
    SUPPL_WEB_AND_APP_DEVICE_LEVEL(10),
    YT_SEARCH_HISTORY(3),
    YT_WATCH_HISTORY(4);
    

    /* renamed from: l */
    public final int f164712l;

    private bxsl(int i) {
        this.f164712l = i;
    }

    /* renamed from: a */
    public static bxsl m123066a(int i) {
        if (i == 0) {
            return UNKNOWN_ID;
        }
        if (i == 1) {
            return WEB_AND_APP;
        }
        if (i == 2) {
            return LOCATION_HISTORY;
        }
        if (i == 3) {
            return YT_SEARCH_HISTORY;
        }
        if (i == 4) {
            return YT_WATCH_HISTORY;
        }
        if (i == 5) {
            return VOICE_AND_AUDIO;
        }
        if (i == 15) {
            return LOCATION_REPORTING;
        }
        switch (i) {
            case 7:
                return DEVICE_INFO;
            case 8:
                return SUPPL_WEB_AND_APP;
            case 9:
                return DEVICE_INFO_DEVICE_LEVEL;
            case 10:
                return SUPPL_WEB_AND_APP_DEVICE_LEVEL;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f164712l;
    }

    public final String toString() {
        return Integer.toString(this.f164712l);
    }
}
