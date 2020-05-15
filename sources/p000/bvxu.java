package p000;

/* renamed from: bvxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvxu implements bxvp {
    CONNECTED(0),
    DISCONNECTED(1);
    

    /* renamed from: c */
    public final int f158103c;

    private bvxu(int i) {
        this.f158103c = i;
    }

    /* renamed from: a */
    public static bvxu m121575a(int i) {
        if (i == 0) {
            return CONNECTED;
        }
        if (i != 1) {
            return null;
        }
        return DISCONNECTED;
    }

    /* renamed from: b */
    public static bxvr m121576b() {
        return bvxt.f158099a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f158103c;
    }

    public final String toString() {
        return Integer.toString(this.f158103c);
    }
}
