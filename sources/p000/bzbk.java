package p000;

/* renamed from: bzbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzbk implements bxvp {
    NEARBY_TYPE_UNKNOWN(0),
    NEARBY_PROXIMITY_BEACON(1),
    NEARBY_PHYSICAL_WEB(2),
    NEARBY_CHROMECAST(3),
    NEARBY_WEAR(4),
    NEARBY_DEVICE(6),
    NEARBY_POPULAR_HERE(7);
    

    /* renamed from: h */
    public final int f169257h;

    private bzbk(int i) {
        this.f169257h = i;
    }

    /* renamed from: a */
    public static bzbk m125615a(int i) {
        if (i == 0) {
            return NEARBY_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NEARBY_PROXIMITY_BEACON;
        }
        if (i == 2) {
            return NEARBY_PHYSICAL_WEB;
        }
        if (i == 3) {
            return NEARBY_CHROMECAST;
        }
        if (i == 4) {
            return NEARBY_WEAR;
        }
        if (i == 6) {
            return NEARBY_DEVICE;
        }
        if (i != 7) {
            return null;
        }
        return NEARBY_POPULAR_HERE;
    }

    /* renamed from: b */
    public static bxvr m125616b() {
        return bzbj.f169248a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169257h;
    }

    public final String toString() {
        return Integer.toString(this.f169257h);
    }
}
