package p000;

/* renamed from: aqcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqcf implements bxvp {
    COMPRESSION_TYPE_UNSPECIFIED(0),
    RAW(1),
    RICE(2);
    

    /* renamed from: d */
    public final int f85648d;

    private aqcf(int i) {
        this.f85648d = i;
    }

    /* renamed from: a */
    public static aqcf m71346a(int i) {
        if (i == 0) {
            return COMPRESSION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return RAW;
        }
        if (i != 2) {
            return null;
        }
        return RICE;
    }

    /* renamed from: b */
    public static bxvr m71347b() {
        return aqce.f85643a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f85648d;
    }

    public final String toString() {
        return Integer.toString(this.f85648d);
    }
}
