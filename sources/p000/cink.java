package p000;

/* renamed from: cink */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cink implements bxvp {
    UNKNOWN(0),
    CRONET(1);
    

    /* renamed from: c */
    public final int f190942c;

    private cink(int i) {
        this.f190942c = i;
    }

    /* renamed from: a */
    public static cink m150634a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    /* renamed from: b */
    public static bxvr m150635b() {
        return cinj.f190938a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f190942c;
    }

    public final String toString() {
        return Integer.toString(this.f190942c);
    }
}
