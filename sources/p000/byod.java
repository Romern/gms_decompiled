package p000;

/* renamed from: byod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byod implements bxvp {
    START_ACTIVITY(0),
    GENERIC_NOTIFICATION(1),
    AUTO(2),
    INVISIBLE(1000);
    

    /* renamed from: e */
    private final int f167194e;

    private byod(int i) {
        this.f167194e = i;
    }

    /* renamed from: a */
    public static byod m125020a(int i) {
        if (i == 0) {
            return START_ACTIVITY;
        }
        if (i == 1) {
            return GENERIC_NOTIFICATION;
        }
        if (i == 2) {
            return AUTO;
        }
        if (i != 1000) {
            return null;
        }
        return INVISIBLE;
    }

    /* renamed from: b */
    public static bxvr m125021b() {
        return byoc.f167188a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f167194e;
    }

    public final String toString() {
        return Integer.toString(this.f167194e);
    }
}
