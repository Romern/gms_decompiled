package p000;

/* renamed from: bofz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bofz implements bxvp {
    UNKNOWN_ACTION(0),
    CLICK_AGREE(1),
    CLICK_CANCEL(2);
    

    /* renamed from: d */
    public final int f132960d;

    private bofz(int i) {
        this.f132960d = i;
    }

    /* renamed from: a */
    public static bofz m111162a(int i) {
        if (i == 0) {
            return UNKNOWN_ACTION;
        }
        if (i == 1) {
            return CLICK_AGREE;
        }
        if (i != 2) {
            return null;
        }
        return CLICK_CANCEL;
    }

    /* renamed from: b */
    public static bxvr m111163b() {
        return bofy.f132955a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f132960d;
    }

    public final String toString() {
        return Integer.toString(this.f132960d);
    }
}
