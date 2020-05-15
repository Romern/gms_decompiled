package p000;

/* renamed from: bldp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bldp implements bxvp {
    ATTRIBUTE_UNKNOWN(0),
    STARRED(1);
    

    /* renamed from: c */
    public final int f126111c;

    private bldp(int i) {
        this.f126111c = i;
    }

    /* renamed from: a */
    public static bldp m107049a(int i) {
        if (i == 0) {
            return ATTRIBUTE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return STARRED;
    }

    /* renamed from: b */
    public static bxvr m107050b() {
        return bldo.f126107a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f126111c;
    }

    public final String toString() {
        return Integer.toString(this.f126111c);
    }
}
