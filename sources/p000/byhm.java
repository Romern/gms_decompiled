package p000;

/* renamed from: byhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byhm implements bxvp {
    UNKNOWN(0),
    SYNC_FULL_SNAPSHOT(1),
    SYNC_LATEST_PER_SECONDARY_ID(2),
    SYNC_COMBINED(3);
    

    /* renamed from: e */
    public final int f166477e;

    private byhm(int i) {
        this.f166477e = i;
    }

    /* renamed from: a */
    public static byhm m124816a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYNC_FULL_SNAPSHOT;
        }
        if (i == 2) {
            return SYNC_LATEST_PER_SECONDARY_ID;
        }
        if (i != 3) {
            return null;
        }
        return SYNC_COMBINED;
    }

    /* renamed from: b */
    public static bxvr m124817b() {
        return byhl.f166471a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166477e;
    }

    public final String toString() {
        return Integer.toString(this.f166477e);
    }
}
