package p000;

/* renamed from: tni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum tni implements bxvp {
    NOT_SYNCED_MISSING_GCM_ID(1),
    NOT_SYNCED_BUT_READY_TO_SYNC(2),
    SYNCED(3);
    

    /* renamed from: d */
    public final int f46290d;

    private tni(int i) {
        this.f46290d = i;
    }

    /* renamed from: a */
    public static tni m37265a(int i) {
        if (i == 1) {
            return NOT_SYNCED_MISSING_GCM_ID;
        }
        if (i == 2) {
            return NOT_SYNCED_BUT_READY_TO_SYNC;
        }
        if (i != 3) {
            return null;
        }
        return SYNCED;
    }

    /* renamed from: b */
    public static bxvr m37266b() {
        return tnh.f46285a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f46290d;
    }

    public final String toString() {
        return Integer.toString(this.f46290d);
    }
}
