package p000;

/* renamed from: bloo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bloo implements bxvp {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    

    /* renamed from: h */
    public static final bxvq f127120h = new blom();

    /* renamed from: i */
    public final int f127122i;

    private bloo(int i) {
        this.f127122i = i;
    }

    /* renamed from: a */
    public static bloo m107421a(int i) {
        switch (i) {
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m107422b() {
        return blon.f127112a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127122i;
    }

    public final String toString() {
        return Integer.toString(this.f127122i);
    }
}
