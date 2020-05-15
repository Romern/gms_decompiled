package p000;

/* renamed from: amke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amke implements bxvp {
    UNKNOWN_STAGE(0),
    GROUP_SYNC_DOWN_PROGRESS(1),
    CONTACT_SYNC_DOWN_PROGRESS(2),
    PHOTO_SYNC_DOWN_PROGRESS(3),
    GROUP_SYNC_UP_PROGRESS(4),
    CONTACT_SYNC_UP_PROGRESS(5),
    PHOTO_SYNC_UP_PROGRESS(6);
    

    /* renamed from: h */
    public final int f75063h;

    private amke(int i) {
        this.f75063h = i;
    }

    /* renamed from: a */
    public static amke m62999a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STAGE;
            case 1:
                return GROUP_SYNC_DOWN_PROGRESS;
            case 2:
                return CONTACT_SYNC_DOWN_PROGRESS;
            case 3:
                return PHOTO_SYNC_DOWN_PROGRESS;
            case 4:
                return GROUP_SYNC_UP_PROGRESS;
            case 5:
                return CONTACT_SYNC_UP_PROGRESS;
            case 6:
                return PHOTO_SYNC_UP_PROGRESS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m63000b() {
        return amkd.f75054a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75063h;
    }

    public final String toString() {
        return Integer.toString(this.f75063h);
    }
}
