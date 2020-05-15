package p000;

/* renamed from: boui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum boui implements bxvp {
    NONE(0),
    WIFI_D2D(1),
    OEM_APP(2);
    

    /* renamed from: d */
    public final int f134929d;

    private boui(int i) {
        this.f134929d = i;
    }

    /* renamed from: a */
    public static boui m111553a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return WIFI_D2D;
        }
        if (i != 2) {
            return null;
        }
        return OEM_APP;
    }

    /* renamed from: b */
    public static bxvr m111554b() {
        return bouh.f134924a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f134929d;
    }

    public final String toString() {
        return Integer.toString(this.f134929d);
    }
}
