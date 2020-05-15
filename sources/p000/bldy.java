package p000;

/* renamed from: bldy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bldy implements bxvp {
    UNKNOWN(0),
    OWNER(1),
    PUBLIC_READ(2),
    DOMAIN_READ(3),
    YOUR_CIRCLES_READ(4),
    EXTENDED_CIRCLES_READ(5);
    

    /* renamed from: g */
    public final int f126158g;

    private bldy(int i) {
        this.f126158g = i;
    }

    /* renamed from: a */
    public static bldy m107060a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OWNER;
        }
        if (i == 2) {
            return PUBLIC_READ;
        }
        if (i == 3) {
            return DOMAIN_READ;
        }
        if (i == 4) {
            return YOUR_CIRCLES_READ;
        }
        if (i != 5) {
            return null;
        }
        return EXTENDED_CIRCLES_READ;
    }

    /* renamed from: b */
    public static bxvr m107061b() {
        return bldx.f126150a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f126158g;
    }

    public final String toString() {
        return Integer.toString(this.f126158g);
    }
}
