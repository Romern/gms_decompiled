package p000;

/* renamed from: amkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amkb implements bxvp {
    UNSPECIFIED(0),
    BEFORE_SYNC(1),
    AFTER_SYNC(2),
    BEFORE_PREPARE_TO_SYNC(3),
    BETWEEN_SYNC_DOWN_AND_SYNC_UP(4);
    

    /* renamed from: f */
    public final int f75052f;

    private amkb(int i) {
        this.f75052f = i;
    }

    /* renamed from: a */
    public static amkb m62994a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return BEFORE_SYNC;
        }
        if (i == 2) {
            return AFTER_SYNC;
        }
        if (i == 3) {
            return BEFORE_PREPARE_TO_SYNC;
        }
        if (i != 4) {
            return null;
        }
        return BETWEEN_SYNC_DOWN_AND_SYNC_UP;
    }

    /* renamed from: b */
    public static bxvr m62995b() {
        return amka.f75045a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75052f;
    }

    public final String toString() {
        return Integer.toString(this.f75052f);
    }
}
