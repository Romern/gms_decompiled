package p000;

/* renamed from: bisn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bisn implements bxvp {
    NAV_FOCUS_NATIVE(1),
    NAV_FOCUS_PROJECTED(2);
    

    /* renamed from: c */
    public final int f121588c;

    private bisn(int i) {
        this.f121588c = i;
    }

    /* renamed from: a */
    public static bisn m102792a(int i) {
        if (i == 1) {
            return NAV_FOCUS_NATIVE;
        }
        if (i != 2) {
            return null;
        }
        return NAV_FOCUS_PROJECTED;
    }

    /* renamed from: b */
    public static bxvr m102793b() {
        return bism.f121584a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121588c;
    }

    public final String toString() {
        return Integer.toString(this.f121588c);
    }
}
