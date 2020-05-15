package p000;

/* renamed from: bssc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bssc implements bxvp {
    TEXT_OPT_IN_NAME_UNSPECIFIED(0),
    BACKUP(1),
    LOCATION_SHARING(2),
    LOCATION_WIRELESS_SCAN(3),
    USAGE_REPORTING(4),
    PLAY_EMAIL(5),
    SAFETY_NET(6),
    AUTOMATIC_STORAGE_MANAGER(7),
    WALLPAPER_PERMISSION(8),
    INSTANT_APPS(9);
    

    /* renamed from: k */
    public final int f146838k;

    private bssc(int i) {
        this.f146838k = i;
    }

    /* renamed from: a */
    public static bssc m116141a(int i) {
        switch (i) {
            case 0:
                return TEXT_OPT_IN_NAME_UNSPECIFIED;
            case 1:
                return BACKUP;
            case 2:
                return LOCATION_SHARING;
            case 3:
                return LOCATION_WIRELESS_SCAN;
            case 4:
                return USAGE_REPORTING;
            case 5:
                return PLAY_EMAIL;
            case 6:
                return SAFETY_NET;
            case 7:
                return AUTOMATIC_STORAGE_MANAGER;
            case 8:
                return WALLPAPER_PERMISSION;
            case 9:
                return INSTANT_APPS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m116142b() {
        return bssb.f146826a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f146838k;
    }

    public final String toString() {
        return Integer.toString(this.f146838k);
    }
}
