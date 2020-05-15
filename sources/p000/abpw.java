package p000;

/* renamed from: abpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abpw implements bxvp {
    UNKNOWN(0),
    READ(1),
    WRITE(2);
    

    /* renamed from: d */
    public final int f57915d;

    private abpw(int i) {
        this.f57915d = i;
    }

    /* renamed from: a */
    public static abpw m48055a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return READ;
        }
        if (i != 2) {
            return null;
        }
        return WRITE;
    }

    /* renamed from: b */
    public static bxvr m48056b() {
        return abpv.f57910a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f57915d;
    }

    public final String toString() {
        return Integer.toString(this.f57915d);
    }
}
