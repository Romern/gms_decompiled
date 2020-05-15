package p000;

/* renamed from: blrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blrs implements bxvp {
    TITLE(0),
    ARCHIVED(1),
    DUE_DATE(3),
    EVENT_DATE(4),
    LOCATION(5),
    LOCATION_GROUP(6),
    LOCATION_SNOOZED_UNTIL_MS(7),
    EXTENSIONS(8),
    ARCHIVED_TIME_MS(10),
    ASSISTANCE(11),
    COPRESENCE(12),
    DELETED(13),
    PINNED(14),
    SNOOZED(15),
    SNOOZED_TIME_MILLIS(16),
    SCHEDULING_CRITERIA(17),
    DURATION(18);
    

    /* renamed from: r */
    public final int f127523r;

    private blrs(int i) {
        this.f127523r = i;
    }

    /* renamed from: a */
    public static blrs m107507a(int i) {
        switch (i) {
            case 0:
                return TITLE;
            case 1:
                return ARCHIVED;
            case 2:
            case 9:
            default:
                return null;
            case 3:
                return DUE_DATE;
            case 4:
                return EVENT_DATE;
            case 5:
                return LOCATION;
            case 6:
                return LOCATION_GROUP;
            case 7:
                return LOCATION_SNOOZED_UNTIL_MS;
            case 8:
                return EXTENSIONS;
            case 10:
                return ARCHIVED_TIME_MS;
            case 11:
                return ASSISTANCE;
            case 12:
                return COPRESENCE;
            case 13:
                return DELETED;
            case 14:
                return PINNED;
            case 15:
                return SNOOZED;
            case 16:
                return SNOOZED_TIME_MILLIS;
            case 17:
                return SCHEDULING_CRITERIA;
            case 18:
                return DURATION;
        }
    }

    /* renamed from: b */
    public static bxvr m107508b() {
        return blrr.f127504a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127523r;
    }

    public final String toString() {
        return Integer.toString(this.f127523r);
    }
}
